package com.dhgate.unit.service;

import com.dhgate.unit.base.BaseService;
import com.dhgate.unit.base.PageView;
import com.dhgate.unit.controller.vo.PageParamVO;
import com.dhgate.unit.entity.CreditChannel;

/**
 * Description: 信用分渠道配置 服务类
 *
 * @author Iritchie.ren
 * @date 2020-05-15
 */
public interface CreditChannelService extends BaseService<CreditChannel> {

    /**
     * 查询数据
     *
     * @param id
     * @return
     */
    CreditChannel findData(Integer id);

    /**
     * 分页查询案例
     *
     * @param pageParamVO
     * @return
     */
    PageView<CreditChannel> findPage(PageParamVO pageParamVO);
}
