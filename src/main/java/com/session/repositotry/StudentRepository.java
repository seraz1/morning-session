package com.session.repositotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.session.entity.Students;
@Repository
public interface StudentRepository  extends JpaRepository<Students, Integer>{
	

}
