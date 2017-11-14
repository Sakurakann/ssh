package com.sknn.ssh.service.impl;

import com.sknn.ssh.dao.UserDao;
import com.sknn.ssh.entity.SUserEntity;
import com.sknn.ssh.service.UserService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA. Project: ssh. Package: com.sknn.ssh.service.impl. User:
 * Administrator. Date: 2017-11-14 15:23. Author: Haiyangp.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  public void addUser(SUserEntity user) {

    userDao.saveUser(user);
  }
}
