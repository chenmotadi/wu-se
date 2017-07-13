package com.kongzhu.wupeiyang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kongzhu.wupeiyang.DAO.FractionDAO;
import com.kongzhu.wupeiyang.entity.Fraction;

@Service
public class FractionServiceImpl implements FractionService {
	
	@Autowired
	private  FractionDAO dao;

	public Integer selectScore(Fraction fraction) {
		
		return dao.selectScore(fraction);
	}
	
	
}
