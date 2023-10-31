package kr.co.OrcaARS.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import kr.co.OrcaARS.persistance.MemberRepo;
import kr.co.OrcaARS.persistance.TermsRepo;
import kr.co.OrcaARS.service.MemberService;

import kr.co.OrcaARS.vo.MemberVo;
import kr.co.OrcaARS.vo.TermsVo;

@Controller
public class MemberController {
	
	@Autowired
	private TermsRepo termsRepo;
	
	@Autowired
	private MemberRepo memberRepo;
	
	@Autowired
	private MemberService service;
	
	
	@GetMapping("/member/login")
	public String login(String success, Model model) {
		
		model.addAttribute("success", success);
		
		return "/member/login";
	}
		
	@PostMapping("/member/login")
	public String login(MemberVo vo, HttpSession sess) {
		
		MemberVo member = service.selectMember(vo);
		
		if(member != null) {
			sess.setAttribute("member", member);
			sess.setAttribute("type", member.getType());
			
			return "redirect:/index";
			
		}else {
			
			return "redirect:/member/login?success=fail";

		}
		
		
		
		
	}
	

	@GetMapping("/member/term")
	public String term (String type, Model model) {
		
		TermsVo vo = termsRepo.findById(0).get();
		
		model.addAttribute("type", type);
		model.addAttribute(vo); // view와 공유
		
		
		return "/member/term";
	}
	
	@GetMapping("/member/register")
	public String register() {
		
		return "/member/register";
	}
	
	
	@PostMapping("/member/register")
	public String register(MemberVo vo, HttpServletRequest req) {
		
		vo.setIp(req.getRemoteAddr());
		vo.setRdate(LocalDateTime.now().toString());
		
		memberRepo.save(vo);
		
		return "redirect:/member/login";
				
		
	}
	
	
	@ResponseBody //--> 자바 객체(Json)를 HTTP 응답 몸체로 전송함
	@GetMapping("/member/register/idCheck")
	public int idCheck(String uid) throws Exception {
		
		int result = 0;
		result = service.idCheck(uid);
		
		return result;
	}
	
	
}
