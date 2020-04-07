package com.javacode.demo04.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * describe:
 *
 * @author 王立朝
 * @date 2020/04/07
 */
public class IOCUtil {

    public static ClassPathXmlApplicationContext context(String beanName) {
        return new ClassPathXmlApplicationContext(beanName);
    }
}
