package com.dhgate.unit.service.manager.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dhgate.unit.base.BaseManagerImpl;
import com.dhgate.unit.entity.CreditLevel;
import com.dhgate.unit.mapper.CreditLevelMapper;
import com.dhgate.unit.service.manager.CreditLevelManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 等级配置 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-18
 */
@Service
@Slf4j
public class CreditLevelManagerImpl extends BaseManagerImpl<CreditLevel> implements CreditLevelManager {

    @Autowired
    private CreditLevelMapper creditLevelMapper;

    @Override
    public BaseMapper<CreditLevel> getBaseMapper() {
        return creditLevelMapper;
    }

}
