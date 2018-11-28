package com.zzz.demo.springmember;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/28 16:37
 * @since v1.0.0
 */
@RestController
public class ConfigController {

	@Value("${aa}")
	String aa;

	@RequestMapping("/")
	public String hello() {
		return "member aa value:" + aa;
	}

}
