package com.plume.mall.service;

import com.plume.mall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/04/11/13:44
 * @Description: 会员浏览记录管理
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
