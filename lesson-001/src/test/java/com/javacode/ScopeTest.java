package com.javacode;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * describe:
 *
 * @author 王立朝
 * @date 2020/04/06
 */
public class ScopeTest {

    ClassPathXmlApplicationContext context;

    @Before
    public void before(){
        System.out.println("Spring 容器准备启动。。");
        this.context = new ClassPathXmlApplicationContext("bean2.xml");
        System.out.println("Spring 容器启动完毕。。");
    }

    /**
     * 单例bean
     * **/
    @Test
    public void singletonBean(){
        System.out.println("单例bean--");
        System.out.println(context.getBean("singletonBean"));
        System.out.println(context.getBean("singletonBean"));
        System.out.println(context.getBean("singletonBean"));
    }

    @Test
    public void prototypeBean(){
        System.out.println("多例prototype---");
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));

    }
}
