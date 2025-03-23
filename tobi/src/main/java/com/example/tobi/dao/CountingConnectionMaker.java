package com.example.tobi.dao;

import lombok.Getter;

import java.sql.Connection;
import java.sql.SQLException;

@Getter
public class CountingConnectionMaker implements ConnectionMaker {


    int counter = 0;
    private ConnectionMaker realconnectionMaker;

    public CountingConnectionMaker() {
        this.realconnectionMaker = realconnectionMaker;
    }

    public Connection makeConnection() throws ClassNotFoundException, SQLException{
        this.counter++;
        return realconnectionMaker.makeConnection();

    }

}
