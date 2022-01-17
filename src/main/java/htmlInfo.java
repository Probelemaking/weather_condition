import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class htmlInfo {
    @JsonIgnore
    private int code;
    @JsonIgnore
    private String updateTime;
    @JsonIgnore
    private String fxLink;
    private List<UserInfo> daily = new ArrayList<>();
    @JsonIgnore
    private String license;
    public htmlInfo(){}
    public htmlInfo(int code, String updateTime, String fxLink, List<UserInfo> daily, String license) {
        this.code = code;
        this.updateTime = updateTime;
        this.fxLink = fxLink;
        this.daily = daily;
        this.license = license;
    }

    public int getCode() {
        return code;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public String getFxLink() {
        return fxLink;
    }

    public List<UserInfo> getDaily() {
        return daily;
    }

    public String getLicense() {
        return license;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setFxLink(String fxLink) {
        this.fxLink = fxLink;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setDaily(List<UserInfo> daily) {
        this.daily = daily;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "htmlInfo{" +
                "code=" + code +
                ", updateTime='" + updateTime + '\'' +
                ", fxLink='" + fxLink + '\'' +
                ", daily=" + daily +
                ", license='" + license + '\'' +
                '}';
    }
}
