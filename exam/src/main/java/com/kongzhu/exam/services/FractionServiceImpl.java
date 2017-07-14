package com.kongzhu.exam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kongzhu.exam.entity.Fraction;
import com.kongzhu.exam.mapper.FractionMapper;


@Service
public class FractionServiceImpl implements FractionService {
	
	
	@Autowired
	private  FractionMapper fractionMapper;
	public Integer selectScore(Fraction fraction) {
		
		return fractionMapper.selectScore(fraction);
	}

	


}
