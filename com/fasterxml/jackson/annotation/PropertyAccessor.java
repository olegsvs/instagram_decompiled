package com.fasterxml.jackson.annotation;

public enum PropertyAccessor {
    GETTER,
    SETTER,
    CREATOR,
    FIELD,
    IS_GETTER,
    NONE,
    ALL;

    public boolean creatorEnabled() {
        if (this != CREATOR) {
            if (this != ALL) {
                return false;
            }
        }
        return true;
    }

    public boolean fieldEnabled() {
        if (this != FIELD) {
            if (this != ALL) {
                return false;
            }
        }
        return true;
    }

    public boolean getterEnabled() {
        if (this != GETTER) {
            if (this != ALL) {
                return false;
            }
        }
        return true;
    }

    public boolean isGetterEnabled() {
        if (this != IS_GETTER) {
            if (this != ALL) {
                return false;
            }
        }
        return true;
    }

    public boolean setterEnabled() {
        if (this != SETTER) {
            if (this != ALL) {
                return false;
            }
        }
        return true;
    }
}
