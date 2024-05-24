package com.ytech.eazyschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ytech.eazyschool.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
