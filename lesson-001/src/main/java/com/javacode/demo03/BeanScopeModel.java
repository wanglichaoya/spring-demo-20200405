package com.javacode.demo03;

/**
 * describe:  BeanScope
 *
 * 有时候需要整个应用中年的对象只有一个（单例 Singleton），
 * 有的时候是希望每次使用的时候都创建一个(多例  prototype)
 *
 * Spring 的作用域共有5中，
 *  1、单例（Singleton)、
 *  2、多例（prototype）、
 *  3、request (在一次http请求中，一个bean 对应着一个实例，对每个http请求都会创建一个bean实例，
 *            request结束的时候，这个bean 也就结束了，request作用域用在spring容器的web环境中)
 * 4、session  这个和request类似，也是用在web环境中，session级别共享的bean，
 *             每个会话会对应一个bean实例，不同的session对应不同的bean实例
 * 5、application
 * @author 王立朝
 * @date 2020/04/06
 */
public class BeanScopeModel {

    public BeanScopeModel(String beanScope){
       System.out.println(String.format("create beanScopeMode ,{scope=%s},{this=%s}",beanScope,this));
    }
}
