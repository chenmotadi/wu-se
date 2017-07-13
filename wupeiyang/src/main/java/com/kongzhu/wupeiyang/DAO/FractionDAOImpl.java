package com.kongzhu.wupeiyang.DAO;


import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kongzhu.wupeiyang.entity.Fraction;
import com.kongzhu.wupeiyang.mapper.FractionMapper;


@Repository
public class FractionDAOImpl extends BaseDAOImpl implements  FractionDAO {

	public Integer selectScore(Fraction fraction) {
		SqlSession session=getsqlSession();
		try {
		FractionMapper mapper=session.getMapper(FractionMapper.class);
		return mapper.selectScore(fraction);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	

}
