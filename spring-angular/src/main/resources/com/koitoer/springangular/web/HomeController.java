package com.koitoer.springangular.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class HomeController {

		@RequestMapping(method = RequestMethod.GET)
		public String home(){
			return "index"
		}
}
