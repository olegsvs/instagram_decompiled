package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SimpleModule extends Module implements Serializable {
    private static final long serialVersionUID = 3132264350026957446L;
    public SimpleAbstractTypeResolver _abstractTypes;
    public BeanDeserializerModifier _deserializerModifier;
    public SimpleDeserializers _deserializers;
    public SimpleKeyDeserializers _keyDeserializers;
    public SimpleSerializers _keySerializers;
    public HashMap _mixins;
    public final String _name;
    public BeanSerializerModifier _serializerModifier;
    public SimpleSerializers _serializers;
    public LinkedHashSet _subtypes;
    public SimpleValueInstantiators _valueInstantiators;
    public final Version _version;

    public SimpleModule() {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SimpleModule-");
        stringBuilder.append(System.identityHashCode(this));
        this._name = stringBuilder.toString();
        this._version = Version.unknownVersion();
    }

    public SimpleModule(Version version) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._name = version.getArtifactId();
        this._version = version;
    }

    public SimpleModule(String str) {
        this(str, Version.unknownVersion());
    }

    public SimpleModule(String str, Version version) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._name = str;
        this._version = version;
    }

    public SimpleModule(String str, Version version, List list) {
        this(str, version, null, list);
    }

    public SimpleModule(String str, Version version, Map map) {
        this(str, version, map, null);
    }

    public SimpleModule(String str, Version version, Map map, List list) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._name = str;
        this._version = version;
        if (map != null) {
            this._deserializers = new SimpleDeserializers(map);
        }
        if (list != null) {
            this._serializers = new SimpleSerializers(list);
        }
    }

    public SimpleModule addAbstractTypeMapping(Class cls, Class cls2) {
        if (this._abstractTypes == null) {
            this._abstractTypes = new SimpleAbstractTypeResolver();
        }
        this._abstractTypes = this._abstractTypes.addMapping(cls, cls2);
        return this;
    }

    public SimpleModule addDeserializer(Class cls, JsonDeserializer jsonDeserializer) {
        if (this._deserializers == null) {
            this._deserializers = new SimpleDeserializers();
        }
        this._deserializers.addDeserializer(cls, jsonDeserializer);
        return this;
    }

    public SimpleModule addKeyDeserializer(Class cls, KeyDeserializer keyDeserializer) {
        if (this._keyDeserializers == null) {
            this._keyDeserializers = new SimpleKeyDeserializers();
        }
        this._keyDeserializers.addDeserializer(cls, keyDeserializer);
        return this;
    }

    public SimpleModule addKeySerializer(Class cls, JsonSerializer jsonSerializer) {
        if (this._keySerializers == null) {
            this._keySerializers = new SimpleSerializers();
        }
        this._keySerializers.addSerializer(cls, jsonSerializer);
        return this;
    }

    public SimpleModule addSerializer(JsonSerializer jsonSerializer) {
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(jsonSerializer);
        return this;
    }

    public SimpleModule addSerializer(Class cls, JsonSerializer jsonSerializer) {
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(cls, jsonSerializer);
        return this;
    }

    public SimpleModule addValueInstantiator(Class cls, ValueInstantiator valueInstantiator) {
        if (this._valueInstantiators == null) {
            this._valueInstantiators = new SimpleValueInstantiators();
        }
        this._valueInstantiators = this._valueInstantiators.addValueInstantiator(cls, valueInstantiator);
        return this;
    }

    public String getModuleName() {
        return this._name;
    }

    public SimpleModule registerSubtypes(NamedType... namedTypeArr) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet(Math.max(16, namedTypeArr.length));
        }
        for (Object add : namedTypeArr) {
            this._subtypes.add(add);
        }
        return this;
    }

    public SimpleModule registerSubtypes(Class... clsArr) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet(Math.max(16, clsArr.length));
        }
        for (Class namedType : clsArr) {
            this._subtypes.add(new NamedType(namedType));
        }
        return this;
    }

    public void setAbstractTypes(SimpleAbstractTypeResolver simpleAbstractTypeResolver) {
        this._abstractTypes = simpleAbstractTypeResolver;
    }

    public SimpleModule setDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        this._deserializerModifier = beanDeserializerModifier;
        return this;
    }

    public void setDeserializers(SimpleDeserializers simpleDeserializers) {
        this._deserializers = simpleDeserializers;
    }

    public void setKeyDeserializers(SimpleKeyDeserializers simpleKeyDeserializers) {
        this._keyDeserializers = simpleKeyDeserializers;
    }

    public void setKeySerializers(SimpleSerializers simpleSerializers) {
        this._keySerializers = simpleSerializers;
    }

    public SimpleModule setMixInAnnotation(Class cls, Class cls2) {
        if (this._mixins == null) {
            this._mixins = new HashMap();
        }
        this._mixins.put(cls, cls2);
        return this;
    }

    public SimpleModule setSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        this._serializerModifier = beanSerializerModifier;
        return this;
    }

    public void setSerializers(SimpleSerializers simpleSerializers) {
        this._serializers = simpleSerializers;
    }

    public void setValueInstantiators(SimpleValueInstantiators simpleValueInstantiators) {
        this._valueInstantiators = simpleValueInstantiators;
    }

    public void setupModule(SetupContext setupContext) {
        Serializers serializers = this._serializers;
        if (serializers != null) {
            setupContext.addSerializers(serializers);
        }
        Deserializers deserializers = this._deserializers;
        if (deserializers != null) {
            setupContext.addDeserializers(deserializers);
        }
        serializers = this._keySerializers;
        if (serializers != null) {
            setupContext.addKeySerializers(serializers);
        }
        KeyDeserializers keyDeserializers = this._keyDeserializers;
        if (keyDeserializers != null) {
            setupContext.addKeyDeserializers(keyDeserializers);
        }
        AbstractTypeResolver abstractTypeResolver = this._abstractTypes;
        if (abstractTypeResolver != null) {
            setupContext.addAbstractTypeResolver(abstractTypeResolver);
        }
        ValueInstantiators valueInstantiators = this._valueInstantiators;
        if (valueInstantiators != null) {
            setupContext.addValueInstantiators(valueInstantiators);
        }
        BeanDeserializerModifier beanDeserializerModifier = this._deserializerModifier;
        if (beanDeserializerModifier != null) {
            setupContext.addBeanDeserializerModifier(beanDeserializerModifier);
        }
        BeanSerializerModifier beanSerializerModifier = this._serializerModifier;
        if (beanSerializerModifier != null) {
            setupContext.addBeanSerializerModifier(beanSerializerModifier);
        }
        LinkedHashSet linkedHashSet = this._subtypes;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet linkedHashSet2 = this._subtypes;
            setupContext.registerSubtypes((NamedType[]) linkedHashSet2.toArray(new NamedType[linkedHashSet2.size()]));
        }
        HashMap hashMap = this._mixins;
        if (hashMap != null) {
            for (Entry entry : hashMap.entrySet()) {
                setupContext.setMixInAnnotations((Class) entry.getKey(), (Class) entry.getValue());
            }
        }
    }

    public Version version() {
        return this._version;
    }
}
