package com.bangshinchul.backend.auth;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRoleRepository extends CrudRepository<AuthRole, Long> {
    AuthRole findByAuthId(Long authId);
}
