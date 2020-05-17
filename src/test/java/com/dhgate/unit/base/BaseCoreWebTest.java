package com.dhgate.unit.base;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.junit.Before;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Description 测试配置父类，测试controller继承该类
 *
 * @author Created by Iritchie.ren on 2019/03/24.
 */
@WebAppConfiguration
public class BaseCoreWebTest extends BaseCoreTest {

    @Resource
    private WebApplicationContext context;

    protected MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    protected String postReq(String uri, Object param) throws Exception {
        return postReq(uri, JSONObject.toJSONString(param));
    }

    protected String postReq(String uri, String paramJsonString) throws Exception {
        System.err.println("POST请求参数：" + paramJsonString);
        //路径
        RequestBuilder request = post(uri)
                //参数
                .content(paramJsonString)
                .contentType(MediaType.APPLICATION_JSON_VALUE);

        //接受的数据类型
        String context = mvc.perform(request)
                //状态吗是否相等
                .andExpect(status().isOk())
                //输出信息
                .andDo(print())
                .andReturn()
                .getResponse()
                .getContentAsString();
        System.err.println("POST返回结果：" + context);
        return context;
    }

    protected String getReq(String uri, String param) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(param);
        Map<String, String> paramMap = Maps.newHashMap();
        jsonObject.forEach((key, value) -> paramMap.put(key, String.valueOf(value)));
        return this.getReq(uri, paramMap);
    }


    protected String getReq(String uri, Map<String, String> param) throws Exception {
        String paramJsonString = JSONObject.toJSONString(param);
        System.err.println("GET请求参数：" + paramJsonString);
        //路径
        MockHttpServletRequestBuilder request = get(uri);
        //参数
        param.forEach(request::param);
        String context = mvc.perform(request)
                //状态吗是否相等
                .andExpect(status().isOk())
                //输出信息
                .andDo(print())
                .andReturn()
                .getResponse()
                .getContentAsString();
        System.err.println("GET返回结果：" + context);
        return context;
    }

}
