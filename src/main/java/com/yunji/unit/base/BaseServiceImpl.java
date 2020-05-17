package com.yunji.unit.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Slf4j
public abstract class BaseServiceImpl<T> {

    protected Class<T> entityClass;

    @Autowired(required = false)
    private Validator validator;

    private BaseMapper<T> mapper;

    public BaseServiceImpl() {
        entityClass = Reflections.getClassGenricType(getClass());
    }

    @PostConstruct
    private void initConfig() {
        this.mapper = this.getBaseMapper();
    }

    /**
     * 获取实体对象
     *
     * @return
     * @Description: 获取实体对象
     */
    public abstract BaseMapper<T> getBaseMapper();

    /**
     * 校验器
     *
     * @param entity
     * @throws Exception
     * @Description: 校验器
     */
    public void validate(T entity) {
        if (null == validator) {
            return;
        }
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(entity);
        if (constraintViolations.size() > 0) {
            StringBuilder validateError = new StringBuilder();
            for (ConstraintViolation<T> constraintViolation : constraintViolations) {
                validateError.append("属性：").append(constraintViolation.getPropertyPath()).append("报错！")
                        .append(constraintViolation.getMessage()).append(";");
            }
            throw new RuntimeException(validateError.toString());
        }
    }

    public int add(T entity) {
        validate(entity);
        return mapper.insert(entity);
    }

    public int update(T entity) {
        return mapper.updateById(entity);
    }

    public int updateByWrapper(T entity, Wrapper<T> wrapper) {
        return mapper.update(entity, wrapper);
    }

    public int delete(Serializable id) {
        return mapper.deleteById(id);
    }

    public T getById(Serializable id) {
        return mapper.selectById(id);
    }

    public List<T> findBatchIds(Collection<? extends Serializable> idList) {
        return mapper.selectBatchIds(idList);
    }

    public List<T> findByParams(Wrapper<T> wrapper) {
        return mapper.selectList(wrapper);
    }

    public Integer findCount(Wrapper<T> wrapper) {
        return mapper.selectCount(wrapper);
    }
}
