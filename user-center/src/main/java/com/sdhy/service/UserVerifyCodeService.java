package com.sdhy.service;

import com.sdhy.pojo.UserVerifyCode;
import org.apache.ibatis.annotations.Param;

public interface UserVerifyCodeService {

    /**
     * @param mobile 手机号
     * @param verifyCode  验证码
     * @return 账号登录
     */
    UserVerifyCode queryByMobileAndVerifyCode(String mobile, String verifyCode);
}
