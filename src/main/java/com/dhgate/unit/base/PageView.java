package com.dhgate.unit.base;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Description 业务描叙信息
 *
 * @author Created by Iritchie.ren on 2019/4/25.
 */
@Data
public class PageView<T> implements Serializable {

    /**
     * list
     */
    private List<T> list;

    /**
     * 记录总数
     */
    private Long totalCount;


    public PageView() {
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public static <T> PageView<T> build(List<T> featureViewInfoList, Long totalCount) {
        PageView<T> pageView = new PageView<>();
        pageView.list = featureViewInfoList;
        pageView.setTotalCount(totalCount);
        return pageView;
    }

}
