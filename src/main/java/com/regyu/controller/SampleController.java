package com.regyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regyu.domain.SampleVO;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello world";
	}

	@GetMapping("/sample")
	public SampleVO makeSample() {
		SampleVO vo = new SampleVO();
		vo.setVal1("val1");
		vo.setVal2("val2");
		vo.setVal3("val3");

		System.out.println(vo);

		return vo;
	}

}
