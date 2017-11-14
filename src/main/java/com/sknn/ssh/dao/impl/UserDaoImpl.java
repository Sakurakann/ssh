package com.sknn.ssh.dao.impl;

import com.sknn.ssh.dao.UserDao;
import com.sknn.ssh.entity.SUserEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA. Project: ssh. Package: com.sknn.ssh.dao.impl. User: Administrator.
 * Date: 2017-11-14 15:30. Author: Haiyangp.
 */
@Component("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

  public UserDaoImpl(SessionFactory sessionfactory){
    setSessionFactory(sessionfactory);
  }
  private HibernateTemplate template = getHibernateTemplate();

  public void saveUser(SUserEntity user) {
    template.save(user);
  }
}
