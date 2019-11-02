package com.example;

import com.example.model.Contract;
import com.example.repository.ContractRepository;
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
public class ContractController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContractController.class);

    @Autowired
    private ContractRepository contractRepository;

    @RequestMapping("/")
    public String hello() {
        return "Hello from Contract Controller";
    }

    @GetMapping("/contract-organization/{id}")
    public List<Contract> findByOrganization(@PathVariable("id") Long id) {
        LOGGER.info("ContractController. Organization find: id={}", id);
        return contractRepository.findByOrganizationId(id);
    }

    @GetMapping("/contract/{id}")
    public Optional<Contract> findByContract(@PathVariable("id") Long id) {
        LOGGER.info("ContractController. Contract find: id={}", id);
        return contractRepository.findByContractId(id);
    }


}
