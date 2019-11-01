package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "contract-service")
public interface ContractClient {

   @GetMapping("/organization/{id}")
   List<String> findByOrganization(@PathVariable("id") Long id);

}
