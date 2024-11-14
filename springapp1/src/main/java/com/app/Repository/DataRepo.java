package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Data;
@Repository
public interface DataRepo extends JpaRepository<Data, Integer>{

}
