package com.javacode.demo02;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * describe:通过FactoryBean来创建bean对象
 *
 * @author 王立朝
 * @date 2020/04/06
 */
public class UserFactoryBean implements FactoryBean<UserModel> {



    /**
     * getObject 内部有我们自己来完成，来实现对象的创建，然后把创建好的对象返回给Spring容器
     * **/
    int count = 1;
    @Nullable
    @Override
    public UserModel getObject() throws Exception {//@1返回一个创建好的UserModel对象
        UserModel userModel = new UserModel();
        userModel.setName("我是通过UserFactoryBean 创建的第"+count++ +" 对象");
        return userModel;
    }

    /***
     * getObjectType需要指定我们创建的bean的类型；
     * **/
    @Override
    public Class<?> getObjectType() {
        return UserModel.class;//返回对象的classd对象
    }

    @Override
    public boolean isSingleton() {
        return true;//返回true，表示创建的对象是单例的，那么我们每次从容器中获取这个对象的时候都是返回同一个对象
    }
}
