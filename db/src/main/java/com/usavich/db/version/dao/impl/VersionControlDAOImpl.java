package com.usavich.db.version.dao.impl;

import com.usavich.db.version.dao.def.VersionControlDAO;
import com.usavich.entity.common.VersionControl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 5/28/13
 * Time: 6:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class VersionControlDAOImpl implements VersionControlDAO {

    @Autowired
    private VersionMapper versionMapper;

    @Override
    public VersionControl getVersionControl(String platform) {
        return versionMapper.getVersionControl(platform);
    }

    @Override
    public void updateVersionControl(VersionControl versionControl) {
       versionMapper.updateVersionControl(versionControl);
    }
}
