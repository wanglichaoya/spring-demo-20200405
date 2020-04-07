package com.javacode.demo04;

import java.util.*;

/**
 * describe:
 *
 * @author 王立朝
 * @date 2020/04/07
 */
public class DiOtherTypeModel {

    private List<String> list1;
    private Set<UserModel> userModelSet;
    private Map<String,Integer> map1;
    private int[] array1;
    private Properties properties;

    @Override
    public String toString() {
        return "DiOtherTypeModel{" +
                "list1=" + list1 +
                ", userModelSet=" + userModelSet +
                ", map1=" + map1 +
                ", array1=" + Arrays.toString(array1) +
                ", properties=" + properties +
                '}';
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public Set<UserModel> getUserModelSet() {
        return userModelSet;
    }

    public void setUserModelSet(Set<UserModel> userModelSet) {
        this.userModelSet = userModelSet;
    }

    public Map<String, Integer> getMap1() {
        return map1;
    }

    public void setMap1(Map<String, Integer> map1) {
        this.map1 = map1;
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
