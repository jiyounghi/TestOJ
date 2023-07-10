package com.hackerOJ.web.test.act;
import com.hackerOJ.web.test.biz.TestMemSolService;
import com.hackerOJ.web.test.biz.TestService;
import com.hackerOJ.web.test.biz.TestSolService;
import com.hackerOJ.web.test.vo.TestMemSolVO;
import com.hackerOJ.web.test.vo.TestMemVO;
import com.hackerOJ.web.test.vo.TestSolVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/Test")
public class TestAct {
    //private final TestService testService;
    //private final TestSolService testSolService;
    //private final TestMemSolService testMSService;

    /* 홈페이지 */
    @RequestMapping("/Home")
    public ModelAndView hi() {
        ModelAndView mav = new ModelAndView("home/home");
        return mav;
    }

//    /* 문제 조회 */
//    @GetMapping("/getSolution")
//    public ModelAndView getSolution(){
//        ModelAndView mav = new ModelAndView("solution/solution");
//        List<TestSolVO> rtnVO = testSolService.getSolution();
//        mav.addObject("rtnVOList", rtnVO);
//        return mav;
//    }
//
//    /* 문제 디테일 페이지 */
//    @GetMapping("/getSolutionDetail")
//    public ModelAndView getSolutionDetail(@RequestParam int index) {
//        System.out.println("게시물 디테일 인덱스" + index);
//        ModelAndView mav = new ModelAndView("solution/solution-detail");
//        // 문제 정보 불러오기
//        TestSolVO solVO = testSolService.getSolutionDetail(index);
//        mav.addObject("solVO", solVO);
//        // 해당 문제를 푼 사람 불러오기
//        List<String> solMemNo = testMSService.getWhoSolve(index); // 해당 멤버의 인덱스 받아옴
//        System.out.println("문제 푼 사람 no" + solMemNo);
//        List<String> solMemName = testService.getWhoName(solMemNo); // 위 멤버 인덱스를 통해 이름을 가져옴
//        System.out.println("문제 푼 사람 name" + solMemName);
//        return mav;
//    }
//
//
//    /* 랭킹 */
//    @GetMapping("/getRanking")
//    public ModelAndView getRanking(){
//        ModelAndView mav = new ModelAndView("mem_sol/ranking");
//        List<TestMemSolVO> testMSVO = testMSService.getRanking();
//        mav.addObject("testMSVOList", testMSVO);
//        return mav;
//    }
//
//
//    /* 회원 정보 조회 */
//    @RequestMapping("/Test1")
//    public Map<String, Object> getTestData(@RequestBody Map<String, Object> param){
//        System.out.println(param);
//        return testService.getTestData(param);
//    }

}
