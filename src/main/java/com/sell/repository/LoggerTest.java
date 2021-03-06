package com.sell.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1(){

        String name = "jinersong";
        int passworld = 123456;
        log.info("info ....");
        log.info("name: {}, passworld: {} ",name,passworld);
        log.debug("debug ...");
        log.error("error ...");

    }
}
