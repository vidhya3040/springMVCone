package com.springmvcone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingPageController {

	
	@RequestMapping(path="/show.do/{name}",method = RequestMethod.GET)
	public String show(@PathVariable("name")String nm,Model model) {
		model.addAttribute("name",nm);
		return "showpage";
	}
	
	@RequestMapping(path="/greet.do",method = RequestMethod.GET)
	public String greet(@RequestParam("name")String nm,Model model) {
		String msg="hello world!";
		model.addAttribute("msg",msg);
		model.addAttribute("name",nm);
		return "greetpage";
	}
	
	
	@RequestMapping(path="/psl.do",method = RequestMethod.GET)
	public String greetx() {
		return "sayhello";
	}
	
	@RequestMapping(path="/topics.do",method = RequestMethod.GET)
	public String topics(Model model) {
		String topics[]= {"Java","Angular","React","SQL"};
		model.addAttribute("topics",topics);
		return "topicspage";
	}
}
