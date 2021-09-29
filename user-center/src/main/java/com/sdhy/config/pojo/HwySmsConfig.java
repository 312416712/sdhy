package com.sdhy.config.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 华为云短信接口
 */
@Component
@ConfigurationProperties(prefix = "hwy.sms")
public class HwySmsConfig {
    private String url;
    private String content;
    private String appkey;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    @Override
    public String toString() {
        return "HwySmsConfig{" +
                "url='" + url + '\'' +
                ", content='" + content + '\'' +
                ", appkey='" + appkey + '\'' +
                '}';
    }

}
