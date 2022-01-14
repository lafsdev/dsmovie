package com.lafsdev.dsmovie.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lafsdev.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
