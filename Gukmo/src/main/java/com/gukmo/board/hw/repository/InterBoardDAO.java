package com.gukmo.board.hw.repository;

import java.util.List;
import java.util.Map;

import com.gukmo.board.model.BoardVO;


public interface InterBoardDAO {

	/**
	 * study 게시판을 보여주기 위한 BoardVO 리스트 가져오기
	 * @param paraMap(검색어,시작rownum,끝rownum)
	 * @return BoardVO리스트
	 */
	List<BoardVO> getStudies(Map<String, String> paraMap);

	
	/**
	 * 총 게시물 건수(totalCount) 구하기
	 * @param paraMap(검색어)
	 * @return (총 게시물 건수) 를 반환한다. totalCount
	 */
	int getTotalStudiesCount(Map<String, String> paraMap);


	/**
	 * 총 게시물 건수(totalCount) 구하기(QnA게시판)
	 * @param paraMap(검색어)
	 * @return (총 게시물 건수) 를 반환한다. totalCount
	 */
	int getTotalQuestionsCount(Map<String, String> paraMap);
	
	
	/**
	 * QnA 게시판을 보여주기 위한 BoardVO 리스트 가져오기
	 * @param paraMap(검색어,시작rownum,끝rownum)
	 * @return BoardVO리스트
	 */
	List<BoardVO> getQuestions(Map<String, String> paraMap);


	
	/**
	 * 총 게시물 건수(totalCount) 구하기(취미모임 게시판)
	 * @param paraMap(검색어)
	 * @return (총 게시물 건수) 를 반환한다. totalCount
	 */
	int getTotalHobbiesCount(Map<String, String> paraMap);


	/**
	 * 취미모임 게시판을 보여주기 위한 BoardVO 리스트 가져오기
	 * @param paraMap(검색어,시작rownum,끝rownum)
	 * @return BoardVO리스트
	 */
	List<BoardVO> getHobbies(Map<String, String> paraMap);


	/**
	 * 총 게시물 건수(totalCount) 구하기(수강/취업성공후기 게시판)
	 * @param paraMap(검색어)
	 * @return (총 게시물 건수) 를 반환한다. totalCount
	 */
	int getTotalReviewsCount(Map<String, String> paraMap);


	
	/**
	 * 수강/취업성공후기 게시판을 보여주기 위한 BoardVO 리스트 가져오기
	 * @param paraMap(검색어,시작rownum,끝rownum)
	 * @return BoardVO리스트
	 */
	List<BoardVO> getReviews(Map<String, String> paraMap);

	
	/**
	 * 총 게시물 건수(totalCount) 구하기(공지사항 게시판)
	 * @param paraMap(검색어)
	 * @return (총 게시물 건수) 를 반환한다. totalCount
	 */
	int getTotalNoticesCount(Map<String, String> paraMap);


	/**
	 * 공지사항 게시판을 보여주기 위한 BoardVO 리스트 가져오기
	 * @param paraMap(검색어,시작rownum,끝rownum)
	 * @return BoardVO리스트
	 */
	List<BoardVO> getNotices(Map<String, String> paraMap);


	/**
	 * 글번호를 가지고 게시글하나에대한 정보 가져오기
	 * @param boardNum(글번호)
	 * @return BoardVO
	 */
	BoardVO getBoard(int boardNum);

	
}
