package com.dhgate.unit.base;

import com.dhgate.unit.UnitTestDemoApplication;
import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Description 测试配置父类，测试service,mapper继承该类
 *
 * @author Created by Iritchie.ren on 2019/03/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {UnitTestDemoApplication.class})
//@ActiveProfiles("unit_test")
@TestPropertySource(locations = "classpath:unit_test_data_source.properties")
public class BaseCoreTest {

    protected TestContextManager testContextManager;

    @Before
    public void initSql() {
        List<String> sqlPathList = Lists.newArrayList();
        sqlPathList.add("testsql/schema.sql");
        sqlPathList.add("testsql/credit_channel.sql");
        sqlPathList.add("testsql/credit_level.sql");
        sqlPathList.add("testsql/credit_user_detail.sql");
        RunSqlScript.run(sqlPathList);
    }


    @Before
    public void setUpContext() throws Exception {
        MockitoAnnotations.initMocks(this);
        this.testContextManager = new TestContextManager(getClass());
        this.testContextManager.prepareTestInstance(this);
        // 初始化mock对象信息
        initMocks();
    }

    protected void initMocks() throws Exception {
        // 留给模板方法实现
    }

    protected void beforeMethod(Object testInstance, String methodName) throws Exception {
        assertNotNull("methodName must not null", methodName);
        Method testMethod = Arrays.stream(testInstance.getClass().getDeclaredMethods())
                .filter(e -> methodName.equals(e.getName())).findFirst().get();
        this.testContextManager.beforeTestMethod(testInstance, testMethod);
    }

    protected void afterTestMethod(Object testInstance, String methodName) throws Exception {
        assertNotNull("methodName must not null", methodName);
        Method testMethod = Arrays.stream(testInstance.getClass().getDeclaredMethods())
                .filter(e -> methodName.equals(e.getName())).findFirst().get();
        this.testContextManager.afterTestMethod(testInstance, testMethod, new RuntimeException());
    }
}
