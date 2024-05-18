package com.ytech.eazyschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ytech.eazyschool.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
