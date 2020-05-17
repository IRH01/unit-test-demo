package com.yunji.unit.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.yunji.unit.base.BaseCoreTest;
import com.yunji.unit.base.RunSqlScript;
import com.yunji.unit.entity.CreditChannel;
import com.yunji.unit.service.CreditChannelService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * CreditChannelServiceImpl Tester.
 *
 * @author Iritchie.ren
 * @version 1.0
 * @since <pre>05/16/2020</pre>
 */
public class CreditChannelServiceImplTest extends BaseCoreTest {

    @Autowired
    private CreditChannelService creditChannelService;

    @Before
    public void init() {
        List<String> sqlPathList = Lists.newArrayList();
        sqlPathList.add("");
        RunSqlScript.run(sqlPathList);
        assertEquals(1, 1);
    }

    @After
    public void destroy() {
        List<String> sqlPathList = Lists.newArrayList();
        sqlPathList.add("");
        RunSqlScript.run(sqlPathList);
    }

    /**
     * Method: getBaseMapper()
     */
    @Test
    public void testGetBaseMapper() throws Exception {
        //TODO: Test goes here... 
    }

    /**
     * Method: findData(Integer id)
     */
    @Test
    public void testFindData() throws Exception {
        CreditChannel creditChannel = this.creditChannelService.findData(1);
        System.err.println(JSONObject.toJSONString(creditChannel));
    }

} 
