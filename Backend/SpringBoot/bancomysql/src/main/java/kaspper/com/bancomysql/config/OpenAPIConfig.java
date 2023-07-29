package kaspper.com.bancomysql.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfig {
	
	@Value("${kaspper.openapi.dev-url}")
	public String devUrl;
	@Value("${kaspper.openapi.prod-url}")
	public String prodUrl;
	
	@Bean
	public OpenAPI myOpenAPI() {
		Server devServ = new Server();
		devServ.setUrl(devUrl);
		devServ.setDescription("URL de desenvolvimento");
		
		Server prodServ = new Server();
		prodServ.setUrl(prodUrl);
		prodServ.setDescription("URL de produção");
		
		Contact contato = new Contact();
		contato.setEmail("eron.moraes7@gmail.com");
		contato.setName("Eron Moraes");
		contato.setUrl("https://www.linkedin.com/in/eronmoraes7/");
		
		Info info = new Info()
				.title("API de apontamentos Kaspper Academy ")
				.version("1.0")
				.contact(contato)
				.description("API para endpoints de Apontamentos");
		
		return new OpenAPI()
				.info(info)
				.servers(List.of(devServ, prodServ));
	}
}
