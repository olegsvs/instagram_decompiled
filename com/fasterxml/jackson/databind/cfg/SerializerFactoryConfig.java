package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.Serializable;

public final class SerializerFactoryConfig implements Serializable {
    public static final BeanSerializerModifier[] NO_MODIFIERS = new BeanSerializerModifier[0];
    public static final Serializers[] NO_SERIALIZERS = new Serializers[0];
    private static final long serialVersionUID = 1;
    public final Serializers[] _additionalKeySerializers;
    public final Serializers[] _additionalSerializers;
    public final BeanSerializerModifier[] _modifiers;

    public SerializerFactoryConfig() {
        this(null, null, null);
    }

    public SerializerFactoryConfig(Serializers[] serializersArr, Serializers[] serializersArr2, BeanSerializerModifier[] beanSerializerModifierArr) {
        if (serializersArr == null) {
            serializersArr = NO_SERIALIZERS;
        }
        this._additionalSerializers = serializersArr;
        if (serializersArr2 == null) {
            serializersArr2 = NO_SERIALIZERS;
        }
        this._additionalKeySerializers = serializersArr2;
        if (beanSerializerModifierArr == null) {
            beanSerializerModifierArr = NO_MODIFIERS;
        }
        this._modifiers = beanSerializerModifierArr;
    }

    public boolean hasKeySerializers() {
        return this._additionalKeySerializers.length > 0;
    }

    public boolean hasSerializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasSerializers() {
        return this._additionalSerializers.length > 0;
    }

    public Iterable keySerializers() {
        return ArrayBuilders.arrayAsIterable(this._additionalKeySerializers);
    }

    public Iterable serializerModifiers() {
        return ArrayBuilders.arrayAsIterable(this._modifiers);
    }

    public Iterable serializers() {
        return ArrayBuilders.arrayAsIterable(this._additionalSerializers);
    }

    public SerializerFactoryConfig withAdditionalKeySerializers(Serializers serializers) {
        if (serializers != null) {
            return new SerializerFactoryConfig(this._additionalSerializers, (Serializers[]) ArrayBuilders.insertInListNoDup(this._additionalKeySerializers, serializers), this._modifiers);
        }
        throw new IllegalArgumentException("Can not pass null Serializers");
    }

    public SerializerFactoryConfig withAdditionalSerializers(Serializers serializers) {
        if (serializers != null) {
            return new SerializerFactoryConfig((Serializers[]) ArrayBuilders.insertInListNoDup(this._additionalSerializers, serializers), this._additionalKeySerializers, this._modifiers);
        }
        throw new IllegalArgumentException("Can not pass null Serializers");
    }

    public SerializerFactoryConfig withSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        if (beanSerializerModifier != null) {
            return new SerializerFactoryConfig(this._additionalSerializers, this._additionalKeySerializers, (BeanSerializerModifier[]) ArrayBuilders.insertInListNoDup(this._modifiers, beanSerializerModifier));
        }
        throw new IllegalArgumentException("Can not pass null modifier");
    }
}
