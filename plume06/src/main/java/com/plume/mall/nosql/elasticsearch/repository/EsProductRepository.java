package com.plume.mall.nosql.elasticsearch.repository;

import com.plume.mall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Auther: Carl
 * @Date: 2021/04/10/13:58
 * @Description: 商品ES类
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {
    /**
     * 搜索查询
     * @param name 商品名称
     * @param subTitle 商品标题
     * @param keywords 商品关键字
     * @param page 分页信息
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);

}
