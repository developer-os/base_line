package com.clf.base.dao;

import com.clf.base.modules.core.entity.CoreRole;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SqlResource("coreRole")
public interface CoreRoleDao extends BaseMapper<CoreRole> {
    public List<CoreRole> findRoleByIdSample(@Param("id") long id);
    int deleteByIds(@Param("ids") String[] ids);
}
