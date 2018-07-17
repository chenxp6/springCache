package cn.chenxp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.chenxp.model.CsUser;

/**
 * 
 * @author chenxp
 *
 */


public interface UserService {
	
	public CsUser get(String username);

}
