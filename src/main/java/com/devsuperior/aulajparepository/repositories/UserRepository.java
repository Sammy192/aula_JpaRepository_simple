package com.devsuperior.aulajparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulajparepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
