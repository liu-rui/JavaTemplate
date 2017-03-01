package com.github.liurui.javatemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by liurui on 17-3-1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class AopTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void test() {
        assertThat(applicationContext).isNull();

//        AopConfig.Operation operation = context.getBean(AopTest.AopConfig.class);
//
//        operation.a();
//        operation.b();
    }
}
