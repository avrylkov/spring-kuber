package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrganizationApplication.class)
public class ApplicationTest {

	@Autowired
	private ApplicationContext context;

	@Test
	public void contextLoads() throws Exception {
		assertThat(this.context).isNotNull();
	}

}
