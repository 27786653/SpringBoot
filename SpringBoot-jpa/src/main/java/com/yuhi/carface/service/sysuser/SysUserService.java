package com.yuhi.carface.service.sysuser;

import com.yuhi.carface.entity.SysUser;

public interface SysUserService {
	SysUser findByUsercode(String email);
	void save(SysUser user);
}
