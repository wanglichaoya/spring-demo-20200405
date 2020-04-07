package com.javacode.demo02;

/**
 * describe:  通过实例工厂方法创建bean对象
 *
 * @author 王立朝
 * @date 2020/04/06
 */
public class UserFactory {

    public UserModel buildUser1() {
        System.out.println("----------------------1");
        UserModel userModel = new UserModel();
        userModel.setName("bean实例方法创建的对象");
        return userModel;
    }

    public UserModel buildUser2(String userName,int age){
        System.out.println("----------------------2");
        UserModel userModel = new UserModel();
        userModel.setName(userName);
        userModel.setAge(age);
        return userModel;
    }
}
