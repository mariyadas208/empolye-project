package com.tcs.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController {
	@RequestMapping("/Raj")
public String greeting() {;
String s="info";
return s;
}
}
