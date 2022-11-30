package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController 
{
	@GetMapping("/user")
	public ModelAndView getUserDetails()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("name","Ashok Kumar");
		mav.addObject("emailId" ,"Ashokit@gamil.com");
		mav.addObject("phNo","+91 123456");
		mav.setViewName("index");
		return mav;
	}
	
	
	@GetMapping("/userApproach2")
	public String getUserDetails1(Model model)
	{
		model.addAttribute("name","Karan Kumar G M");
		model.addAttribute("emailId","karan.kumar7@gmail.com");
		model.addAttribute("phNo","+91 123456789");
		
		return "index";
	}

}
