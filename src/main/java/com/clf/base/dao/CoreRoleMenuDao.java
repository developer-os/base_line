package com.clf.base.dao;

import com.clf.base.modules.core.entity.CoreRoleMenu;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CoreRoleMenuDao extends BaseMapper<CoreRoleMenu> {
    int deleteSample(@Param("roleid") int roleid);
    public List<CoreRoleMenu> sample(@Param("roleid") int roleid);

}
