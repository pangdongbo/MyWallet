package com.bf.example.service.impl;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bf.example.entity.ExampleEntity;
import com.bf.example.repository.ExampleRepository;
import com.bf.example.service.IExampleService;

@Service
public class ExampleServiceImpl implements IExampleService {

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private ExampleRepository exampleRepository;

	/**
	 * 保存例子
	 * 
	 * @param examples
	 */
	public List<ExampleEntity> saveExample(List<ExampleEntity> examples) {
		List<ExampleEntity> lstExamples = exampleRepository.save(examples);
		return lstExamples;
	}
}
