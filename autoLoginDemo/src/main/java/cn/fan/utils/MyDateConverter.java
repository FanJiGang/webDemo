package cn.fan.utils;

import org.apache.commons.beanutils.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateConverter implements Converter {
    @Override
    public Object convert(Class type, Object value) {
        String strVal=(String) value;
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(strVal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
