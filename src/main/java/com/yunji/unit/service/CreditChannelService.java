package com.yunji.unit.service;

import com.yunji.unit.base.BaseService;
import com.yunji.unit.entity.CreditChannel;

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
     * @return
     * @param id
     */
    CreditChannel findData(Integer id);

}
