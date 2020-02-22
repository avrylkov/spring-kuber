package com.example;

import com.example.client.ContractClient;
import com.example.config.OrganizationConfig;
import com.example.model.Contract;
import com.example.model.Organization;
import com.example.repository.OrganizationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OrganizationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    private ContractClient contractClient;
    @Autowired
    private OrganizationRepository organizationRepository;
    @Autowired
    private OrganizationConfig organizationConfig;

    @RequestMapping("/")
    public String hello() {
        return "Hello from Organization Controller";
    }

    @GetMapping("/contract-organization/{id}")
    public List<Contract> findContractsByOrganization(@PathVariable("id") Long id) {
        LOGGER.info("OrganizationController. Contracts by Organization find: id={}", id);
        // interservice interaction
        List<Contract> contracts = contractClient.findByOrganization(id);
        contracts.forEach(c -> c.setCurrentUser(organizationConfig.getUsername()));
        return contracts;
    }

    @GetMapping("/organization/{id}")
    public Optional<Organization> findByOrganization(@PathVariable("id") Long id) {
        LOGGER.info("OrganizationController. Organization find: id={}", id);
        return organizationRepository.findByOrganizationId(id);
    }

    @GetMapping("/pin")
    public String getPinCode() {
        LOGGER.info("get pin code secret");
        return organizationConfig.getPincode();
    }

    @GetMapping("/user")
    public String getuser() {
        LOGGER.info("get User");
        return organizationConfig.getUsername();
    }

    @GetMapping("/message")
    public String ge() {
        LOGGER.info("get Message");
        return organizationConfig.getMessage();
    }

    @GetMapping("/config")
    public String geConfig() {
        LOGGER.info("get config");
        return organizationConfig.getConfig();
    }

}
