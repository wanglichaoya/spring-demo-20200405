package com.javacode.spring20200405.practice;

/**
 * describe:
 *
 * @author 王立朝
 * @date 2020/04/05
 */
public class B {

    private A a;//@1B类中声明了一个A这个类的属性a

    private C c;

    /**
     * 现在我们调用B的m1方法完成一些事情，
     * 而B中的m1方法需要调用A中的m1方法才可以完成这个事情，
     **/
   /* public void m1() {
        System.out.println("我是B这个类的方法");
    }*/
    public B(A a, C c) {
        this.a = new A();//@2 new了一个A对象，然后赋值给了a属性
        this.c = new C();
    }

    public B(C c){
        this.c = new C();
    }


    public void m1() {

        this.a.m1();//@3 B类中的m1 方法调用a.m1()方法完成业务操作
        System.out.println("B中的方法m1");
        this.c.m1();
    }

    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        B b = new B(a, c);
        b.m1();


        //当A这个类中的方法需要调用B这个类中的方法来完成某种业务，这个时候A依赖于B这个类的方法，
        //a 和 b 之间是依赖关系


    }
}
