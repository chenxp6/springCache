package cn.chenxp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.chenxp.model.CsUser;
import cn.chenxp.service.UserService;

/**
 * 
 * @author chenxp
 *
 */

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
	@Resource
	private UserService userSerivice;

	@RequestMapping(value = "get/{name}", method = RequestMethod.GET)
	public CsUser testReids(@PathVariable String name) {
		CsUser user = userSerivice.get(name);
		return user;
	}
	
	

}
