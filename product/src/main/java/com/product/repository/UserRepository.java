package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Model.User;

public interface UserRepository  extends JpaRepository<User, Long> {

}
