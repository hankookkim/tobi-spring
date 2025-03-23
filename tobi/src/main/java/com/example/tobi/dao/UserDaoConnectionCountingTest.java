package com.example.tobi.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoConnectionCountingTest {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDao userDao = context.getBean("UserDao",UserDao.class);




        CountingConnectionMaker ccm = context.getBean("connectionMaker",CountingConnectionMaker.class);
        System.out.println("Connection counter : "+ ccm.getCounter());
    }
}
