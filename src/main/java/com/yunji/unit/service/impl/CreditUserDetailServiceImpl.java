package com.yunji.unit.service.impl;

import com.yunji.unit.mapper.CreditUserDetailMapper;
import com.yunji.unit.service.CreditUserDetailService;
import com.yunji.unit.base.BaseServiceImpl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunji.unit.entity.CreditUserDetail;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

/**
 * Description: 用户信用分详情 服务实现类
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@Service
@Slf4j
public class CreditUserDetailServiceImpl extends BaseServiceImpl<CreditUserDetail> implements CreditUserDetailService {

        @Autowired
        private CreditUserDetailMapper creditUserDetailMapper;

        @Override
        public BaseMapper<CreditUserDetail> getBaseMapper() {
        return creditUserDetailMapper;
        }
	
}
