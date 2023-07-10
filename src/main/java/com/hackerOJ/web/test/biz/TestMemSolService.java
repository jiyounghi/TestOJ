package com.hackerOJ.web.test.biz;

import com.hackerOJ.proc.HACKTestSlave;
import com.hackerOJ.web.test.vo.TestMemSolVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class TestMemSolService {

    private final HACKTestSlave hackTestSlave;
/*
    public List<TestMemSolVO> getRanking(){

        List<TestMemSolVO> TestMSVO = new ArrayList<>();

        try{
            TestMSVO = hackTestSlave.getRanking();
            if (TestMSVO == null){
                System.out.println("값이 존재하지 않음");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TestMSVO;
    }


    public List<String> getWhoSolve(int index) {
        List<String> solMemNo = hackTestSlave.getWhoSolve(index);
        return solMemNo;
    }

 */
}
