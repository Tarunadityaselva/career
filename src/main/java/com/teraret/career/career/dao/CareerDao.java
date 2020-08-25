package com.teraret.career.career.dao;

import com.teraret.career.career.model.Career;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerDao extends CrudRepository<Career, Long> {

}
