package com.plume.mall.service.impl;

import com.plume.mall.common.api.CommonResult;
import com.plume.mall.component.CancelOrderSender;
import com.plume.mall.dto.OrderParam;
import com.plume.mall.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Carl
 * @Date: 2021/04/11/21:09
 * @Description: 前台订单管理Service
 */
@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
    private static Logger LOGGER = LoggerFactory.getLogger(OmsPortalOrderServiceImpl.class);
    @Autowired
    private CancelOrderSender cancelOrderSender;

    @Override
    public CommonResult generateOrder(OrderParam orderParam) {
        //todo 执行下单操作
        LOGGER.info("process generateOrder");
        //当下单完成后开启延迟消息，用于当用户没有付款时取消订单。同时，orderId也应该在下单之后生成
        sendDelayMessageCancelOrder(11L);
        return CommonResult.success(null, "下单成功");
    }

    @Override
    public void cancelOrder(Long orderId) {
        //todo 执行取消订单的操作
        LOGGER.info("process cancelOrder orderId:{}", orderId);
    }

    private void sendDelayMessageCancelOrder(Long orderId) {
        //获取订单超时时间，在测试中设定为30s
        long delayTimes = 30 * 1000;
        //发送延迟消息
        cancelOrderSender.sendMessage(orderId, delayTimes);
    }
}
