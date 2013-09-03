package com.usavich.service.version.def;

import com.usavich.entity.common.VersionControl;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 5/28/13
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VersionControlService {

    VersionControl getVersionControl(String platform);

    VersionControl getVersionForRest(String platform);
}
