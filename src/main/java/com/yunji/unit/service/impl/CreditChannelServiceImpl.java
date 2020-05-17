package com.yunji.unit.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunji.unit.base.BaseServiceImpl;
import com.yunji.unit.entity.CreditChannel;
import com.yunji.unit.mapper.CreditChannelMapper;
import com.yunji.unit.service.CreditChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    private CreditChannelMapper creditChannelMapper;

    @Override
    public BaseMapper<CreditChannel> getBaseMapper() {
        return creditChannelMapper;
    }

    /**
     * 查询数据
     *
     * @return
     * @param id
     */
    @Override
    public CreditChannel findData(Integer id) {
        CreditChannel creditChannel = new CreditChannel();
        creditChannel.setId(100);
        creditChannel.setTaskCode("实际code");
        creditChannel.setTaskName("实际名称");
        creditChannel.setTaskImg("图片地址");
        creditChannel.setRedirectType(0);
        creditChannel.setUnitScore(0);
        creditChannel.setTaskDesc("");
        creditChannel.setTotalScore(0);
        creditChannel.setCreateTime(new Date());
        creditChannel.setModifyTime(new Date());
        creditChannel.setIsDeleted(false);
        return creditChannel;
    }
}
