package com.dhgate.unit.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.dhgate.unit.base.BaseCoreWebTest;
import com.dhgate.unit.base.DataResponse;
import com.dhgate.unit.base.JsonFileUtil;
import com.dhgate.unit.base.NullObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.dhgate.unit.entity.CreditChannel;
import com.dhgate.unit.service.CreditChannelService;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

/**
 * CreditChannelController Tester.
 *
 * @author Iritchie.ren
 * @version 1.0
 * @since <pre>05/15/2020</pre>
 */
public class CreditChannelControllerTest extends BaseCoreWebTest {

    @Autowired
    private CreditChannelController creditChannelController;

    @Mock
    private CreditChannelService creditChannelService;

    /**
     * Method: add(@RequestBody CreditChannel creditChannel)
     */
    @Test
    public void testAdd() throws Exception {
        CreditChannel param = new CreditChannel();
        param.setTaskCode("100");
        param.setTaskName("100");
        param.setTaskImg("1");
        param.setRedirectType(0);
        param.setUnitScore(0);
        param.setTaskDesc("1");
        param.setTotalScore(0);
        param.setCreateTime(new Date());
        param.setModifyTime(new Date());
        param.setIsDeleted(false);
        String actualStr = this.postReq("/creditChannel/add", param);
        // 下面是结果断言处理
        DataResponse<NullObject> actual = JSONObject.parseObject(actualStr, new TypeReference<DataResponse<NullObject>>() {
        });
        String expectedStr = JsonFileUtil.mockString("/assert/creditChannelController_add.json");
        DataResponse<NullObject> expected = JSONObject.parseObject(expectedStr, new TypeReference<DataResponse<NullObject>>() {
        });
        assertEquals(expected.getCode(), actual.getCode());
        assertEquals(expected.getMsg(), actual.getMsg());
        assertEquals(expected.getData(), actual.getData());
    }

    /**
     * Method: update(@RequestBody CreditChannel creditChannel)
     */
    @Test
    public void testUpdate() throws Exception {
        CreditChannel param = new CreditChannel();
        param.setId(1);
        param.setTaskName("修改后的数据");
        String actualStr = this.postReq("/creditChannel/update", param);
        // 下面是结果断言处理
        JSONObject actualJson = JSONObject.parseObject(actualStr);
        String expectedStr = JsonFileUtil.mockString("/assert/creditChannelController_add.json");
        JSONObject expectedJson = JSONObject.parseObject(expectedStr);
        assertEquals(actualJson, expectedJson);
    }

    /**
     * Method: getById(@RequestParam Integer id)
     */
    @Test
    public void testGetById() throws Exception {
        Map<String, String> param = Maps.newHashMap();
        param.put("id", "1");
        String actualStr = this.getReq("/creditChannel/getById", param);
        // 下面是结果断言处理
        JSONObject actualJson = JSONObject.parseObject(actualStr);
        String expectedStr = JsonFileUtil.mockString("/assert/creditChannelController_getById.json");
        JSONObject expectedJson = JSONObject.parseObject(expectedStr);
        assertEquals(actualJson, expectedJson);
    }

    /**
     * Method: findBatchIds(@RequestParam List<Integer> idList)
     */
    @Test
    public void testFindBatchIds() throws Exception {
        List<Integer> idList = Lists.newArrayList();
        idList.add(1);
        idList.add(2);
        String actualStr = this.postReq("/creditChannel/findBatchIds", idList);
        // 下面是结果断言处理
        JSONObject actualJson = JSONObject.parseObject(actualStr);
        String expectedStr = JsonFileUtil.mockString("/assert/creditChannelController_findBatchIds.json");
        JSONObject expectedJson = JSONObject.parseObject(expectedStr);
        assertEquals(actualJson, expectedJson);
    }

    /**
     * Method: mockDemo()，无侵入式MOCK测试
     */
    @Test
    public void testMockDemo() throws Exception {
        ReflectionTestUtils.setField(creditChannelController, "creditChannelService", creditChannelService);
        given(creditChannelService.findData(any())).willReturn(JsonFileUtil.buildFindDataResult());

        Map<String, String> param = Maps.newHashMap();
        String actualStr = this.getReq("/creditChannel/mock/demo", param);

        // 下面是结果断言处理
        JSONObject actualJson = JSONObject.parseObject(actualStr);
        String expectedStr = JsonFileUtil.mockString("/assert/creditChannelController_mockDemo.json");
        JSONObject expectedJson = JSONObject.parseObject(expectedStr);
        assertEquals(actualJson, expectedJson);
    }

    /**
     * Method: findPage(@RequestBody PageParamVO pageParamVO)
     */
    @Test
    public void testFindPage() throws Exception {
        String actualStr = this.postReq("/creditChannel/findPage", JsonFileUtil.mockString("/mock/creditChannelController_findPage_param.json"));
        // 下面是结果断言处理
        JSONObject actualJson = JSONObject.parseObject(actualStr);
        String expectedStr = JsonFileUtil.mockString("/assert/creditChannelController_findPage.json");
        JSONObject expectedJson = JSONObject.parseObject(expectedStr);
        assertEquals(actualJson, expectedJson);
    }

} 
