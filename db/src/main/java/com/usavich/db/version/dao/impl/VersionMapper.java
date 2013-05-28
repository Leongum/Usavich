package com.usavich.db.version.dao.impl;

import com.usavich.entity.common.VersionControl;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 5/28/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VersionMapper {

    public VersionControl getVersionControl(@Param("platform") String platform);

    public void updateVersionControl(@Param("entity") VersionControl versionControl);

}
