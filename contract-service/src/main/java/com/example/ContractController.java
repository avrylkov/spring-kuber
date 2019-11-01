package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ContractController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContractController.class);

    @RequestMapping("/")
    public String hello() {
        return "Hello from Contract Controller";
    }

    @GetMapping("/organization/{id}")
    public List<String> findByOrganization(@PathVariable("id") Long id) {
        LOGGER.info("ContractController. Organization find: id={}", id);
        return Collections.singletonList("find by id= " + id);
    }

}
