package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import java.io.Serializable;

public class OptionalHandlerFactory implements Serializable {
    private static final String CLASS_NAME_DOM_DOCUMENT = "org.w3c.dom.Node";
    private static final String CLASS_NAME_DOM_NODE = "org.w3c.dom.Node";
    private static final String DESERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers";
    private static final String DESERIALIZER_FOR_DOM_DOCUMENT = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
    private static final String DESERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
    private static final String PACKAGE_PREFIX_JAVAX_XML = "javax.xml.";
    private static final String SERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
    private static final String SERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMSerializer";
    public static final OptionalHandlerFactory instance = new OptionalHandlerFactory();
    private static final long serialVersionUID = 1;

    private boolean doesImplement(Class cls, String str) {
        while (cls != null) {
            if (!cls.getName().equals(str)) {
                if (!hasInterface(cls, str)) {
                    cls = cls.getSuperclass();
                }
            }
            return true;
        }
        return false;
    }

    public JsonDeserializer findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        if (!rawClass.getName().startsWith(PACKAGE_PREFIX_JAVAX_XML)) {
            if (!hasSupertypeStartingWith(rawClass, PACKAGE_PREFIX_JAVAX_XML)) {
                if (doesImplement(rawClass, "org.w3c.dom.Node")) {
                    return (JsonDeserializer) instantiate(DESERIALIZER_FOR_DOM_DOCUMENT);
                }
                if (doesImplement(rawClass, "org.w3c.dom.Node")) {
                    return (JsonDeserializer) instantiate(DESERIALIZER_FOR_DOM_NODE);
                }
                return null;
            }
        }
        Object instantiate = instantiate(DESERIALIZERS_FOR_JAVAX_XML);
        if (instantiate == null) {
            return null;
        }
        return ((Deserializers) instantiate).findBeanDeserializer(javaType, deserializationConfig, beanDescription);
    }

    public JsonSerializer findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        if (!rawClass.getName().startsWith(PACKAGE_PREFIX_JAVAX_XML)) {
            if (!hasSupertypeStartingWith(rawClass, PACKAGE_PREFIX_JAVAX_XML)) {
                if (doesImplement(rawClass, "org.w3c.dom.Node")) {
                    return (JsonSerializer) instantiate(SERIALIZER_FOR_DOM_NODE);
                }
                return null;
            }
        }
        Object instantiate = instantiate(SERIALIZERS_FOR_JAVAX_XML);
        if (instantiate == null) {
            return null;
        }
        return ((Serializers) instantiate).findSerializer(serializationConfig, javaType, beanDescription);
    }

    private boolean hasInterface(Class cls, String str) {
        Class[] interfaces = cls.getInterfaces();
        for (Class name : interfaces) {
            if (name.getName().equals(str)) {
                break;
            }
        }
        for (Class name2 : interfaces) {
            if (hasInterface(name2, str)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasInterfaceStartingWith(Class cls, String str) {
        Class[] interfaces = cls.getInterfaces();
        for (Class name : interfaces) {
            if (name.getName().startsWith(str)) {
                break;
            }
        }
        for (Class name2 : interfaces) {
            if (hasInterfaceStartingWith(name2, str)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSupertypeStartingWith(Class cls, String str) {
        for (Class superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().startsWith(str)) {
                break;
            }
        }
        while (cls != null) {
            if (hasInterfaceStartingWith(cls, str)) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    private java.lang.Object instantiate(java.lang.String r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0 = java.lang.Class.forName(r1);	 Catch:{ LinkageError -> 0x0009, LinkageError -> 0x0009 }
        r0 = r0.newInstance();	 Catch:{ LinkageError -> 0x0009, LinkageError -> 0x0009 }
        return r0;	 Catch:{ LinkageError -> 0x0009, LinkageError -> 0x0009 }
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.instantiate(java.lang.String):java.lang.Object");
    }
}
