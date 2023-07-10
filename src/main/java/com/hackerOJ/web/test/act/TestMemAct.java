package com.hackerOJ.web.test.act;

import com.hackerOJ.proc.HACKTestSlave;
import com.hackerOJ.web.test.biz.TestService;
import com.hackerOJ.web.test.vo.TestMemVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("/Mem")
public class TestMemAct {

    private final TestService testService;


    /* 로그인 페이지 */
    @RequestMapping("/LoginPage")
    public ModelAndView loginPage(){
        ModelAndView mav = new ModelAndView("member/login");
        return mav;
    }

    /* 로그인 */
    @PostMapping("/LoginAction")
    public ModelAndView loginAction(TestMemVO memVO){
        ModelAndView mav = new ModelAndView("member/login-success");
        System.out.println(memVO);
        TestMemVO rtnVO = testService.loginAction(memVO);
        return mav;
    }

    /* 로그아웃 */


    /* 회원가입 페이지 */
    @RequestMapping("/MemJoinPage")
    public ModelAndView MemJoinPage(){
        ModelAndView mav = new ModelAndView("member/mem-join");
        return mav;
    }


    /* 회원 가입 */
    @PostMapping("/MemJoinAction")
    public ModelAndView MemJoinAction(TestMemVO memVO){
        log.info("MemJoinAction");
        // 회원가입 성공시 팝업 뜨고 로그인 창으로 이동, 실패시 팝업 뜨는 건 똑같음
        TestMemVO testMemVO = testService.MemJoinAction(memVO);
        System.out.println("controller " + memVO);
        ModelAndView mav = new ModelAndView("member/login");
        mav.addObject("response", testMemVO);
        return mav;
    }
//
//    /* 회원정보 수정 */
//    @PutMapping("/MemUpdateAction")
//    public ModelAndView MemUpdateAction(){
//        ModelAndView mav = new ModelAndView("member/mem-update");
//
//        return mav;
//    }
//
//    /* 회원 탈퇴 */
//    @DeleteMapping("/MemDeleteAction")
//    public ModelAndView MemDeleteAction(){
//        ModelAndView mav = new ModelAndView("member/mem-delete");
//
//        return mav;
//    }

}
