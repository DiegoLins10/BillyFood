package com.billy.BillyFood.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/bil")
public class dowloadController {
	Logger logger = LogManager.getLogger(dowloadController.class);

	@GetMapping("/baixar")
	public String home() {
		return "/HomeBilly";
	}
}
