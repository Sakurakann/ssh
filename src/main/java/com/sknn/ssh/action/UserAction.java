package com.sknn.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sknn.ssh.entity.SUserEntity;
import com.sknn.ssh.service.UserService;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Project: ssh.
 * Package: com.sknn.ssh.action.
 * User: Administrator.
 * Date: 2017-11-14 15:13.
 * Author: Haiyangp.
 */
@Component("userAction")
public class UserAction extends ActionSupport {

  private Logger logger = Logger.getLogger("sknn");
  private static final long serialVersionUID = -6334420144490128952L;

  @Resource
  private UserService userService;

  public String create() {
    SUserEntity user = new SUserEntity();
    user.setUsername("1");
    user.setLoginname("1");
    user.setLoginpass("1");
    user.setEmail("1");
    try {
      int a = 1/0;
    } catch (Exception e) {
      logger.error(e.getMessage());
    }

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    //userService.addUser(user);
    return "success";
  }
}
