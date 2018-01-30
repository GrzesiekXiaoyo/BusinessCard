package Business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
public class BusinessCardApplication extends SpringBootServletInitializer
{
	public static void main(String[] args) throws IOException
	{
		SpringApplication.run(BusinessCardApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(BusinessCardApplication.class);
	}
}
