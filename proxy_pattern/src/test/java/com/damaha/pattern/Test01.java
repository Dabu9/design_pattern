package com.damaha.pattern;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.reflect.Proxy.getProxyClass;

public class Test01{
    @Test
    public void TestDynamicProxy(){
        InvocationHandler handler = new PersonHandle();
        AbstractPerson proxy = (AbstractPerson) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class[]{AbstractPerson.class},handler);
        proxy.readName();
    }
}

interface AbstractPerson{
    public String readName();
}
class Person implements AbstractPerson{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String readName() {
        return this.name;
    }
}

class PersonHandle implements InvocationHandler{
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(proxy, args);
        System.out.println("ok");
        return result;
    }
}