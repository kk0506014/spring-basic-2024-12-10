package com.ll.basic.domain.global.initData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Base2InitData {
    @Bean
    public List<Integer> ages2(List<Integer> ages) {
        return ages.reversed();
    }
}