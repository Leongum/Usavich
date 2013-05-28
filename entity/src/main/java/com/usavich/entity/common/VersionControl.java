package com.usavich.entity.common;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 5/28/13
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class VersionControl {

     private String platform;

    private Integer version;

    private Integer subVersion;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getSubVersion() {
        return subVersion;
    }

    public void setSubVersion(Integer subVersion) {
        this.subVersion = subVersion;
    }
}
