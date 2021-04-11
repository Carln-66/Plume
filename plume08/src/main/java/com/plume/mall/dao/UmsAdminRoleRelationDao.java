package com.plume.mall.dao;

import com.plume.mall.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/04/09/14:10
 * @Description: 后台用户与角色管理自定义Dao
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户的所有权限（包括加减权限）
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
