package com.usavich.db.version.dao.def;

import com.usavich.entity.common.*;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 5/28/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VersionControlDAO {

    public VersionControl getVersionControl(String platform);

    public void updateVersionControl(VersionControl versionControl);
}
