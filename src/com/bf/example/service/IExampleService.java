package com.bf.example.service;

import java.util.List;

import com.bf.example.entity.ExampleEntity;

/**
 * 
 * Created by pangdongbo on 2014年11月2日
 */
public interface IExampleService {

	public List<ExampleEntity> saveExample(List<ExampleEntity> examples);
}
