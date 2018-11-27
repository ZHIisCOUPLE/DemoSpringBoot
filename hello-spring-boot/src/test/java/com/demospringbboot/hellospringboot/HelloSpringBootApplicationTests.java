package com.demospringbboot.hellospringboot;

import com.demospringbboot.HelloSpringBootApplication;
import com.demospringbboot.controller.HelloSpringBoot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringBootApplication.class)
public class HelloSpringBootApplicationTests {

    @Test
    public void contextLoads() {
    }

}
