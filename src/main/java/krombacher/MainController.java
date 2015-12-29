package krombacher;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public @ResponseBody String hello() {
		return "Hello Krombacher";
	}
}
