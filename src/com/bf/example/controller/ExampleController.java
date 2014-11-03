package com.bf.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bf.common.core.controller.BaseController;
import com.bf.example.entity.ExampleEntity;
import com.bf.example.service.IExampleService;

/**
 * 一个例子
 * Created by pangdongbo on 2014/10/29.
 */
@Controller
@RequestMapping("/example")
public class ExampleController extends BaseController {
	
	@Autowired
	IExampleService exampleService;
	
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public String hellWord() {
		List<ExampleEntity> lstExampleEntity = new ArrayList<ExampleEntity>();
		ExampleEntity objExample = null;
		for (int i = 0; i < 10; i++) {
			objExample = new ExampleEntity();
			objExample.setExpression("样例：" + (i + 1));
			lstExampleEntity.add(objExample);
		}
		exampleService.saveExample(lstExampleEntity);
		return "example/helloworld";
	}

}
