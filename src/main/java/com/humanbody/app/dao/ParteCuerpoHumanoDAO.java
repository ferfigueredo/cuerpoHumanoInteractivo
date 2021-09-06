package com.humanbody.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.humanbody.app.entity.ParteCuerpoHumano;

@Repository
public interface ParteCuerpoHumanoDAO extends CrudRepository<ParteCuerpoHumano, Long>{
	

}
