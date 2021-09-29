package com.sdhy.util.hy_util;

import java.util.regex.Pattern;

public class VerifyUtil {
    /**
     * @param mobile 判断手机号格式
     * @return
     */
    public static boolean checkMobile(String mobile){
        boolean b = false;
        if (mobile!=null){
            b = Pattern.matches("^1[1-9]\\d{9}$", mobile);
        }
        return b;
    }
}
