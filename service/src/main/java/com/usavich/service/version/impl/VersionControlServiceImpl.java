package com.usavich.service.version.impl;

import com.usavich.db.version.dao.def.VersionControlDAO;
import com.usavich.entity.common.VersionControl;
import com.usavich.service.backend.BackendJobCache;
import com.usavich.service.version.def.VersionControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 5/28/13
 * Time: 7:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class VersionControlServiceImpl implements VersionControlService {

    @Autowired
    private VersionControlDAO versionControlDAO;

    @Override
    @Transactional
    public VersionControl getVersionControl(String platform) {
        return versionControlDAO.getVersionControl(platform);
    }

    @Override
    public VersionControl getVersionForRest(String platform) {
        if (platform.equalsIgnoreCase("ios")) {
            return BackendJobCache.versionControlIOS;
        } else {
            return getVersionControl(platform);
        }
    }

}
