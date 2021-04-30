package com.demo.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RestController
public class DemoController {
	private Logger logger = LogManager.getLogger(DemoController.class);

	@RequestMapping(path = "/demo", method = RequestMethod.GET)
	public String getTestPage() {
		logger.info("Test Page is returned..");
		return "test";
	}

	@RequestMapping(path = "/regform", method = RequestMethod.GET)
	public String getRegForm() {
		logger.info("Emp Form is returned..");
		return "empform";
	}

	@RequestMapping(path = "save", method = RequestMethod.POST)
	public ModelAndView processForm(@RequestParam("empId") String empId, @RequestParam("name") String name,
			@RequestParam("city") String city, @RequestParam("salary") String salary) {

		Map<String, String> dataMap=new HashMap<>();
		dataMap.put("empId", empId);
		dataMap.put("name", name);
		dataMap.put("city", city);
		dataMap.put("salary", salary);
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("emp", dataMap);
		mv.setViewName("result");
		return mv;
	}
}
