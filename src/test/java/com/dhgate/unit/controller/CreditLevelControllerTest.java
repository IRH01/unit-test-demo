package com.dhgate.unit.controller;

import com.dhgate.unit.base.BaseCoreWebTest;
import com.dhgate.unit.base.JsonFileUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CreditLevelController Tester.
 *
 * @author Iritchie.ren
 * @version 1.0
 * @since <pre>05/19/2020</pre>
 */
public class CreditLevelControllerTest extends BaseCoreWebTest {

    @Autowired
    private CreditLevelController creditLevelController;


    /**
     * Method: add(@RequestBody CreditLevel creditLevel)
     */
    @Test
    public void testAdd() throws Exception {
        //TODO: Test goes here... 
        String response = this.postReq("", JsonFileUtil.mockString(""));

    }

    /**
     * Method: update(@RequestBody CreditLevel creditLevel)
     */
    @Test
    public void testUpdate() throws Exception {
        //TODO: Test goes here... 
        String response = this.postReq("", JsonFileUtil.mockString(""));

    }

    /**
     * Method: getById(@RequestParam Integer id)
     */
    @Test
    public void testGetById() throws Exception {
        //TODO: Test goes here... 
        String response = this.postReq("", JsonFileUtil.mockString(""));

    }

    /**
     * Method: findBatchIds(@RequestParam List<Integer> idList)
     */
    @Test
    public void testFindBatchIds() throws Exception {
        //TODO: Test goes here... 
        String response = this.postReq("", JsonFileUtil.mockString(""));

    }

} 
