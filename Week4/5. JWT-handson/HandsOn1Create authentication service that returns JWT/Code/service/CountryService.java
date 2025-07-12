package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    public Country getCountry(String code) {
        LOGGER.info("START");

        // 1. Load the XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        // 2. Get the country list from the context
        List<Country> countries = (List<Country>) context.getBean("countryList");

        // 3. Use a lambda stream to find the matching country (case-insensitive)
        Optional<Country> result = countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst();

        LOGGER.info("END");

        // 4. Return the country if found, otherwise return null
        return result.orElse(null);
    }
}
