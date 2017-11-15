package com.sknn.ssh.entity;

import java.sql.Time;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * Project: ssh.
 * Package: com.sknn.ssh.entity.
 * User: Administrator.
 * Date: 2017-11-14 14:51.
 * Author: Haiyangp.
 */
@Entity
@Table(name = "S_USER", schema = "SCOTT", catalog = "")
public class SUserEntity {

  private long userid;
  private String username;
  private String loginname;
  private String loginpass;
  private String email;
  private String addr;
  private String describe;
  private String phone;
  private String state;
  private Time inserttime;
  private Time updatetime;
  private Time lastlogintime;
  private String remark;

  @Id
  @Column(name = "USERID")
  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

  @Basic
  @Column(name = "USERNAME")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Basic
  @Column(name = "LOGINNAME")
  public String getLoginname() {
    return loginname;
  }

  public void setLoginname(String loginname) {
    this.loginname = loginname;
  }

  @Basic
  @Column(name = "LOGINPASS")
  public String getLoginpass() {
    return loginpass;
  }

  public void setLoginpass(String loginpass) {
    this.loginpass = loginpass;
  }

  @Basic
  @Column(name = "EMAIL")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Basic
  @Column(name = "ADDR")
  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Basic
  @Column(name = "DESCRIBE")
  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }

  @Basic
  @Column(name = "PHONE")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Basic
  @Column(name = "STATE")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Basic
  @Column(name = "INSERTTIME")
  public Time getInserttime() {
    return inserttime;
  }

  public void setInserttime(Time inserttime) {
    this.inserttime = inserttime;
  }

  @Basic
  @Column(name = "UPDATETIME")
  public Time getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(Time updatetime) {
    this.updatetime = updatetime;
  }

  @Basic
  @Column(name = "LASTLOGINTIME")
  public Time getLastlogintime() {
    return lastlogintime;
  }

  public void setLastlogintime(Time lastlogintime) {
    this.lastlogintime = lastlogintime;
  }

  @Basic
  @Column(name = "REMARK")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    SUserEntity that = (SUserEntity) o;

    if (userid != that.userid) {
      return false;
    }
    if (username != null ? !username.equals(that.username) : that.username != null) {
      return false;
    }
    if (loginname != null ? !loginname.equals(that.loginname) : that.loginname != null) {
      return false;
    }
    if (loginpass != null ? !loginpass.equals(that.loginpass) : that.loginpass != null) {
      return false;
    }
    if (email != null ? !email.equals(that.email) : that.email != null) {
      return false;
    }
    if (addr != null ? !addr.equals(that.addr) : that.addr != null) {
      return false;
    }
    if (describe != null ? !describe.equals(that.describe) : that.describe != null) {
      return false;
    }
    if (phone != null ? !phone.equals(that.phone) : that.phone != null) {
      return false;
    }
    if (state != null ? !state.equals(that.state) : that.state != null) {
      return false;
    }
    if (inserttime != null ? !inserttime.equals(that.inserttime) : that.inserttime != null) {
      return false;
    }
    if (updatetime != null ? !updatetime.equals(that.updatetime) : that.updatetime != null) {
      return false;
    }
    if (lastlogintime != null ? !lastlogintime.equals(that.lastlogintime)
        : that.lastlogintime != null) {
      return false;
    }
    if (remark != null ? !remark.equals(that.remark) : that.remark != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = (int) (userid ^ (userid >>> 32));
    result = 31 * result + (username != null ? username.hashCode() : 0);
    result = 31 * result + (loginname != null ? loginname.hashCode() : 0);
    result = 31 * result + (loginpass != null ? loginpass.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (addr != null ? addr.hashCode() : 0);
    result = 31 * result + (describe != null ? describe.hashCode() : 0);
    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    result = 31 * result + (state != null ? state.hashCode() : 0);
    result = 31 * result + (inserttime != null ? inserttime.hashCode() : 0);
    result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
    result = 31 * result + (lastlogintime != null ? lastlogintime.hashCode() : 0);
    result = 31 * result + (remark != null ? remark.hashCode() : 0);
    return result;
  }
}
