package com.hr.Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping(value="/")
	public String Msg()
	{
		return "Hello Spring";
	}

}
