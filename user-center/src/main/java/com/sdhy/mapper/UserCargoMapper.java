package com.sdhy.mapper;

import com.sdhy.pojo.UserCargo;
import com.sdhy.pojo.UserVerifyCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserCargoMapper {

    /**
     * @param userCargo 创建司机端用户
     * @return
     */
    Integer insertUserCargoAll (UserCargo userCargo);

    /**
     * @param mobile 验证手机号是否存在
     * @return
     */
    UserCargo selectByMobile(@Param("mobile") String mobile);


}
