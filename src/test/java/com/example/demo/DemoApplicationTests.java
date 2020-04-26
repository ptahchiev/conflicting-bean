package com.example.demo;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@TestExecutionListeners({ TransactionalTestExecutionListener.class })
@SpringBootTest(classes = { DemoTestConfig.class }, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DemoApplicationTests extends AbstractJUnit4SpringContextTests {

}
