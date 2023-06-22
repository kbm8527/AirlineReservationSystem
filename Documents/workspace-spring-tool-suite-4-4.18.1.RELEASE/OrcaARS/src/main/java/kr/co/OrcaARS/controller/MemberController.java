package kr.co.OrcaARS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/member/login")
	public String login() {
		
		return "/member/login";
	}
		

	@GetMapping("/member/term")
	public String term () {
		
		return "/member/term";
	}
	
	@GetMapping("/member/register")
	public String register() {
		
		return "/member/register";
	}
}
