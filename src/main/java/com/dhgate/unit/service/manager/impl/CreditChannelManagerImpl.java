package com.dhgate.unit.service.manager.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dhgate.unit.base.BaseManagerImpl;
import com.dhgate.unit.base.PageView;
import com.dhgate.unit.service.manager.CreditChannelManager;
import com.dhgate.unit.controller.vo.PageParamVO;
import com.dhgate.unit.entity.CreditChannel;
import com.dhgate.unit.mapper.CreditChannelMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 信用分渠道配置 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-18
 */
@Service
@Slf4j
public class CreditChannelManagerImpl extends BaseManagerImpl<CreditChannel> implements CreditChannelManager {

    @Autowired
    private CreditChannelMapper creditChannelMapper;

    @Override
    public BaseMapper<CreditChannel> getBaseMapper() {
        return creditChannelMapper;
    }

    @Override
    public PageView<CreditChannel> findPage(PageParamVO pageParamVO) {
        LambdaQueryWrapper<CreditChannel> wrapper = Wrappers.lambdaQuery();
        wrapper.like(CreditChannel::getTaskName, pageParamVO.getTaskNameLike());
        IPage<CreditChannel> page = new Page<>(pageParamVO.getPageNum(), pageParamVO.getPageSize());
        this.creditChannelMapper.selectPage(page, wrapper);
        return PageView.build(page.getRecords(), page.getTotal());
    }
}
