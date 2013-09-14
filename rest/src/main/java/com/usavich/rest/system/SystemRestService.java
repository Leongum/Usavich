package com.usavich.rest.system;

import com.usavich.common.lib.CommonUtils;
import com.usavich.common.lib.Universe;
import com.usavich.entity.common.SystemMessage;
import com.usavich.entity.common.VersionControl;
import com.usavich.service.common.def.CommonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-9-14
 * Time: 下午2:04
 * To change this template use File | Settings | File Templates.
 */
public class SystemRestService implements SystemRestDef{

    @Autowired
    private CommonService commonService;

    @Override
    public VersionControl getVersionControl(String platform) {
        VersionControl versionControl = commonService.getVersionForRest(platform);
        versionControl.setSystemTime(Universe.current().getSystemTime());
        return versionControl;
    }

    @Override
    public List<SystemMessage> getSystemMessage(String lastUpdateTime) {
        return commonService.getSystemMessageForRest(CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }
}
