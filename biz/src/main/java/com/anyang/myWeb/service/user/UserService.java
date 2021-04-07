package com.anyang.myWeb.service.user;

import java.util.List;
import java.util.Map;

import com.anyang.myWeb.entity.user.User;

public interface UserService {
  public List<User> getAll();
  
  public User getById(Long id);

  public boolean save(User user);

  public boolean deleteById( Long id);

  public  int deleteByIds(Long[] ids);

}
