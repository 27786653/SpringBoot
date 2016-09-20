package com.yuhi.carface.service.sysuser.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhi.carface.dao.UserDao;
import com.yuhi.carface.entity.SysUser;
import com.yuhi.carface.service.sysuser.SysUserService;
@Service
public class SysUserServiceimpl implements SysUserService {

	@Autowired
	private UserDao userdao;
	@Override
	public SysUser findByUsercode(String usercode) {
		// TODO Auto-generated method stub
		return userdao.findByUsercode(usercode);
	}

	@Override
	public void save(SysUser user) {
		// TODO Auto-generated method stub
		userdao.save(user);
	}

}
