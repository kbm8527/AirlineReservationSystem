package kr.co.winery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {


	
	@GetMapping(value={"/index"})
	public String index() {
	

		return "/index";
	}
}
