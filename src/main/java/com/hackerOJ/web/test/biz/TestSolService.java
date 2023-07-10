package com.hackerOJ.web.test.biz;

import com.hackerOJ.proc.HACKTestSlave;
import com.hackerOJ.web.test.vo.TestSolVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class TestSolService {
    private final HACKTestSlave hackTestSlave;
/*
    // 문제 조회
    public List<TestSolVO> getSolution() {
        List<TestSolVO> rtnVO = new ArrayList<>();
        try {
            rtnVO =  hackTestSlave.getSolution();
            if(rtnVO == null) {
                System.out.println("문제가 존재하지 않습니다.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return rtnVO;
    }

    // 문제 디테일 조회
    public TestSolVO getSolutionDetail(int index) {
        TestSolVO solVO = hackTestSlave.getSolutionDetail(index);
        return solVO;
    }

 */
}
