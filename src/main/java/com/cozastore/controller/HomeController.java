package com.cozastore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("/home-02")
	public String home_02() {
		return "home-02";
	}
	
	@RequestMapping("/home-03")
	public String home_03() {
		return "home-03";
	}
	
	@RequestMapping("/product")
	public String product() {
		return "product";
	}
	
	@RequestMapping("/product-detail")
	public String product_detail() {
		return "product-detail";
	}
	
	@RequestMapping("/shoping-cart")
	public String shoping_cart() {
		return "shoping-cart";
	}
	
	@RequestMapping("/index-2")
	public String index2() {
		return "index-2";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "adminPage";
	}
	
	@RequestMapping("/product-add")
	public String product_add() {
		return "product-add";
	}
}
