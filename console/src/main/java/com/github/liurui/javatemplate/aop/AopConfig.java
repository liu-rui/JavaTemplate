package com.github.liurui.javatemplate.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Configuration
public class AopConfig {
    @Bean

    public Operation operation() {
        return (Operation) Proxy.newProxyInstance(Operation.class.getClassLoader(), new Class<?>[]{Operation.class}, new OperationAgent());
    }

    public static interface Operation {
        void a();

        void b();
    }

    public static class OperationAgent implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName());
            return null;
        }
    }
}