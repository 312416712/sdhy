package com.sdhy.controller;



import com.alibaba.druid.util.StringUtils;
import com.sdhy.constants.ErrCode;
import com.sdhy.pojo.UserCargo;
import com.sdhy.service.UserCargoService;
import com.sdhy.service.UserVerifyCodeService;
import com.sdhy.util.hy_util.GeneralUtil;
import com.sdhy.util.hy_util.RespObject;
import com.sdhy.util.hy_util.VerifyUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;



@RestController
public class UserCargoController {

    @Resource
    private UserCargoService userCargoService;
    @Resource
    private UserVerifyCodeService userVerifyCodeService;

    @RequestMapping("/aaaa")
    @ResponseBody
    public Object allName (){
      Integer cum = 0;
      UserCargo userCargo = new UserCargo();
      userCargo.setPassword("123456");
      userCargo.setMobile("15550575731");
      userCargo.setLogo("1597dsfgdgdg53");
      userCargo.setStatus(GeneralUtil.USER_CARGO_STATUS_YES);
      userCargo.setSex(GeneralUtil.USER_CARGO_SEX_MAN);
      userCargo.setRegisterTime(new Date());

      cum = userCargoService.insertUserCargoAll(userCargo);
      if (cum!=0){
          System.out.println("成功添加===>"+cum);
      }
      return cum ;
    }

    @RequestMapping("/userCargo/login")
    @ResponseBody
    public RespObject login( String mobile , String verifyCode ){
            RespObject ro = RespObject.FAIL("请稍后重试!");
            if (VerifyUtil.checkMobile(mobile)){
                //检查手机号是否存在
                UserCargo userCargo =userCargoService.queryByMobile(mobile);
                if (userCargo == null){
                    ro.setCode(ErrCode.ERR_UNKOWN).setMsg("手机号不存在!");
                }else {
                    //存在手机号 则登录
                    userVerifyCodeService.queryByMobileAndVerifyCode(mobile,verifyCode);
                    ro.setCode(ErrCode.SUCC).setMsg("登陆成功!");
                }
            }else {
                ro.setCode(ErrCode.ERR_UNKOWN).setMsg("手机号不存在");
            }
            return ro;
    }
}
