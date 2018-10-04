package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JsonMappingException extends JsonProcessingException {
    public static final int MAX_REFS_TO_LIST = 1000;
    private static final long serialVersionUID = 1;
    public LinkedList _path;

    public class Reference implements Serializable {
        private static final long serialVersionUID = 1;
        public String _fieldName;
        public Object _from;
        public int _index = -1;

        public Reference(Object obj) {
            this._from = obj;
        }

        public Reference(Object obj, int i) {
            this._from = obj;
            this._index = i;
        }

        public Reference(Object obj, String str) {
            this._from = obj;
            if (str != null) {
                this._fieldName = str;
                return;
            }
            throw new NullPointerException("Can not pass null fieldName");
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public Object getFrom() {
            return this._from;
        }

        public int getIndex() {
            return this._index;
        }

        public void setFieldName(String str) {
            this._fieldName = str;
        }

        public void setFrom(Object obj) {
            this._from = obj;
        }

        public void setIndex(int i) {
            this._index = i;
        }

        public String toString() {
            Class cls;
            StringBuilder stringBuilder = new StringBuilder();
            Object obj = this._from;
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            Package packageR = cls.getPackage();
            if (packageR != null) {
                stringBuilder.append(packageR.getName());
                stringBuilder.append('.');
            }
            stringBuilder.append(cls.getSimpleName());
            stringBuilder.append('[');
            if (this._fieldName != null) {
                stringBuilder.append('\"');
                stringBuilder.append(this._fieldName);
                stringBuilder.append('\"');
            } else {
                int i = this._index;
                if (i >= 0) {
                    stringBuilder.append(i);
                } else {
                    stringBuilder.append('?');
                }
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    public JsonMappingException(String str) {
        super(str);
    }

    public JsonMappingException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }

    public JsonMappingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    public JsonMappingException(String str, Throwable th) {
        super(str, th);
    }

    public void _appendPathDesc(StringBuilder stringBuilder) {
        LinkedList linkedList = this._path;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                stringBuilder.append(((Reference) it.next()).toString());
                if (it.hasNext()) {
                    stringBuilder.append("->");
                }
            }
        }
    }

    public String _buildMessage() {
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        StringBuilder stringBuilder = message == null ? new StringBuilder() : new StringBuilder(message);
        stringBuilder.append(" (through reference chain: ");
        stringBuilder = getPathReference(stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static JsonMappingException from(JsonParser jsonParser, String str) {
        return new JsonMappingException(str, jsonParser == null ? null : jsonParser.getTokenLocation());
    }

    public static JsonMappingException from(JsonParser jsonParser, String str, Throwable th) {
        return new JsonMappingException(str, jsonParser == null ? null : jsonParser.getTokenLocation(), th);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException iOException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected IOException (of type ");
        stringBuilder.append(iOException.getClass().getName());
        stringBuilder.append("): ");
        stringBuilder.append(iOException.getMessage());
        return new JsonMappingException(stringBuilder.toString(), (JsonLocation) null, iOException);
    }

    public String getLocalizedMessage() {
        return _buildMessage();
    }

    public String getMessage() {
        return _buildMessage();
    }

    public List getPath() {
        List list = this._path;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    public StringBuilder getPathReference(StringBuilder stringBuilder) {
        _appendPathDesc(stringBuilder);
        return stringBuilder;
    }

    public void prependPath(Reference reference) {
        if (this._path == null) {
            this._path = new LinkedList();
        }
        if (this._path.size() < MAX_REFS_TO_LIST) {
            this._path.addFirst(reference);
        }
    }

    public void prependPath(Object obj, int i) {
        prependPath(new Reference(obj, i));
    }

    public void prependPath(Object obj, String str) {
        prependPath(new Reference(obj, str));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(getMessage());
        return stringBuilder.toString();
    }

    public static JsonMappingException wrapWithPath(Throwable th, Reference reference) {
        if (th instanceof JsonMappingException) {
            th = (JsonMappingException) th;
        } else {
            String message = th.getMessage();
            if (message == null || message.length() == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("(was ");
                stringBuilder.append(th.getClass().getName());
                stringBuilder.append(")");
                message = stringBuilder.toString();
            }
            th = new JsonMappingException(message, null, th);
        }
        th.prependPath(reference);
        return th;
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, int i) {
        return wrapWithPath(th, new Reference(obj, i));
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, String str) {
        return wrapWithPath(th, new Reference(obj, str));
    }
}
