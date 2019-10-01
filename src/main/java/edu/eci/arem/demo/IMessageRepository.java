package edu.eci.arem.demo;

import java.sql.SQLException;
import java.util.*;


public interface IMessageRepository {
    public List<Message> findAll() throws SQLException ;  
}