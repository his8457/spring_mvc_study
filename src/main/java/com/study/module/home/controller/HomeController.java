package com.study.module.home.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.module.home.service.HomeService;

@Controller
public class HomeController {
	
	@Resource(name = "homeService")
	private HomeService service;
	
	@RequestMapping(value = "/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home/home");
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sf.format(new Date());
		
		String dbName = service.getDBName();
		
		mv.addObject("currentTime", currentTime);
		mv.addObject("dbName", dbName);
		return mv;
	}
}
