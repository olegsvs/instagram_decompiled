package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SimpleFilterProvider extends FilterProvider implements Serializable {
    private static final long serialVersionUID = -2825494703774121220L;
    public boolean _cfgFailOnUnknownId;
    public BeanPropertyFilter _defaultFilter;
    public final Map _filtersById;

    public SimpleFilterProvider() {
        this(new HashMap());
    }

    public SimpleFilterProvider(Map map) {
        this._cfgFailOnUnknownId = true;
        this._filtersById = map;
    }

    public SimpleFilterProvider addFilter(String str, BeanPropertyFilter beanPropertyFilter) {
        this._filtersById.put(str, beanPropertyFilter);
        return this;
    }

    public BeanPropertyFilter findFilter(Object obj) {
        BeanPropertyFilter beanPropertyFilter = (BeanPropertyFilter) this._filtersById.get(obj);
        if (beanPropertyFilter == null) {
            beanPropertyFilter = this._defaultFilter;
            if (beanPropertyFilter == null) {
                if (this._cfgFailOnUnknownId) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No filter configured with id '");
                    stringBuilder.append(obj);
                    stringBuilder.append("' (type ");
                    stringBuilder.append(obj.getClass().getName());
                    stringBuilder.append(")");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return beanPropertyFilter;
    }

    public BeanPropertyFilter getDefaultFilter() {
        return this._defaultFilter;
    }

    public BeanPropertyFilter removeFilter(String str) {
        return (BeanPropertyFilter) this._filtersById.remove(str);
    }

    public SimpleFilterProvider setDefaultFilter(BeanPropertyFilter beanPropertyFilter) {
        this._defaultFilter = beanPropertyFilter;
        return this;
    }

    public SimpleFilterProvider setFailOnUnknownId(boolean z) {
        this._cfgFailOnUnknownId = z;
        return this;
    }

    public boolean willFailOnUnknownId() {
        return this._cfgFailOnUnknownId;
    }
}
