package com.example.repository;

import com.example.model.Organization;

import java.util.ArrayList;
import java.util.List;

public class OrganizationRepository {

    private List<Organization> organizations = new ArrayList<>();

    public Organization add(Organization organization) {
      organization.setId((long) (organizations.size() + 1));
      organizations.add(organization);
      return organization;
    }

}
