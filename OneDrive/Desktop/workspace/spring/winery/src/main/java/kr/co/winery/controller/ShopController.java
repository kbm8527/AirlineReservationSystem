package kr.co.winery.controller;

import java.time.LocalDateTime;




import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ShopController {


	@GetMapping("/shop/list")
	public String list() {
		
		
		
		
		return "/shop/list";
	}
	
	@GetMapping("/shop/view")
	public String view() {
		
		
		
		
		return "/shop/view";
	}
	
	@GetMapping("/shop/winelist")
	public String winelist() {
		
		
		
		
		return "/shop/winelist";
	}
	
	@GetMapping("/shop/wineview")
	public String wineview() {
		
		
		
		
		return "/shop/wineview";
	}
	
	@GetMapping("/shop/order")
	public String order() {
		
		
		
		
		return "/shop/order";
	}
	
	@GetMapping("/shop/payment")
	public String payment() {
		
		
		
		
		return "/shop/payment";
	}
	
	
}
