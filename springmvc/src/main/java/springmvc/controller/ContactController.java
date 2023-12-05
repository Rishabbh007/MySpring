package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService; 


@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {

		m.addAttribute("Header", "LearnCodingWithRishabh");
		m.addAttribute("desc", "Home for Programmer");
		
		System.out.println("Common Data to Form");
	}
	
	@RequestMapping("/")
	public String about() {
		
		return "about";
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		System.out.println("Creating form");
		return "contact";
	}
	
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user , Model model ) {
		
		if(user.getEmail().isEmpty()) {	
			return "redirect:/contact";
		}
		
		
		System.out.println(user);
		this.userService.createUser(user);
		return "success";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			@RequestParam(name="email", required= false) String email , 
//			@RequestParam("userName") String userName , 
//			@RequestParam("password") String password, Model model ) {
//		
//		
//		
//		User user = new User();
//		user.setEmail(email);
//		user.setUserName(userName);
//		user.setPassword(password);
//		
//		
//		model.addAttribute("user", user);
//		
//		
//
//		return "success";
//	}
	
}
