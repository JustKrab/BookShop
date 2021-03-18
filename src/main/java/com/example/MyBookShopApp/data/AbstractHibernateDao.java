//package com.example.MyBookShopApp.data;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManagerFactory;
//import org.hibernate.Session;
//@Repository
//public abstract class AbstractHibernateDao<T> {
//
//    private Class<T> clazz;
//
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//
//    public void setClazz(Class<T> clazz){
//        this.clazz=clazz;
//    }
//
//    public T findOne(Long id){
//        return getSession().find(clazz,id);
//    }
//
//    public Session getSession(){
//        return entityManagerFactory.createEntityManager().unwrap(Session.class);
//    }
//}
