package com.map.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {

}
