package com.javacode.demo04;

import com.javacode.demo04.util.IOCUtil;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * describe:测试依赖注入的2种方式
 * 1、构造器注入
 * * 构造器参数索引注入
 * 参数位置的注入对参数顺序有很强的依赖性，若构造函数参数位置被人调整过，会导致注入出错。
 * 不过通常情况下，不建议去在代码中修改构造函数，如果需要新增参数的，
 * 可以新增一个构造函数来实现，这算是一种扩展，不会影响目前已有的功能
 * * 构造器参数类型注入
 * 实际上按照参数位置或者按照参数的类型注入，都有一个问题，很难通过bean的配置文件，
 * 知道这个参数是对应UserModel中的那个属性的，代码的可读性不好，
 * 比如我想知道这每个参数对应UserModel中的那个属性，必须要去看UserModel的源码，
 * * 构造器参数名称注入
 * <p>
 * 2、set方式注入
 * <p>
 * setter注入相对于构造函数注入要灵活一些，构造函数需要指定对应构造函数中所有参数的值，
 * 而setter注入的方式没有这种限制，不需要对所有属性都进行注入，可以按需进行注入。
 *
 * @author 王立朝
 * @date 2020/04/07
 */
public class DiTest {

    private static final String BEAN_XML = "diByConstructorParamIndex.xml";
    private static final String DIBYSETTER = "diBySetter.xml";
    private static final String DIBEAN = "diBean.xml";
    private static final String DIOTHERTYPE = "diOtherType.xml";

    @Test
    public void diByConstructorParamIndex() {

        ClassPathXmlApplicationContext context = IOCUtil.context(BEAN_XML);
        System.out.println("构造器参数 索引注入---" + context.getBean("diByConstructorParamIndex"));
        System.out.println("构造器参数 类型注入---" + context.getBean("diByConstructorParamType"));
        System.out.println("构造器参数 名称注入---" + context.getBean("diByConstructorParamName"));
    }

    /**
     * setter 方式注入
     **/
    @Test
    public void diBySetter() {
        ClassPathXmlApplicationContext context = IOCUtil.context(DIBYSETTER);
        System.out.println("通过setter 方式注入依赖  " + context.getBean("diBySetter"));
    }

    /**
     * 注入Spring 容器中的某一个被依赖的bean  到 依赖的bean 中
     **/
    @Test
    public void diBean() {
        ClassPathXmlApplicationContext context = IOCUtil.context(DIBEAN);
        System.out.println("通过构造器注入到 依赖的bean中  " + context.getBean("diBeanByConstructor"));
        System.out.println("通过Setter 方式注入到 依赖的bean中  " + context.getBean("diBeanBySetter"));
    }

    /**
     * 注入其他类型依赖
     **/
    @Test
    public void diOtherType() {
        ClassPathXmlApplicationContext context = IOCUtil.context(DIOTHERTYPE);
        System.out.println(context.getBean("diOtherType"));
    }
}
