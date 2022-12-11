package com.gukmo.board.aop;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gukmo.board.common.MyUtil;
import com.gukmo.board.hasol.service.InterAlarmService;
import com.gukmo.board.hw.repository.InterBoardDAO;
import com.gukmo.board.model.BoardVO;
import com.gukmo.board.model.MemberVO;
import com.gukmo.board.sun.service.InterBoardService;

@Aspect     
@Component  
public class BoardAOP {

	@Pointcut("execution(public * com.gukmo..*Controller.requiredLogin_*(..) )")
	public void requiredLogin() {}
	
	@Before("requiredLogin()")
	public void loginCheck(JoinPoint joinpoint) {
		
		HttpServletRequest request = (HttpServletRequest) joinpoint.getArgs()[0];    
		HttpServletResponse response = (HttpServletResponse) joinpoint.getArgs()[1]; 
		
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			String message = "먼저 로그인 하세요";
			String loc = request.getContextPath()+"/login.do";
			
			request.setAttribute("message", message);
			request.setAttribute("loc", loc);
			
			// 로그인 성공후 로그인 하기전 페이지로 돌아가는 작업
			String url = MyUtil.getCurrentURL(request);
			session.setAttribute("goBackURL", url);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/msg.jsp"); 
			
			try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
//	// 알람에 값 넢는 AOP
//	@Pointcut("execution(public * com.gukmo..*Controller.setAlarm_*(..) )")
//	public void setAlarm() {}
//	
//	@Autowired  
//	private InterAlarmService alarm_service;
//	
//	@SuppressWarnings("unchecked")
//	@After("setAlarm()")
//	public void setAlarm(JoinPoint joinpoint) {
//		
//		HttpServletRequest request = (HttpServletRequest) joinpoint.getArgs()[0];    
//		Map<String,String> paraMap = (Map<String, String>) joinpoint.getArgs()[1];
//		
//		int n = alarm_service.setAlarm(paraMap);
//		System.out.println("aop 확인용 : " + n);
//		
//	
//	} //end of setAlarm
//	
	
	
		
		
		
		
		
		
	 


}
