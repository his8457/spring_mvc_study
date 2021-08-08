package com.study.module.home.repository;

import org.springframework.stereotype.Repository;

@Repository("homeRepository")
public class HomeRepository {

	public String getDBName() {
		return "Oracle";
	}

}
