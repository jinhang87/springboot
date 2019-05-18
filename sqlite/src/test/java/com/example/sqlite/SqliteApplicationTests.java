package com.example.sqlite;

import com.example.sqlite.User.Dao.UserReposity;
import com.example.sqlite.User.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqliteApplicationTests {

	@Autowired
	private UserReposity userReposity;

	@Test
	public void contextLoads() {

	}

	@Test
	public void test() throws Exception{
		User user = new User();
		user.setUserName("sdf");
		userReposity.save(user);
	}

}
