package com.dhgate.unit.service.impl;

import com.dhgate.unit.base.BaseManager;
import com.dhgate.unit.base.BaseServiceImpl;
import com.dhgate.unit.base.PageView;
import com.dhgate.unit.service.manager.CreditChannelManager;
import com.dhgate.unit.controller.vo.PageParamVO;
import com.dhgate.unit.entity.CreditChannel;
import com.dhgate.unit.service.CreditChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 信用分渠道配置 服务实现类
 *
 * @author Iritchie.ren
 * @date 2020-05-15
 */
@Service
@Slf4j
public class CreditChannelServiceImpl extends BaseServiceImpl<CreditChannel> implements CreditChannelService {

    @Autowired
    private CreditChannelManager creditChannelManager;

    @Override
    public BaseManager<CreditChannel> getBaseManager() {
        return creditChannelManager;
    }

    /**
     * 查询数据
     *
     * @param id
     * @return
     */
    @Override
    public CreditChannel findData(Integer id) {
        return this.creditChannelManager.getById(id);
    }

    /**
     * 分页查询案例
     *
     * @param pageParamVO
     * @return
     */
    @Override
    public PageView<CreditChannel> findPage(PageParamVO pageParamVO) {
        PageView<CreditChannel> creditChannelPageView = this.creditChannelManager.findPage(pageParamVO);
        return creditChannelPageView;
    }
}
