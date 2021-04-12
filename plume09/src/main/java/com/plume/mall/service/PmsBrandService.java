package com.plume.mall.service;

import com.plume.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/04/08/18:32
 * @Description:
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
