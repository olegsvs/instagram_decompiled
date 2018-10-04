package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import java.util.HashMap;

public final class SerializerCache {
    private ReadOnlyClassToSerializerMap _readOnlyMap = null;
    private HashMap _sharedMap = new HashMap(64);

    public final class TypeKey {
        public Class _class;
        public int _hashCode;
        public boolean _isTyped;
        public JavaType _type;

        public TypeKey(JavaType javaType, boolean z) {
            this._type = javaType;
            this._class = null;
            this._isTyped = z;
            this._hashCode = hash(javaType, z);
        }

        public TypeKey(Class cls, boolean z) {
            this._class = cls;
            this._type = null;
            this._isTyped = z;
            this._hashCode = hash(cls, z);
        }

        public final boolean equals(Object obj) {
            boolean z = false;
            if (obj != null) {
                if (obj == this) {
                    return true;
                }
                if (obj.getClass() == getClass()) {
                    TypeKey typeKey = (TypeKey) obj;
                    if (typeKey._isTyped == this._isTyped) {
                        Class cls = this._class;
                        if (cls == null) {
                            return this._type.equals(typeKey._type);
                        }
                        if (typeKey._class == cls) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }

        private static final int hash(JavaType javaType, boolean z) {
            javaType = javaType.hashCode() - 1;
            return z ? javaType - 1 : javaType;
        }

        private static final int hash(Class cls, boolean z) {
            cls = cls.getName().hashCode();
            return z ? cls + 1 : cls;
        }

        public final int hashCode() {
            return this._hashCode;
        }

        public void resetTyped(JavaType javaType) {
            this._type = javaType;
            this._class = null;
            this._isTyped = true;
            this._hashCode = hash(javaType, true);
        }

        public void resetTyped(Class cls) {
            this._type = null;
            this._class = cls;
            this._isTyped = true;
            this._hashCode = hash(cls, true);
        }

        public void resetUntyped(JavaType javaType) {
            this._type = javaType;
            this._class = null;
            this._isTyped = false;
            this._hashCode = hash(javaType, false);
        }

        public void resetUntyped(Class cls) {
            this._type = null;
            this._class = cls;
            this._isTyped = false;
            this._hashCode = hash(cls, false);
        }

        public final String toString() {
            if (this._class != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("{class: ");
                stringBuilder.append(this._class.getName());
                stringBuilder.append(", typed? ");
                stringBuilder.append(this._isTyped);
                stringBuilder.append("}");
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("{type: ");
            stringBuilder.append(this._type);
            stringBuilder.append(", typed? ");
            stringBuilder.append(this._isTyped);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public void addAndResolveNonTypedSerializer(JavaType javaType, JsonSerializer jsonSerializer, SerializerProvider serializerProvider) {
        synchronized (this) {
            if (this._sharedMap.put(new TypeKey(javaType, false), jsonSerializer) == null) {
                this._readOnlyMap = null;
            }
            if (jsonSerializer instanceof ResolvableSerializer) {
                ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
            }
        }
    }

    public void addAndResolveNonTypedSerializer(Class cls, JsonSerializer jsonSerializer, SerializerProvider serializerProvider) {
        synchronized (this) {
            if (this._sharedMap.put(new TypeKey(cls, false), jsonSerializer) == null) {
                this._readOnlyMap = null;
            }
            if (jsonSerializer instanceof ResolvableSerializer) {
                ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
            }
        }
    }

    public void addTypedSerializer(JavaType javaType, JsonSerializer jsonSerializer) {
        synchronized (this) {
            if (this._sharedMap.put(new TypeKey(javaType, true), jsonSerializer) == null) {
                this._readOnlyMap = null;
            }
        }
    }

    public void addTypedSerializer(Class cls, JsonSerializer jsonSerializer) {
        synchronized (this) {
            if (this._sharedMap.put(new TypeKey(cls, true), jsonSerializer) == null) {
                this._readOnlyMap = null;
            }
        }
    }

    public synchronized void flush() {
        this._sharedMap.clear();
    }

    public ReadOnlyClassToSerializerMap getReadOnlyLookupMap() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap;
        synchronized (this) {
            readOnlyClassToSerializerMap = this._readOnlyMap;
            if (readOnlyClassToSerializerMap == null) {
                readOnlyClassToSerializerMap = ReadOnlyClassToSerializerMap.from(this._sharedMap);
                this._readOnlyMap = readOnlyClassToSerializerMap;
            }
        }
        return readOnlyClassToSerializerMap.instance();
    }

    public synchronized int size() {
        return this._sharedMap.size();
    }

    public JsonSerializer typedValueSerializer(JavaType javaType) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this._sharedMap.get(new TypeKey(javaType, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer typedValueSerializer(Class cls) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this._sharedMap.get(new TypeKey(cls, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer untypedValueSerializer(JavaType javaType) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this._sharedMap.get(new TypeKey(javaType, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer untypedValueSerializer(Class cls) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this._sharedMap.get(new TypeKey(cls, false));
        }
        return jsonSerializer;
    }
}
