package com.gukmo.board.sm.repository;

import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO implements InterMemberDAO {

	@Resource
	private SqlSessionTemplate gukmo_sql;

	@Override
	public int getTotalCount(Map<String, String> paraMap) {
		int n = gukmo_sql.selectOne("ksm.getTotalCount", paraMap);
		return n;
	}

}
