package com.dhgate.unit.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface BaseService<T> {

    /**
     * DESC: 添加单个实体
     *
     * @param entity
     * @return
     */
    int add(T entity);

    /**
     * DESC: 根据ID修改实体
     *
     * @param entity
     * @return
     * @throws Exception
     * @author guocp
     */
    int update(T entity);

    /**
     * 更新全部字段
     *
     * @param entity
     * @param wrapper
     * @return
     * @Description: 更新全部字段
     */
    int updateByWrapper(T entity, Wrapper<T> wrapper);

    /**
     * DESC: 根据ID删除单个实体
     *
     * @param id
     * @return
     * @throws Exception
     * @author guocp
     */
    int delete(Serializable id);

    /**
     * DESC: 根据ID加载单个实体
     *
     * @param id
     * @return
     * @throws Exception
     */
    T getById(Serializable id);

    /**
     * DESC: 根据ID列表查询
     *
     * @param idList ID列表
     * @return
     * @throws Exception
     */
    List<T> findBatchIds(Collection<? extends Serializable> idList);

    /**
     * DESC: 根据条件查找对象列表
     *
     * @param wrapper
     * @return
     */
    List<T> findByParams(Wrapper<T> wrapper);

    /**
     * 查询统计
     *
     * @param wrapper
     * @return
     * @Description: 查询统计
     */
    Integer findCount(Wrapper<T> wrapper);
}
