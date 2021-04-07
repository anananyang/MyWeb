package com.anyang.myWeb.service.base.impl;

import com.anyang.myWeb.dao.base.BaseDao;
import com.anyang.myWeb.entity.base.BaseEntity;
import com.anyang.myWeb.entity.base.IdEntity;
import com.anyang.myWeb.service.base.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public class BaseServiceImpl implements BaseService {

    public <T extends IdEntity> List<T> getAll(BaseDao<T> baseDao) {
        return baseDao.select(null);
    }

    public <T extends IdEntity> T getById(BaseDao<T> baseDao, Object id) {
        return baseDao.selectById(id);
    }

    @Transactional
    public <T extends IdEntity> boolean save(BaseDao<T> baseDao, T entity) {
        if (entity instanceof BaseEntity) {
            ((BaseEntity) entity).setDefaultBizValue();
        }
        if (entity.getId() == null) {
            return baseDao.insert(entity) > 0;
        } else {
            return baseDao.updateById(entity) > 0;
        }
    }

    @Transactional
    public <T extends IdEntity> boolean deleteById(BaseDao<T> baseDao, Object id) {
        T t = baseDao.selectById(id);
        if (t == null)
            return false;

        return baseDao.deleteById(id) > 0;
    }

    public <T extends IdEntity> int deleteByIds(BaseDao<T> baseDao, Object[] ids) {
        if (ids.length == 0) {
            return 0;
        }
        return baseDao.deleteByIds(ids);
    }

    public <T extends IdEntity> List<T> select(BaseDao<T> baseDao, Map<String, Object> param) {
        return baseDao.select(param);
    }

}
