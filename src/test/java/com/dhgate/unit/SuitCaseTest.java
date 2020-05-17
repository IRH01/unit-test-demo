package com.dhgate.unit;

import com.dhgate.unit.controller.CreditChannelControllerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Description 测试配置父类，集成测试，可进行准确性测试，覆盖率测试
 *
 * @author Created by Iritchie.ren on 2018/10/12.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreditChannelControllerTest.class
})
public class SuitCaseTest {
}

