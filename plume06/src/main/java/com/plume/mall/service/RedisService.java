package com.plume.mall.service;

/**
 * @Auther: Carl
 * @Date: 2021/04/09/9:39
 * @Description:
 * Redis操作Service
 * 对象和数组都以json形式保存
 */
public interface RedisService {

    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 获取数据的key
     */
    String get(String key);

    /**
     * 设置超时时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param delta 自步增长
     */
    Long increment(String key, long delta);
}
