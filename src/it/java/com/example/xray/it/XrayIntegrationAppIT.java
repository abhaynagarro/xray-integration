package com.example.xray.it;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XrayIntegrationAppIT {

	@Test
	public void testIntegration() {
		assertSame("Successfully executed it", "hello", "hello");
	}
}
