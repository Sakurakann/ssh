package com.sknn.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sknn.ssh.entity.SUserEntity;
import com.sknn.ssh.service.UserService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA. Project: ssh. Package: com.sknn.ssh.action. User: Administrator.
 * Date: 2017-11-14 15:13. Author: Haiyangp.
 */
@Component("userAction")
public class UserAction extends ActionSupport {

  /*@Autowired
  @Qualifier("userService")*/
  @Resource(name = "userService")
  private UserService userService;

  public String create() {
    SUserEntity user = new SUserEntity();
    user.setUsername("1");
    user.setLoginname("1");
    user.setLoginpass("1");
    user.setEmail("1");

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    userService.addUser(user);
    return "success";
  }
}