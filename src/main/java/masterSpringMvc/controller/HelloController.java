package masterSpringMvc.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@EnableAutoConfiguration
public class HelloController {
	
	
	@RequestMapping("/")
	public String hello(){
		return "greet";
	}

}
