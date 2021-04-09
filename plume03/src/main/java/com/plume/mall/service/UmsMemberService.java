package com.plume.mall.service;

import com.plume.mall.common.api.CommonResult;

/**
 * @Auther: Carl
 * @Date: 2021/04/09/10:43
 * @Description: 用于生成验证码以及对验证码和手机号进行匹配
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 返回验证码与手机号是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
