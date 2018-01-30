package Business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/ClientConfiguration/")
public class ClientConfiguration
{
	@GetMapping
	public String GetClientConfiguration()
	{
		return "Hello";
	}
}
