package com.mywallet.example.service.impl;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mywallet.example.entity.ExampleEntity;
import com.mywallet.example.repository.ExampleRepository;
import com.mywallet.example.service.IExampleService;

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
