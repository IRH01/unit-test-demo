package com.dhgate.unit.service.impl;

import com.dhgate.unit.base.BaseManager;
import com.dhgate.unit.base.BaseServiceImpl;
import com.dhgate.unit.entity.CreditUserDetail;
import com.dhgate.unit.service.CreditUserDetailService;
import com.dhgate.unit.service.manager.CreditUserDetailManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 用户信用分详情 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@Service
@Slf4j
public class CreditUserDetailServiceImpl extends BaseServiceImpl<CreditUserDetail> implements CreditUserDetailService {

    @Autowired
    private CreditUserDetailManager creditUserDetailManager;

    @Override
    public BaseManager<CreditUserDetail> getBaseManager() {
        return creditUserDetailManager;
    }

}
