package com.map.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport,Integer> {

}
