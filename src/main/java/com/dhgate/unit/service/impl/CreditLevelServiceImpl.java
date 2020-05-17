package com.dhgate.unit.service.impl;

import com.dhgate.unit.base.BaseManager;
import com.dhgate.unit.base.BaseServiceImpl;
import com.dhgate.unit.entity.CreditLevel;
import com.dhgate.unit.service.CreditLevelService;
import com.dhgate.unit.service.manager.CreditLevelManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 等级配置 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@Service
@Slf4j
public class CreditLevelServiceImpl extends BaseServiceImpl<CreditLevel> implements CreditLevelService {

    @Autowired
    private CreditLevelManager creditLevelManager;

    @Override
    public BaseManager<CreditLevel> getBaseManager() {
        return creditLevelManager;
    }

}
