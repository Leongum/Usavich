package com.usavich.service.common.def;

import com.usavich.entity.common.*;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-9-14
 * Time: 下午1:52
 * To change this template use File | Settings | File Templates.
 */
public interface CommonService {
    VersionControl getVersionControl(String platform);

    VersionControl getVersionForRest(String platform);

    List<SystemMessage> getSystemMessage(Date lastUpdateTime);

    List<SystemMessage> getSystemMessageForRest(Date lastUpdateTime);

    void createFeedback(Feedback feedback);
}
