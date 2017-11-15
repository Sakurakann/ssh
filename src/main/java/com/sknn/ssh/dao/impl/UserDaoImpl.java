package com.sknn.ssh.dao.impl;

import com.sknn.ssh.dao.UserDao;
import com.sknn.ssh.entity.SUserEntity;
import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Project: ssh.
 * Package: com.sknn.ssh.dao.impl.
 * User: Administrator.
 * Date: 2017-11-14 15:30.
 * Author: Haiyangp.
 */
@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

  @Resource(name = "sessionFactory")
  public void setSessionFactoryDI(SessionFactory sessionFactory) {
    super.setSessionFactory(sessionFactory);
    /*this.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);*/
  }

  public void saveUser(SUserEntity user) {
    this.getHibernateTemplate().saveOrUpdate(user);
  }
}
