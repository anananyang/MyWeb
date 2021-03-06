package com.anyang.myWeb.service.base;

import com.anyang.myWeb.dao.base.BaseDao;
import com.anyang.myWeb.entity.base.IdEntity;

import java.util.List;

public interface BaseService {
    public <T extends IdEntity> List<T> getAll(BaseDao<T> baseDao);

    public <T extends IdEntity> T getById(BaseDao<T> baseDao, Object id);

    public <T extends IdEntity> boolean save(BaseDao<T> baseDao, T entity);

    public <T extends IdEntity> boolean deleteById(BaseDao<T> baseDao, Object id);

    public <T extends IdEntity> int deleteByIds(BaseDao<T> baseDao, Object[] ids);

}
