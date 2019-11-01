package com.example;

import com.example.client.ContractClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    private ContractClient contractClient;

    @RequestMapping("/")
    public String hello() {
        return "Hello from Organization Controller";
    }

    @RequestMapping("/organization/{id}")
    public List<String> findByOrganization(@PathVariable("id") Long id) {
        LOGGER.info("OrganizationController. Organization find: id={}", id);
        return contractClient.findByOrganization(id);
    }

}
