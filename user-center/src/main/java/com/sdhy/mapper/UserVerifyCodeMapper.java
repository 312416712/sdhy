package com.sdhy.mapper;

import com.sdhy.pojo.UserVerifyCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserVerifyCodeMapper {

    /**
     * @param mobile  手机号
     * @param verifyCode   验证码
     * @return 验证手机号  跟  验证码 是否匹配
     */
    UserVerifyCode selectByMobileAndVerifyCode(@Param("mobile") String mobile, @Param("verifyCode") String verifyCode);
}
