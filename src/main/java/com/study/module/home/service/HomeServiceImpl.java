package com.study.module.home.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.module.home.repository.HomeRepository;

@Service("homeService")
public class HomeServiceImpl implements HomeService{
	
	@Resource(name = "homeRepository")
	private HomeRepository homeRepository;
	
	@Override
	public String getDBName() {
		return homeRepository.getDBName();
	}

}
