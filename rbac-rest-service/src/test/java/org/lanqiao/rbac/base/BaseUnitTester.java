package org.lanqiao.rbac.base;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * 单元测试基础类
 */
@ContextConfiguration("classpath:spring-context.xml")
@ActiveProfiles("development")
public class BaseUnitTester extends AbstractJUnit4SpringContextTests {
}