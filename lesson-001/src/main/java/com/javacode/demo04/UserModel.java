package com.javacode.demo04;

import java.beans.ConstructorProperties;

/**
 * describe:
 *
 * @author 王立朝
 * @date 2020/04/07
 */
public class UserModel {

    private String name;
    private int age;
    //描述信息
    private String desc;

    public UserModel() {
    }

    /**
     * 参数名称可能不稳定的问题，
     * spring提供了解决方案，通过ConstructorProperties注解来定义参数的名称，
     * 将这个注解加在构造方法上面
     * **/
    @ConstructorProperties({"name","desc"})
    public UserModel(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public UserModel(String name, int age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
