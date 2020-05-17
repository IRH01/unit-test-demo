package com.yunji.unit.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.yunji.unit.base.BaseCoreWebTest;
import com.yunji.unit.base.JsonFileUtil;
import com.yunji.unit.entity.CreditChannel;
import com.yunji.unit.service.CreditChannelService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @Override
    protected void initMocks() {
        ReflectionTestUtils.setField(creditChannelController, "creditChannelService", creditChannelService);
    }

    /**
     * Method: add(@RequestBody CreditChannel creditChannel)
     */
    @Test
    public void testAdd() throws Exception {
        CreditChannel param = new CreditChannel();
        param.setTaskCode("1");
        param.setTaskName("1");
        param.setTaskImg("1");
        param.setRedirectType(0);
        param.setUnitScore(0);
        param.setTaskDesc("1");
        param.setTotalScore(0);
        param.setCreateTime(new Date());
        param.setModifyTime(new Date());
        param.setIsDeleted(false);
        String postReq = this.postReq("/creditChannel/add", param);

    }

    /**
     * Method: update(@RequestBody CreditChannel creditChannel)
     */
    @Test
    public void testUpdate() throws Exception {
        CreditChannel param = new CreditChannel();
        param.setId(1);
        param.setTaskName("修改后的数据");
        String postReq = this.postReq("/creditChannel/update", param);
    }

    /**
     * Method: getById(@RequestParam Integer id)
     */
    @Test
    public void testGetById() throws Exception {
        Map<String, String> param = Maps.newHashMap();
        param.put("id", "1");
        String req = this.getReq("/creditChannel/getById", param);
    }

    /**
     * Method: findBatchIds(@RequestParam List<Integer> idList)
     */
    @Test
    public void testFindBatchIds() throws Exception {
        List<Integer> idList = Lists.newArrayList();
        idList.add(1);
        idList.add(2);
        String postReq = this.postReq("/creditChannel/findBatchIds", idList);
    }

    /**
     * Method: mockDemo()
     */
    @Test
    public void testMockDemo() throws Exception {
        given(creditChannelService.findData(any())).willReturn(JsonFileUtil.buildFindDataResult());
        Map<String, String> param = Maps.newHashMap();
        String req = this.getReq("/creditChannel/mock/demo", param);
    }

} 
