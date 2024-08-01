package com.api.crud_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud_backend.models.UserModels;

@Repository
public interface IUserRepository extends JpaRepository<UserModels, Long>{
    
}
