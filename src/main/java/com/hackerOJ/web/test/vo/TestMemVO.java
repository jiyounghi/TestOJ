package com.hackerOJ.web.test.vo;

import lombok.Data;

@Data
public class TestMemVO {
    int memNo; // 회원 인덱스
    String memId; // 회원 아이디
    String memPw; // 비밀번호
    String memEmail; // 회원 이메일
    char memType; // 회원 유형
    String memNick; // 회원 닉네임
    String memSol; // 맞은 문제 개수
}
