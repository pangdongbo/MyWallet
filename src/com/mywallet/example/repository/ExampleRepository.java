package com.mywallet.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mywallet.example.entity.ExampleEntity;

/**
 * 
 * Created by pangdongbo on 2014年11月2日
 */
public interface ExampleRepository extends MongoRepository<ExampleEntity, String> {
	
	List<ExampleEntity> findByExpression(String expression);
	
}
