package com.dhgate.unit.service.manager;

import com.dhgate.unit.base.BaseManager;
import com.dhgate.unit.base.PageView;
import com.dhgate.unit.controller.vo.PageParamVO;
import com.dhgate.unit.entity.CreditChannel;

 /**
 * Description: 信用分渠道配置 服务类
 * @author Iritchie.ren
 * @date 2020-05-18
 */
public interface CreditChannelManager extends BaseManager<CreditChannel> {

     PageView<CreditChannel> findPage(PageParamVO pageParamVO);
 }
