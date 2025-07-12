package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.SpringLearnApplication;
import com.cognizant.spring_learn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START");
        // 1. Load the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        // 2. Retrieve the bean named "in" from the context
        Country country = context.getBean("in", Country.class);

        LOGGER.info("END");

        // 3. Return the Country object
        return country;
    }
}
