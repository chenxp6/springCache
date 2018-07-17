package cn.chenxp.service.impl;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.chenxp.dao.UserDao;
import cn.chenxp.model.CsUser;
import cn.chenxp.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	@Override
	@Cacheable(key="'userServiceImpl.get.'+#username", value="redisCache"  )
	public CsUser get(String username) {
		return userDao.get(username);
	}

}
