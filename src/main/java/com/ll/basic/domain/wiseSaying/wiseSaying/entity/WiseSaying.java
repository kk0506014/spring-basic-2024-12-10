package com.ll.basic.domain.wiseSaying.wiseSaying.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WiseSaying {
    private long id;
    private String content;
    private String author;
}