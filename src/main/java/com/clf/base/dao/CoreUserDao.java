package com.clf.base.dao;

import com.clf.base.modules.core.entity.CoreUser;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
@Component
@SqlResource("coreUser")
public interface CoreUserDao extends BaseMapper<CoreUser> {
    public CoreUser sample(@Param("name") String name);
    int deleteByIds(@Param("ids") String[] ids);
}
