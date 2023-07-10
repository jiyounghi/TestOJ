package com.hackerOJ.proc;

import com.hackerOJ.common.util.annotation.testSlave;
import com.hackerOJ.web.test.vo.TestMemSolVO;
import com.hackerOJ.web.test.vo.TestMemVO;
import com.hackerOJ.web.test.vo.TestSolVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@testSlave
@Component
public interface HACKTestSlave {

    /**********************************************************************************************
     * @Method 설명   	: testMemVO 가져오기
     * @Date   		    : 2023
     * @Author   		: 김수린
     * @param	 	    :
     * memNo        int     mem_no 로 검색
     * @return	 	    :
     * mem_no       int
     * mem_name     varchar
     * mem_id       varchar
     * mem_pw       varchar
     **********************************************************************************************/
//    @Select("SELECT * FROM oj_test.member_table WHERE mem_no = #{memNo}")
//    TestMemVO getTestMemVO(int memNo);  // memNo로 멤버 정보 조회

    /* 로그인 */
    @Select("SELECT * FROM oj_test.member_table WHERE mem_id = #{memId} AND mem_pw = #{memPw}")
    TestMemVO login(String memID, String memPw);

//    @Select("SELECT mem_id FROM oj_test.member_table WHERE mem_id = #{memId}")
//    boolean existByMemId(String memId);

    /* 회원가입 */
    @Insert("INSERT INTO oj_test.member_table(mem_id, mem_pw, mem_email, mem_type, mem_nick, mem_sol) VALUES(#{memVO.getMemId()}, #{memVO.getMemPw()}, #{memVO.getMemEmail()}, #{memVO.getMemType()}, #{memVO.getMemNick()}, #{memVO.getMemSol()})")
    TestMemVO memJoin(TestMemVO memVO);

//    /* 문제 조회 */
//    @Select("SELECT * FROM work.solution_table")
//    List<TestSolVO> getSolution();
//
//    /* 문제 디테일 조회 */
//    @Select("SELECT * FROM work.solution_table WHERE sol_no = #{index}")
//    TestSolVO getSolutionDetail(int index);
//
//    /* 해당 문제 푼 사람 조회 */
//    @Select("SELECT mem_no FROM work.mem_sol_table WHERE sol_no = #{index}")
//    List<String> getWhoSolve(int index);
//
//    /* 멤버 인덱스를 통해 멤버 이름 조회 */
//    @Select("SELECT mem_name FROM work.mem_table WHERE mem_no = #{solMemNo}")
//    List<String> getWhoName(List<String> solMemNo);
//
//    /* 문제 맞춘 랭킹 조회 */
//    @Select("select mem_no, count(mem_no)  from mem_sol_table group by mem_no order by count(mem_no) DESC")
//    List<TestMemSolVO> getRanking();


}