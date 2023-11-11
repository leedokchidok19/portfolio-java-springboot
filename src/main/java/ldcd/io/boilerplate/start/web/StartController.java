package ldcd.io.boilerplate.start.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

	@GetMapping("/test")
	public String helloworld() {
		
		return "hellowworld";
	}
}
