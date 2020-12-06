package com.billy.BillyFood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BillyController {
	@GetMapping("/")
	public String home() {
		return "/HomeBilly";
	}
	
	@GetMapping("/billy")
	public String b1() {
		return "HomeBilly";
		}
	@GetMapping("/baixar")
	public String b2() {
		return "baixarBilly";
		}
	@GetMapping("/cadastrar")
	public String b3() {
		return "cadastrarBilly";
		}
	
	

}