package com.itheima.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","�����ҵĵ�һ��springmvc����");
		mav.setViewName("/WEB-INF/jsp/first.jsp");
		return mav;
	}

}
