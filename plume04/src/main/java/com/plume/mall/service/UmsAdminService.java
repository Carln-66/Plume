package com.plume.mall.service;

import com.plume.mall.mbg.model.UmsAdmin;
import com.plume.mall.mbg.model.UmsPermission;

import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/04/09/13:46
 * @Description: 后台管理员相关服务接口
 */
public interface UmsAdminService {
    /**
     * 根据用户名返回后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和加减权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

}
