package com.olive.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.model.Employee;
import com.olive.model.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Integer>{
	

}
