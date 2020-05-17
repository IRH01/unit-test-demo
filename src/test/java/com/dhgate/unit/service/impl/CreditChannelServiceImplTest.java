package com.dhgate.unit.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dhgate.unit.base.JsonFileUtil;
import com.dhgate.unit.base.BaseCoreTest;
import com.dhgate.unit.entity.CreditChannel;
import com.dhgate.unit.service.CreditChannelService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.TestCase.assertEquals;

/**
 * CreditChannelServiceImpl Tester.
 *
 * @author Iritchie.ren
 * @version 1.0
 * @since <pre>05/18/2020</pre>
 */
public class CreditChannelServiceImplTest extends BaseCoreTest {

    @Autowired
    private CreditChannelService creditChannelService;


    /**
     * Method: getBaseManager()
     */
    @Test
    public void testGetBaseManager() throws Exception {
        //TODO: Test goes here...

    }

    /**
     * Method: findData(Integer id)
     */
    @Test
    public void testFindData() throws Exception {
        CreditChannel creditChannel = this.creditChannelService.findData(1);
        String actualStr = JSONObject.toJSONString(creditChannel);
        JSONObject actualJson = JSONObject.parseObject(actualStr);
        String expectedStr = JsonFileUtil.mockString("/assert/creditChannelService_findData.json");
        JSONObject expectedJson = JSONObject.parseObject(expectedStr);
        assertEquals(expectedJson, actualJson);
    }

    /**
     * Method: findPage(PageParamVO pageParamVO)
     */
    @Test
    public void testFindPage() throws Exception {
        //TODO: Test goes here...
    }

} 
