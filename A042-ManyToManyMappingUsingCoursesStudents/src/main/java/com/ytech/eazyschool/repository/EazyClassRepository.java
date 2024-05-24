package com.ytech.eazyschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ytech.eazyschool.model.EazyClass;

@Repository
public interface EazyClassRepository extends JpaRepository<EazyClass, Integer> {

}
