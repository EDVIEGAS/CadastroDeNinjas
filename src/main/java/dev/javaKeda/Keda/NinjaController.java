package dev.javaKeda.Keda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
	
	@GetMapping("/boasVindas")
	public String boasVindas() { 
		return "Essa e minha primeira mensagem nessa API";
	}
	
	@GetMapping("/")
	public String home() {
		return "Bem-vindo a minha API!";
	}
}
