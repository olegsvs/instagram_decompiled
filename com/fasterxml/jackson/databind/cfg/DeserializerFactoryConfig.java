package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.Serializable;

public class DeserializerFactoryConfig implements Serializable {
    public static final KeyDeserializers[] DEFAULT_KEY_DESERIALIZERS = new KeyDeserializers[]{new StdKeyDeserializers()};
    public static final AbstractTypeResolver[] NO_ABSTRACT_TYPE_RESOLVERS = new AbstractTypeResolver[0];
    public static final Deserializers[] NO_DESERIALIZERS = new Deserializers[0];
    public static final BeanDeserializerModifier[] NO_MODIFIERS = new BeanDeserializerModifier[0];
    public static final ValueInstantiators[] NO_VALUE_INSTANTIATORS = new ValueInstantiators[0];
    private static final long serialVersionUID = 3683541151102256824L;
    public final AbstractTypeResolver[] _abstractTypeResolvers;
    public final Deserializers[] _additionalDeserializers;
    public final KeyDeserializers[] _additionalKeyDeserializers;
    public final BeanDeserializerModifier[] _modifiers;
    public final ValueInstantiators[] _valueInstantiators;

    public DeserializerFactoryConfig() {
        this(null, null, null, null, null);
    }

    public DeserializerFactoryConfig(Deserializers[] deserializersArr, KeyDeserializers[] keyDeserializersArr, BeanDeserializerModifier[] beanDeserializerModifierArr, AbstractTypeResolver[] abstractTypeResolverArr, ValueInstantiators[] valueInstantiatorsArr) {
        if (deserializersArr == null) {
            deserializersArr = NO_DESERIALIZERS;
        }
        this._additionalDeserializers = deserializersArr;
        if (keyDeserializersArr == null) {
            keyDeserializersArr = DEFAULT_KEY_DESERIALIZERS;
        }
        this._additionalKeyDeserializers = keyDeserializersArr;
        if (beanDeserializerModifierArr == null) {
            beanDeserializerModifierArr = NO_MODIFIERS;
        }
        this._modifiers = beanDeserializerModifierArr;
        if (abstractTypeResolverArr == null) {
            abstractTypeResolverArr = NO_ABSTRACT_TYPE_RESOLVERS;
        }
        this._abstractTypeResolvers = abstractTypeResolverArr;
        if (valueInstantiatorsArr == null) {
            valueInstantiatorsArr = NO_VALUE_INSTANTIATORS;
        }
        this._valueInstantiators = valueInstantiatorsArr;
    }

    public Iterable abstractTypeResolvers() {
        return ArrayBuilders.arrayAsIterable(this._abstractTypeResolvers);
    }

    public Iterable deserializerModifiers() {
        return ArrayBuilders.arrayAsIterable(this._modifiers);
    }

    public Iterable deserializers() {
        return ArrayBuilders.arrayAsIterable(this._additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers() {
        return this._abstractTypeResolvers.length > 0;
    }

    public boolean hasDeserializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasDeserializers() {
        return this._additionalDeserializers.length > 0;
    }

    public boolean hasKeyDeserializers() {
        return this._additionalKeyDeserializers.length > 0;
    }

    public boolean hasValueInstantiators() {
        return this._valueInstantiators.length > 0;
    }

    public Iterable keyDeserializers() {
        return ArrayBuilders.arrayAsIterable(this._additionalKeyDeserializers);
    }

    public Iterable valueInstantiators() {
        return ArrayBuilders.arrayAsIterable(this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        if (abstractTypeResolver != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, (AbstractTypeResolver[]) ArrayBuilders.insertInListNoDup(this._abstractTypeResolvers, abstractTypeResolver), this._valueInstantiators);
        }
        throw new IllegalArgumentException("Can not pass null resolver");
    }

    public DeserializerFactoryConfig withAdditionalDeserializers(Deserializers deserializers) {
        if (deserializers != null) {
            return new DeserializerFactoryConfig((Deserializers[]) ArrayBuilders.insertInListNoDup(this._additionalDeserializers, deserializers), this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Can not pass null Deserializers");
    }

    public DeserializerFactoryConfig withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        if (keyDeserializers != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, (KeyDeserializers[]) ArrayBuilders.insertInListNoDup(this._additionalKeyDeserializers, keyDeserializers), this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Can not pass null KeyDeserializers");
    }

    public DeserializerFactoryConfig withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        if (beanDeserializerModifier != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, (BeanDeserializerModifier[]) ArrayBuilders.insertInListNoDup(this._modifiers, beanDeserializerModifier), this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Can not pass null modifier");
    }

    public DeserializerFactoryConfig withValueInstantiators(ValueInstantiators valueInstantiators) {
        if (valueInstantiators != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, (ValueInstantiators[]) ArrayBuilders.insertInListNoDup(this._valueInstantiators, valueInstantiators));
        }
        throw new IllegalArgumentException("Can not pass null resolver");
    }
}
