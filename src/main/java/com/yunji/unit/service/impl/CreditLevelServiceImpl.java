package com.yunji.unit.service.impl;

import com.yunji.unit.mapper.CreditLevelMapper;
import com.yunji.unit.service.CreditLevelService;
import com.yunji.unit.base.BaseServiceImpl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunji.unit.entity.CreditLevel;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

/**
 * Description: 等级配置 服务实现类
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@Service
@Slf4j
public class CreditLevelServiceImpl extends BaseServiceImpl<CreditLevel> implements CreditLevelService {

        @Autowired
        private CreditLevelMapper creditLevelMapper;

        @Override
        public BaseMapper<CreditLevel> getBaseMapper() {
        return creditLevelMapper;
        }
	
}
