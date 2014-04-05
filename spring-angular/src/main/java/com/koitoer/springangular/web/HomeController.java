package com.koitoer.springangular.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.koitoer.springangular.service.MyService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private MyService service;

		@RequestMapping(method = RequestMethod.GET)
		public String home(){
			service.serviceLayer();
			return "index";
		}
}
