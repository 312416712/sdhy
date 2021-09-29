package com.sdhy.service.impl;

import com.sdhy.mapper.UserCargoMapper;
import com.sdhy.pojo.UserCargo;
import com.sdhy.service.UserCargoService;
import com.sdhy.util.hy_util.VerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserCargoServiceImpl implements UserCargoService {
    @Resource
    private UserCargoMapper userCargoMapper;


    @Override
    public Integer insertUserCargoAll(UserCargo userCargo) {
        Integer cum = 0;
        cum = userCargoMapper.insertUserCargoAll(userCargo);
        return cum;
    }

    /**
     * @param mobile 验证手机号
     * @return
     */
    @Override
    public UserCargo queryByMobile(String mobile) {
        UserCargo userCargo = new UserCargo();
        if (VerifyUtil.checkMobile(mobile)) {
            userCargo = userCargoMapper.selectByMobile(mobile);
        }
        return userCargo;
    }


}
