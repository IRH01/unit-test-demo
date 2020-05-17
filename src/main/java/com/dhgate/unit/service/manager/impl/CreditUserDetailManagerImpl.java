package com.dhgate.unit.service.manager.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dhgate.unit.base.BaseManagerImpl;
import com.dhgate.unit.entity.CreditUserDetail;
import com.dhgate.unit.mapper.CreditUserDetailMapper;
import com.dhgate.unit.service.manager.CreditUserDetailManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 用户信用分详情 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-18
 */
@Service
@Slf4j
public class CreditUserDetailManagerImpl extends BaseManagerImpl<CreditUserDetail> implements CreditUserDetailManager {

    @Autowired
    private CreditUserDetailMapper creditUserDetailMapper;

    @Override
    public BaseMapper<CreditUserDetail> getBaseMapper() {
        return creditUserDetailMapper;
    }

}
