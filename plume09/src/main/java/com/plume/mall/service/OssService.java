package com.plume.mall.service;

import com.plume.mall.dto.OssCallbackResult;
import com.plume.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Carl
 * @Date: 2021/04/12/11:18
 * @Description: oss文件上传管理
 */
public interface OssService {
    /**
     * oss文件上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
