package com.sdhy.config.service;

import com.sdhy.config.pojo.HwySmsConfig;
import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 生成短信 发送短信
 */
@Service
public class SmsService {
    //生成短信随机数
    private ThreadLocalRandom random = ThreadLocalRandom.current();
    @Resource
    private HwySmsConfig hwySmsConfig;

    //生成随机6位数
    private String random(int len){
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<len;i++){
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }
    //发送短信
    private boolean invokeHwySms(String phone,String code) {

        return true;
    }
    //判断验证码是否正确
    public boolean checkCode(String phone,String code){
        boolean isCode = false;
        if (StringUtils.isNotEmpty(code)){
            //正确的话就存入数据库

        }
        return true;
    }
}
