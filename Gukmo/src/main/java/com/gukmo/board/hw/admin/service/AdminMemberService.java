package com.gukmo.board.hw.admin.service;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gukmo.board.common.MyUtil;
import com.gukmo.board.hw.admin.repository.InterAdminMemberDAO;
import com.gukmo.board.hw.email.GoogleMail;
import com.gukmo.board.model.MemberVO;
import com.gukmo.board.model.PenaltyVO;

@Service
public class AdminMemberService implements InterAdminMemberService{
	@Autowired   // Type 에 따라 알아서 Bean 을 주입해준다.
	private InterAdminMemberDAO dao;
	@Autowired
	private GoogleMail mail;

	/**
	 * 회원 정보 얻기
	 */
	@Override
	public MemberVO getUser(String userid) {
		MemberVO member = dao.getUser(userid);
		return member;
	}

	
	/**
	 * 정지당한 회원 정지사유 얻기
	 */
	@Override
	public PenaltyVO getPenalty(String nickname) {
		PenaltyVO penalty = dao.getPenalty(nickname);
		return penalty;
	}
	
	
	
	/**
	 * 회원 관리 페이지의 총 페이지 수 알아오기
	 */
	@Override
	public int getTotalCount(Map<String, String> paraMap) {
		int n = dao.getTotalCount(paraMap);
		return n;
	}

	/**
	 * 회원 관리 페이지에 보여줄 회원 목록 리스트 뽑아오기
	 */
	@Override
	public List<MemberVO> memberList(Map<String, String> paraMap) {
		List<MemberVO> memberList = dao.memberList(paraMap);
		// System.out.println(memberList);
		return memberList;
	}


	/**
	 * 교육기관회원 관리 페이지의 총 페이지 수 알아오기
	 */
	@Override
	public int getTotalCount_academy(Map<String, String> paraMap) {
		int n = dao.getTotalCount_academy(paraMap);
		return n;	
		
	}

	/**
	 * 교육기관회원 관리 페이지에 보여줄 회원 목록 리스트 뽑아오기
	 */
	@Override
	public List<MemberVO> academymemberList(Map<String, String> paraMap) {
		List<MemberVO> academymemberList = dao.academymemberList(paraMap);
		return academymemberList;
	}


	/**
	 * 회원 정보 수정해주기
	 */
	@Override
	public boolean editMember(Map<String,String> paraMap) {
		int result = dao.editMember(paraMap);
		boolean success = false;
		success = result == 1 ?true:false;
		return success;
	}


	/**
	 * 정지내역등록하기
	 */
	@Override
	public boolean penaltyNew(Map<String,String> paraMap) {
		int result = dao.penaltyNew(paraMap);
		boolean success = false;
		success = result == 1 ?true:false;
		return success;
	}


	/**
	 * 정지내역 delete하기
	 */
	@Override
	public boolean penaltyDelete(String nickname) {
		int result = dao.penaltyDelete(nickname);
		boolean success = false;
		success = result == 1 ?true:false;
		return success;
	}


	/**
	 * 회원에게 이메일 전송하기
	 */
	@Override
	public boolean sendEmail(Map<String, String> paraMap) {
		boolean sendMailSuccess = false; // 메일이 정상적으로 전송되었는지 유무를 알아오기 위한 용도
		
		// 이메일 제목 설정
        String subject = "[국비의모든것] 안녕하세요.국비의모든것 관리자입니다.";
        
		// 이메일에 보낼 메세지(계정을찾을수있는 링크 보내주기)
		String message = paraMap.get("message");
		try {
			mail.sendmail(paraMap.get("email"), subject, message);
			sendMailSuccess = true;	//메일 전송했음을 기록함.
			
		} catch(Exception e) {	//메일 전송이 실패한 경우
			sendMailSuccess = false;	//메일 전송 실패했음을 기록함.
		}//end of try-catch()----
		
		return sendMailSuccess;
	}

	
	
	
}
