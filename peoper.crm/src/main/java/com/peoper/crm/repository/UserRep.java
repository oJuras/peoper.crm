package com.peoper.crm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peoper.crm.model.Users;

@Repository
public interface UserRep extends JpaRepository<Users, Long> {

}
