package com.usavich.rest.version;

import com.usavich.common.lib.Universe;
import com.usavich.entity.common.VersionControl;
import com.usavich.service.version.def.VersionControlService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.PathParam;


/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/7/13
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class VersionRestService implements VersionRestDef{

    @Autowired
    private VersionControlService versionControlService;


    @Override
    public VersionControl getVersionControl(String platform) {
        VersionControl versionControl = versionControlService.getVersionControl(platform);
        versionControl.setSystemTime(Universe.current().getSystemTime());
        return versionControl;
    }
}
