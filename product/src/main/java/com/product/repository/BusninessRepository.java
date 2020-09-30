package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Model.BusinessRegistration;

public interface BusninessRepository extends JpaRepository<BusinessRegistration, Long> {

}
