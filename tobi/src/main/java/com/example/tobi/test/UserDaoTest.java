package com.example.tobi.test;

import com.example.tobi.dao.*;
import com.example.tobi.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ApplicationContext context= new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao userDao = (UserDao) context.getBean("userDao");

        UserDao dao3= context.getBean("userDao", UserDao.class);
        UserDao dao4= context.getBean("userDao", UserDao.class);

        System.out.println(dao3);
        System.out.println(dao4);



        UserDao dao=new DaoFactory().userDao();

        User user =new User();
        user.setId("whiteshi");
        user.setName("김한국");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId()+"등록성공");

        User user2 =dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId()+"조회성공");

    }
}
