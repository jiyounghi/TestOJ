package com.hackerOJ.web.test.biz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackerOJ.proc.HACKTestSlave;
import com.hackerOJ.web.test.vo.TestMemVO;
import jdk.jfr.TransitionFrom;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Slf4j
@Service
public class TestService {
    private final HACKTestSlave hackTestSlave;

    // 회원가입
    public TestMemVO MemJoinAction(TestMemVO memVO) {
        TestMemVO rtnVO = new TestMemVO();

        try {
            if(memVO.getMemId()!= null && memVO.getMemPw() != null && memVO.getMemEmail() != null && memVO.getMemType() != ' ' && memVO.getMemNick() != null && memVO.getMemSol() != null) {
                // 모든 정보가 입력됐을 때
                rtnVO = hackTestSlave.memJoin(memVO);
                System.out.println("rtnVO" + rtnVO);
            } else{
                System.out.println("정보가 제대로 입력되지 않았습니다");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rtnVO;
    }

    // 로그인
    public TestMemVO loginAction(TestMemVO memVO) {
        //System.out.println("service " + memVO);
        TestMemVO rtnVO = new TestMemVO();

        try {
            if(memVO.getMemId()!= null && memVO.getMemPw() != null) {
                rtnVO = hackTestSlave.login(memVO.getMemId(), memVO.getMemPw());
                System.out.println("rtnVO" + rtnVO);
                if(rtnVO == null)
                    System.out.println("회원 정보가 없습니다");
            } else{
                System.out.println("정보가 제대로 입력되지 않았습니다");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rtnVO;
    }

    // transaction 이해되면 쓸 회원가입 코드
//    public TestMemVO MemJoinAction(TestMemVO memVO){
//        int status = 0; // 1 : Success, 2 : Exists, 3: Error
//        if(hackTestSlave.existByMemId(memVO.getMemId())){
//            status = 2;
//        }
//        TestMemVO testMemVO = hackTestSlave.join(memVO);
//        return testMemVO;
//    }

/*
    // 회원 정보
    public Map<String, Object> getTestData(Map<String, Object> param){
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> rtnMap = new HashMap<>();
        TestMemVO testMemParam = null;
        TestMemVO rtnTestMemVO = null;
        try{
            testMemParam = mapper.convertValue(param.get("memInfo"), TestMemVO.class);
            if(testMemParam != null) {
                rtnTestMemVO = hackTestSlave.getTestMemVO(testMemParam.getMemNo());
                if(rtnTestMemVO != null){
                    rtnMap.put("memberInfo", rtnTestMemVO);
                } else { // null값일때
                    rtnMap.put("error", "table is null");
                }
            } else {
                rtnMap.put("error", "param is null");
            }
        }catch (Exception e){
            log.error("TestService Error ===> {}", e.getMessage());
        }
        return rtnMap;
    }

    // 멤버 인덱스를 통해 멤버 이름 조회
    public List<String> getWhoName(List<String> solMemNo) {
        System.out.println("service단" + solMemNo);
        List<String> solMemName = hackTestSlave.getWhoName(solMemNo);
        return solMemName;
    }

 */
}
