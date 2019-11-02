package com.example.repository;

import com.example.model.Organization;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrganizationRepository {

    private List<Organization> organizations = new ArrayList<>();

    public Organization add(Organization organization) {
      organizations.add(organization);
      return organization;
    }

    public Optional<Organization> findByOrganizationId(Long id) {
        return this.organizations
                .stream()
                .filter(o -> o.getId() == id)
                .findFirst();
    }

}
