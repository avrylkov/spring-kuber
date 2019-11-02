package com.example.repository;

import com.example.model.Contract;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ContractRepository {

    private List<Contract> contracts = new ArrayList<>();

    public Contract add(Contract contract) {
        contracts.add(contract);
        return contract;
    }

    public List<Contract> findByOrganizationId(Long id) {
        List<Contract> contracts = this.contracts
                .stream()
                .filter(c -> c.getOrganization() == id)
                .collect(Collectors.toList());
        return contracts;
    }

    public Optional<Contract> findByContractId(Long id) {
        return this.contracts
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst();
    }

}
