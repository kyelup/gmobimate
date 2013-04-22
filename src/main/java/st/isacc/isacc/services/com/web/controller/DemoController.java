package st.isacc.isacc.services.com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String welcomeHandler() {
		return "welcome";
	}
}
