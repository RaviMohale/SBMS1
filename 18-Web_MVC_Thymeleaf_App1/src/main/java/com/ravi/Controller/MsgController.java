package com.ravi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", "welcom to first thymeleaf....");
		
		return "index";
	}
	@GetMapping("/greet")
	public String greetMsg(Model model) {
		model.addAttribute("msg", "good afternoon friend");
		return "index";
	}

}
