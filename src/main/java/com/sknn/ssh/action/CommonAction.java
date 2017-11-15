package com.sknn.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * <P> Parent packageName must be action/actions/struts/struts2!
 *     ClassName must end with Action!  </P>
 * Created with IntelliJ IDEA.
 * Project: ssh.
 * Package: com.sknn.ssh.action.
 * User: Administrator.
 * Date: 2017-11-15 12:54.
 * Author: Haiyangp.
 */
@ParentPackage("struts-default")
@Namespace("/common")
@Results({
    @Result(name = "success", location = "/index.jsp"),
    @Result(name = "error", location = "/WEN-INF/jsp/error.jsp"),
    @Result(name = "failure", location = "/login.jsp", type = "tiles")
})
@ExceptionMappings({
    @ExceptionMapping(
        exception = "java.lang.RuntimeException",
        result = "/WEN-INF/jsp/error.jsp")
})
@InterceptorRefs({
    // value = interceptorName or interceptorStackName
    @InterceptorRef(value = "first must be defaultStack!"),
    @InterceptorRef("timer")
})
public class CommonAction extends ActionSupport {

  private static final long serialVersionUID = 5255176673964700928L;

  //url: localhost:8081/ssh/hello or localhost:8081/ssh/common/hello
  @Actions({
      @Action("/hello")
  })
  public String hello() {
    System.out.println("/hello");
    return SUCCESS;
  }

  //url: localhost:8081/ssh/common/hellore
  @Action("hellore")
  public String helloRe() {
    System.out.println("hellore");
    return SUCCESS;
  }

  @Override
  public String execute() throws Exception {
    return super.execute();
  }
}
