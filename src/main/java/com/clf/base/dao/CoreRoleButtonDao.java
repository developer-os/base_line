package com.clf.base.dao;

import com.clf.base.modules.core.entity.CoreRoleButton;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SqlResource("coreRoleButton")
public interface CoreRoleButtonDao extends BaseMapper<CoreRoleButton> {
    int deleteSample(@Param("roleid") int roleid);
    public List<CoreRoleButton> sample(@Param("roleid") int roleid);
}
