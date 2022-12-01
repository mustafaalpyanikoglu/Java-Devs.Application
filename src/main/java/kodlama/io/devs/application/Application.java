package kodlama.io.devs.application;

import kodlama.io.devs.application.business.concretes.LanguageManager;
import kodlama.io.devs.application.dataAccess.concretes.InMemoryLanguageRepository;
import kodlama.io.devs.application.entities.concretes.Language;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
