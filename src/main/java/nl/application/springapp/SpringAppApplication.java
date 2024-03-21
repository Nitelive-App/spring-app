package nl.application.springapp;

import nl.application.springapp.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class SpringAppApplication implements CommandLineRunner {

	@Autowired
	private SumService sumService;

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws IOException {
		InputStream is = sumService.getFileAsIOStream("static/ascii_art");
		sumService.printFileContent(is);
		System.out.println("Using autowired external dependency SumLibrary:");
		System.out.println(sumService.sum(2.3, 5.6));
	}
}
