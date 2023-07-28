package kaspper.com.bancomysql.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/**")
			.allowedOrigins("httm://localhost/4200")
			.allowedMethods("GET", "POST", "DELETE","OPTIONS", "HEAD");
	}

}
