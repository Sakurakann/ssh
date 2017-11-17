package com.sknn.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * Created with IntelliJ IDEA.
 * Project: ssh.
 * Package: com.sknn.ssh.action.
 * User: Administrator.
 * Date: 2017-11-16 09:26.
 * Author: Haiyangp.
 */
@Namespace("/struts")
@ParentPackage("tiles-default")
@Results({
    @Result(name = "success", type = "tiles", location = "tilesPage")
})
public class TilesAction extends ActionSupport {

  private static final long serialVersionUID = -4572239931546259749L;

  @Action("tiles")
  public String helloTile() {
    return SUCCESS;
  }

}
