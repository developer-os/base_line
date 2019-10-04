package com.clf.base.modules.video.dao;

import com.clf.base.modules.video.entity.StShipinB;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.mapper.BaseMapper;

//@Component
//@Service
//@SqlResource("stShipinB")
public interface StShipinBDao extends BaseMapper<StShipinB> {

    public int deleteSample(@Param("videoId") String videoId);

}
