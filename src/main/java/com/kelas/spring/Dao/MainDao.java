package com.kelas.spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelas.spring.Model.Main;

public interface MainDao extends JpaRepository<Main,Long>{
	
	//String findById(Long id);

}
