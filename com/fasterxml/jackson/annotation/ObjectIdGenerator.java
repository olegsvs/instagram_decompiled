package com.fasterxml.jackson.annotation;

import java.io.Serializable;

public abstract class ObjectIdGenerator implements Serializable {

    public final class IdKey implements Serializable {
        private static final long serialVersionUID = 1;
        private final int hashCode;
        private final Object key;
        private final Class scope;
        private final Class type;

        public IdKey(Class cls, Class cls2, Object obj) {
            this.type = cls;
            this.scope = cls2;
            this.key = obj;
            int hashCode = obj.hashCode() + cls.getName().hashCode();
            if (cls2 != null) {
                hashCode ^= cls2.getName().hashCode();
            }
            this.hashCode = hashCode;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj != this) {
                if (obj != null) {
                    if (obj.getClass() == getClass()) {
                        IdKey idKey = (IdKey) obj;
                        if (!idKey.key.equals(this.key) || idKey.type != this.type || idKey.scope != this.scope) {
                            z = false;
                        }
                    }
                }
                return false;
            }
            return z;
        }

        public int hashCode() {
            return this.hashCode;
        }
    }

    public abstract boolean canUseFor(ObjectIdGenerator objectIdGenerator);

    public abstract ObjectIdGenerator forScope(Class cls);

    public abstract Object generateId(Object obj);

    public abstract Class getScope();

    public abstract IdKey key(Object obj);

    public abstract ObjectIdGenerator newForSerialization(Object obj);
}
