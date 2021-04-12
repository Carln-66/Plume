package com.plume.mall.service;

import com.plume.mall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/04/10/14:07
 * @Description: 商品搜索管理Service
 */
public interface EsProductService {
    /**
     * 从数据库中导入所有商品到ES
     */
    int importAll();

    /**
     * 根据id删除商品
     */
    void delete(Long id);

    /**
     * 根据id创建商品
     */
    EsProduct create(Long id);

    /**
     * 批量删除商品
     */
    void delete(List<Long> ids);

    /**
     * 根据关键字搜索名称或副标题
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);
}
