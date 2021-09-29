package com.sdhy.service;


import com.sdhy.pojo.UserCargo;
import org.apache.ibatis.annotations.Param;


public interface UserCargoService {

    Integer insertUserCargoAll (UserCargo userCargo);

    /**
     * @param mobile 用户登录 查询账号是否存在
     * @return
     */
    UserCargo queryByMobile( String mobile);


}
