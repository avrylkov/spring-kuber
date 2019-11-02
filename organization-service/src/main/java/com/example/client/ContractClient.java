package com.example.client;

import com.example.model.Contract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "contract-service")
public interface ContractClient {

   @GetMapping("/contract-organization/{id}")
   List<Contract> findByOrganization(@PathVariable("id") Long id);

}
