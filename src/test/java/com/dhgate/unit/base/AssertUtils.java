package com.dhgate.unit.base;

import com.alibaba.fastjson.JSONObject;

import static org.junit.Assert.assertEquals;

/**
 * Description 业务描叙信息
 *
 * @author Created by Iritchie.ren on 2020/5/18.
 */
public class AssertUtils {

    public static void assertJsonEquals(JSONObject actualJson, JSONObject expectedJson) {
        assertEquals(actualJson, expectedJson);
    }

    public static void assertJsonEquals(String actualStr, String expectedStr) {
        JSONObject actualJson = JSONObject.parseObject(actualStr);
        JSONObject expectedJson = JSONObject.parseObject(expectedStr);
        assertEquals(actualJson, expectedJson);
    }

    public static void assertJsonEqualsWithFile(String actualStr, String fileDir) throws Exception {
        JSONObject actualJson = JSONObject.parseObject(actualStr);
        String expectedStr = JsonFileUtil.mockString("/assert/creditChannelController_mockDemo.json");
        JSONObject expectedJson = JSONObject.parseObject(expectedStr);
        assertEquals(actualJson, expectedJson);
    }
}
