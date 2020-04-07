package com.javacode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * describe:
 *
 * @author 王立朝
 * @date 2020/04/06
 */
public class TestUserModel {

    public static void main(String[] args) {
        //2.创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        System.out.println("spring容器中所有bean如下：");
        for (String beanName:context.getBeanDefinitionNames()){
            System.out.println(beanName+":" +context.getBean(beanName));
        }

        System.out.println("--------------------------");
        //多次获取createByFactoryBean看看是否是同一个对象
        System.out.println("createByFactoryBean:" + context.getBean("createByFactoryBean"));
        System.out.println("createByFactoryBean:" + context.getBean("createByFactoryBean"));
    }
}
