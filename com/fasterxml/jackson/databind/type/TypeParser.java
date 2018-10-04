package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    public final TypeFactory _factory;

    public final class MyTokenizer extends StringTokenizer {
        public int _index;
        public final String _input;
        public String _pushbackToken;

        public MyTokenizer(String str) {
            super(str, "<,>", true);
            this._input = str;
        }

        public String getAllInput() {
            return this._input;
        }

        public String getRemainingInput() {
            return this._input.substring(this._index);
        }

        public String getUsedInput() {
            return this._input.substring(0, this._index);
        }

        public boolean hasMoreTokens() {
            if (this._pushbackToken == null) {
                if (!super.hasMoreTokens()) {
                    return false;
                }
            }
            return true;
        }

        public String nextToken() {
            String str = this._pushbackToken;
            if (str != null) {
                this._pushbackToken = null;
            } else {
                str = super.nextToken();
            }
            this._index += str.length();
            return str;
        }

        public void pushBack(String str) {
            this._pushbackToken = str;
            this._index -= str.length();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public IllegalArgumentException _problem(MyTokenizer myTokenizer, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse type '");
        stringBuilder.append(myTokenizer.getAllInput());
        stringBuilder.append("' (remaining: '");
        stringBuilder.append(myTokenizer.getRemainingInput());
        stringBuilder.append("'): ");
        stringBuilder.append(str);
        return new IllegalArgumentException(stringBuilder.toString());
    }

    public Class findClass(String str, MyTokenizer myTokenizer) {
        try {
            return ClassUtil.findClass(str);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not locate class '");
            stringBuilder.append(str);
            stringBuilder.append("', problem: ");
            stringBuilder.append(e.getMessage());
            throw _problem(myTokenizer, stringBuilder.toString());
        }
    }

    public JavaType parse(String str) {
        MyTokenizer myTokenizer = new MyTokenizer(str.trim());
        JavaType parseType = parseType(myTokenizer);
        if (!myTokenizer.hasMoreTokens()) {
            return parseType;
        }
        throw _problem(myTokenizer, "Unexpected tokens after complete type");
    }

    public JavaType parseType(MyTokenizer myTokenizer) {
        if (myTokenizer.hasMoreTokens()) {
            Class findClass = findClass(myTokenizer.nextToken(), myTokenizer);
            if (myTokenizer.hasMoreTokens()) {
                String nextToken = myTokenizer.nextToken();
                if ("<".equals(nextToken)) {
                    return this._factory._fromParameterizedClass(findClass, parseTypes(myTokenizer));
                }
                myTokenizer.pushBack(nextToken);
            }
            return this._factory._fromClass(findClass, null);
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }

    public List parseTypes(MyTokenizer myTokenizer) {
        List arrayList = new ArrayList();
        while (myTokenizer.hasMoreTokens()) {
            arrayList.add(parseType(myTokenizer));
            if (!myTokenizer.hasMoreTokens()) {
                break;
            }
            String nextToken = myTokenizer.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected token '");
                stringBuilder.append(nextToken);
                stringBuilder.append("', expected ',' or '>')");
                throw _problem(myTokenizer, stringBuilder.toString());
            }
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }
}
