package com.yuhi.carface.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.yuhi.carface.entity.SysUser;

@Transactional
public interface UserDao extends CrudRepository<SysUser, Long> {
  public SysUser findByUsercode(String usercode);
}