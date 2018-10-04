package org.webrtc;

import java.util.ArrayList;
import java.util.List;

public class MediaConstraints {
    public final List mandatory = new ArrayList();
    public final List optional = new ArrayList();

    public class KeyValuePair {
        private final String key;
        private final String value;

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (obj != null) {
                    if (getClass() == obj.getClass()) {
                        KeyValuePair keyValuePair = (KeyValuePair) obj;
                        if (!this.key.equals(keyValuePair.key) || !this.value.equals(keyValuePair.value)) {
                            z = false;
                        }
                    }
                }
                return false;
            }
            return z;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.key.hashCode() + this.value.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append(": ");
            stringBuilder.append(this.value);
            return stringBuilder.toString();
        }
    }

    public List getMandatory() {
        return this.mandatory;
    }

    public List getOptional() {
        return this.optional;
    }

    private static String stringifyKeyValuePairList(List list) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (KeyValuePair keyValuePair : list) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(keyValuePair.toString());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mandatory: ");
        stringBuilder.append(stringifyKeyValuePairList(this.mandatory));
        stringBuilder.append(", optional: ");
        stringBuilder.append(stringifyKeyValuePairList(this.optional));
        return stringBuilder.toString();
    }
}
