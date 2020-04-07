package com.javacode.demo02;

/**
 * describe:
 *
 * @author 王立朝
 * @date 2020/04/06
 */
public class UserStaticFactory {


    /**
     * 静态无参方法创建UserModel
     *
     * @return
     */
    public static UserModel buildUser1() {

        System.out.println(UserStaticFactory.class + ".buildUser1()");

        UserModel userModel = new UserModel();
        userModel.setName("我是无参静态构造方法创建的!");
        return userModel;
    }

    /**
     * 静态有参方法创建UserModel
     **/
    public static UserModel buildUser2(String name, int age) {
        System.out.println(UserStaticFactory.class + "buildUser2()");
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        return userModel;
    }
}
