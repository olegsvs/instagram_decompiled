package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public abstract class FilteredBeanPropertyWriter {
    public static BeanPropertyWriter constructViewBased(BeanPropertyWriter beanPropertyWriter, Class[] clsArr) {
        if (clsArr.length == 1) {
            return new FilteredBeanPropertyWriter$SingleView(beanPropertyWriter, clsArr[0]);
        }
        return new FilteredBeanPropertyWriter$MultiView(beanPropertyWriter, clsArr);
    }
}
