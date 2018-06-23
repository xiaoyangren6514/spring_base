package com.happy.hello.g.complexinjection.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by zhonglongquan on 2018/6/21.
 * 复杂类型注入
 */
public class User {
    private Object[] obj;
    private List<String> list;
    private Map<String, Object> map;
    private Properties properties;

    public Object[] getObj() {
        return obj;
    }

    public void setObj(Object[] obj) {
        this.obj = obj;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "obj=" + Arrays.toString(obj) +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
