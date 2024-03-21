package nl.application.springapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"nl.application.springapp","nl.tutorials"})
public class AppConfig {}
