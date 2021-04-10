package com.plume.mall.dao;

import com.plume.mall.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/04/10/14:14
 * @Description: 搜索系统中的商品管理自定义Dao
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
