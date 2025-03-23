package com.example.tobi.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

    private ConnectionMaker connectionMaker;

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setConnectionMaker(connectionMaker);
        return userDao;
    }

    private ConnectionMaker connectionMaker() {
        return connectionMaker;
    }


}
//
//    public AccountDao accountDao(){
//        return new AccountDao(connectionMaker());
//
//    }
//    public MessageDao messageDao(){
//        return new MassageDao(connectionMaker());
//    }
//

//    @Bean
//    public ConnectionMaker connectionMaker(){
//        return new DConnectionMaker();
//    }
//
//    @Bean
//    public ConnectionMaker connectionMaker(){
//        return new LocalDBConnectionMaker();
//    }
//
//    @Bean
//    public ConnectionMaker connectionMaker(){
//        return new ProductionDBConnectionMaker();
//    }
//
//}
