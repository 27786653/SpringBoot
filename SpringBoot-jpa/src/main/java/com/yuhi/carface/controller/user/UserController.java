package com.yuhi.carface.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuhi.carface.entity.SysUser;
import com.yuhi.carface.service.sysuser.SysUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/save")
	public String saveuser(SysUser user){
		sysUserService.save(user);
		return "success";
	}
	@RequestMapping("/findByUsercode")
	public SysUser findByUsercode(SysUser user){
		user=sysUserService.findByUsercode(user.getUsercode());
		return user;
	}
	
}
