package Application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class requestController {
	
	@RequestMapping("/hello")
	public String HelloApi()
	{
		
		return "This is Response of API";
	}

}
