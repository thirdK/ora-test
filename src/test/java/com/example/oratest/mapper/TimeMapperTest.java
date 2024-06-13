package com.example.oratest.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TimeMapperTest {
    @Autowired
    TimeMapper timeMapper;

    @Test
    void selectDate() {
        String date = timeMapper.selectDate();
        System.out.println("date = " + date);
    }
}