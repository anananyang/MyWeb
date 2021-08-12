package com.anyang.myWeb.service.user.impl;

import java.util.List;

import com.anyang.myWeb.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.anyang.myWeb.service.user.UserService;
import com.anyang.myWeb.dao.user.UserDao;
import com.anyang.myWeb.entity.user.User;


@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService{

  @Autowired
  private UserDao userDao;

  public List<User> getAll() {
    return super.getAll(userDao);
  }

  public User getById(Long id) {
    return super.getById(userDao, id);
  }

  public boolean save(User user) {
    return super.save(userDao, user);
  }

  public boolean deleteById(Long id) {
    return super.deleteById(userDao, id);
  }

  public int deleteByIds(Long[] ids) {
    return super.deleteByIds(userDao, ids);
  }
}
