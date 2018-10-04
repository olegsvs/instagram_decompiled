package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import java.util.List;

public class BeanSerializerBuilder {
    private static final BeanPropertyWriter[] NO_PROPERTIES = new BeanPropertyWriter[0];
    public AnyGetterWriter _anyGetter;
    public final BeanDescription _beanDesc;
    public SerializationConfig _config;
    public Object _filterId;
    public BeanPropertyWriter[] _filteredProperties;
    public ObjectIdWriter _objectIdWriter;
    public List _properties;
    public AnnotatedMember _typeId;

    public BeanSerializerBuilder(BeanDescription beanDescription) {
        this._beanDesc = beanDescription;
    }

    public BeanSerializerBuilder(BeanSerializerBuilder beanSerializerBuilder) {
        this._beanDesc = beanSerializerBuilder._beanDesc;
        this._properties = beanSerializerBuilder._properties;
        this._filteredProperties = beanSerializerBuilder._filteredProperties;
        this._anyGetter = beanSerializerBuilder._anyGetter;
        this._filterId = beanSerializerBuilder._filterId;
    }

    public JsonSerializer build() {
        List list = this._properties;
        if (list != null) {
            if (!list.isEmpty()) {
                List list2 = this._properties;
                BeanPropertyWriter[] beanPropertyWriterArr = (BeanPropertyWriter[]) list2.toArray(new BeanPropertyWriter[list2.size()]);
                return new BeanSerializer(this._beanDesc.getType(), this, beanPropertyWriterArr, this._filteredProperties);
            }
        }
        if (this._anyGetter == null) {
            return null;
        }
        beanPropertyWriterArr = NO_PROPERTIES;
        return new BeanSerializer(this._beanDesc.getType(), this, beanPropertyWriterArr, this._filteredProperties);
    }

    public BeanSerializer createDummy() {
        return BeanSerializer.createDummy(this._beanDesc.getType());
    }

    public AnyGetterWriter getAnyGetter() {
        return this._anyGetter;
    }

    public BeanDescription getBeanDescription() {
        return this._beanDesc;
    }

    public AnnotatedClass getClassInfo() {
        return this._beanDesc.getClassInfo();
    }

    public Object getFilterId() {
        return this._filterId;
    }

    public BeanPropertyWriter[] getFilteredProperties() {
        return this._filteredProperties;
    }

    public ObjectIdWriter getObjectIdWriter() {
        return this._objectIdWriter;
    }

    public List getProperties() {
        return this._properties;
    }

    public AnnotatedMember getTypeId() {
        return this._typeId;
    }

    public boolean hasProperties() {
        List list = this._properties;
        return list != null && list.size() > 0;
    }

    public void setAnyGetter(AnyGetterWriter anyGetterWriter) {
        this._anyGetter = anyGetterWriter;
    }

    public void setConfig(SerializationConfig serializationConfig) {
        this._config = serializationConfig;
    }

    public void setFilterId(Object obj) {
        this._filterId = obj;
    }

    public void setFilteredProperties(BeanPropertyWriter[] beanPropertyWriterArr) {
        this._filteredProperties = beanPropertyWriterArr;
    }

    public void setObjectIdWriter(ObjectIdWriter objectIdWriter) {
        this._objectIdWriter = objectIdWriter;
    }

    public void setProperties(List list) {
        this._properties = list;
    }

    public void setTypeId(AnnotatedMember annotatedMember) {
        if (this._typeId == null) {
            this._typeId = annotatedMember;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Multiple type ids specified with ");
        stringBuilder.append(this._typeId);
        stringBuilder.append(" and ");
        stringBuilder.append(annotatedMember);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
