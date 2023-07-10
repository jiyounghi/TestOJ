package com.hackerOJ.web.test.vo;

import lombok.Data;

@Data

public class TestSolVO {
    int solNo; // pk
    String solTitle; // 문제 제목
    String solDetail; // 문제 내용
}
