package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Rishabh Sharma");
		model.addAttribute("id", 23415);

		List<String> friends = new ArrayList<String>();
		friends.add("Sahil");
		friends.add("Rajveer");
		friends.add("Akshdeep");

		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}

	@RequestMapping(path="/help", method = RequestMethod.GET)
	public ModelAndView help() {
		
		System.out.println("this is help controller");
		
		// creating the model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		// setting the data
		modelAndView.addObject("name", "Rehan");
		modelAndView.addObject("rollnumber", 12443);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		
		//marks 
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(2324);
		list.add(777777777);
		list.add(9657);
		list.add(5646);
		list.add(46444);

		
		modelAndView.addObject("marks", list);		
		
		
		// setting the view name
		modelAndView.setViewName("help");
		
		
		return modelAndView;
	}

}
