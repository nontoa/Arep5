package edu.eci.arem.demo;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MessageService implements IMessageServices{
	
	@Autowired
	private IMessageRepository messageRepository;
	
	@Override
	public List<Message> list() throws SQLException {
		return messageRepository.findAll();
	}
}


