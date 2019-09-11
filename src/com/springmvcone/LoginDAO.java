package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("loginDAO")
public class LoginDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
//	public boolean findUser(String login,String password) {
//		int flag=0;
//		String query="select * from users";
//		List<Users> users=jdbcTemplate.query(query, new BeanPropertyRowMapper<Users>(Users.class));
//		for(Users u:users) {
//			if(u.getLogin().equals(login) && u.getPassword().equals(password)) {
//				flag=1;
//			}
//		}
//		if(flag==1)
//			return true;
//		else
//			return false;
//	}
	
	public boolean findUser(String login,String password) {
		try {
			String query="select * from users where login=? and password=?";
			Object[] param= {login,password};
			Users users=jdbcTemplate.queryForObject(query, param,new BeanPropertyRowMapper<Users>(Users.class));
			return true;
		}catch(EmptyResultDataAccessException e) {
			return false;
		}
		
	}
}
