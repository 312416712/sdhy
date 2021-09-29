package com.sdhy.service.impl;

import com.sdhy.mapper.UserVerifyCodeMapper;
import com.sdhy.pojo.UserVerifyCode;
import com.sdhy.service.UserVerifyCodeService;
import com.sdhy.util.hy_util.VerifyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserVerifyCodeServiceImpl implements UserVerifyCodeService {
    @Resource
    private UserVerifyCodeMapper userVerifyCodeMapper;

    /**
     * @param mobile     手机号
     * @param verifyCode 验证码
     * @return 登录逻辑
     */
    @Override
    public UserVerifyCode queryByMobileAndVerifyCode(String mobile, String verifyCode) {
        UserVerifyCode userCode = null ;
        if (VerifyUtil.checkMobile(mobile) && verifyCode != null){
            //数据库验证
            userCode = userVerifyCodeMapper.selectByMobileAndVerifyCode(mobile,verifyCode);
        }
        return userCode;
    }
}
