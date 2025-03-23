package com.example.tobi.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DaoFactory {

    private ConnectionMaker connectionMaker;

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());
        return userDao;
    }

    private ConnectionMaker connectionMaker() {
        return connectionMaker;
    }

    @Bean
    public DataSource dataSource() {
            SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

            dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
            dataSource.setUrl("jdbc:mysql://localhost:3306/tobi");
            dataSource.setUsername("root");
            dataSource.setPassword("1234");

            return dataSource;
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
