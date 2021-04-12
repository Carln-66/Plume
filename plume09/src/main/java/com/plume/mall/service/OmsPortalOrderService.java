package com.plume.mall.service;

import com.plume.mall.common.api.CommonResult;
import com.plume.mall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: Carl
 * @Date: 2021/04/11/21:00
 * @Description: 前台订单管理
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
