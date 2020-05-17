package com.dhgate.unit.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Slf4j
public abstract class BaseServiceImpl<T> {

    public abstract BaseManager<T> getBaseManager();

    public int add(final T entity) {
        return this.getBaseManager().add(entity);
    }

    public int update(final T entity) {
        return this.getBaseManager().update(entity);
    }

    public int updateByWrapper(final T entity, final Wrapper<T> wrapper) {
        return this.getBaseManager().updateByWrapper(entity, wrapper);
    }

    public int delete(final Serializable id) {
        return this.getBaseManager().delete(id);
    }

    public T getById(final Serializable id) {
        return this.getBaseManager().getById(id);
    }

    public List<T> findBatchIds(final Collection<? extends Serializable> idList) {
        return this.getBaseManager().findBatchIds(idList);
    }

    public List<T> findByParams(final Wrapper<T> wrapper) {
        return this.getBaseManager().findByParams(wrapper);
    }

    public Integer findCount(final Wrapper<T> wrapper) {
        return this.getBaseManager().findCount(wrapper);
    }
}
