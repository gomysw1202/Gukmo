package com.gukmo.board.hw.admin.service;

import java.util.List;
import java.util.Map;

public interface InterAdvertisementService {

	/**
	 * 광고내역 총 수 구하기
	 */
	int getTotalCntAdvertisement(Map<String, String> paraMap);

	/**
	 * 페이징처리한 광고내역 가지고오기
	 */
	List<Map<String, String>> getAdvertisementList(Map<String, String> paraMap);

	/**
	 * 광고 삭제하기
	 */
	boolean deleteAdvertisement(String advertisement_num);

	

	

}
