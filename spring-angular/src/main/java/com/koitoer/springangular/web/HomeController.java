package com.koitoer.springangular.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.koitoer.springangular.service.MyService;

@Controller

public class HomeController {
	
	@Autowired
	private MyService service;

		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String home(HttpServletRequest request){
			System.out.println(request.getRemoteAddr());
			System.out.println(service.serviceLayer());
			return "index";
		}
		
		
}
