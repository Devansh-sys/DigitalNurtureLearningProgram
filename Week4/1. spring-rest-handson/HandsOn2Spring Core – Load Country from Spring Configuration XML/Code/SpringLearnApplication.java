package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Inside main");
		displayDate(); // Call the new method
	}

	public static void displayDate() {
		LOGGER.info("START");
		// Load the Spring XML configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

		// Get the bean from the context
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		try {
			// Parse the date string and print it
			Date date = format.parse("31/12/2018");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		LOGGER.info("END");
	}
}
