package com.sluka.taras.repositories;

import com.sluka.taras.common.model.Role;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role findByName(String role);
    public Role findById(Long id);

}
