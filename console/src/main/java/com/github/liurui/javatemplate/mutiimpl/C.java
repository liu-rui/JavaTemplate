package com.github.liurui.javatemplate.mutiimpl;

import org.springframework.stereotype.Component;

/**
 * Created by liurui on 17-3-1.
 */
@Component
public class C implements A, B {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }
}
