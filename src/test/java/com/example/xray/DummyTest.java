package com.example.xray;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyTest {

	@Autowired
	private Dummy dummy;

	@Test
	public void testDisplaySuccess() {
		dummy.displaySuccess();
	}

	@Test
	public void testDisplayFailed() {

		String result = dummy.displayFailed();
		assertSame("Test case testDisplayFailed failed", "fail", result);

	}

}
