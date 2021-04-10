package com.plume.mall.controller;

import com.plume.mall.common.api.CommonPage;
import com.plume.mall.common.api.CommonResult;
import com.plume.mall.nosql.elasticsearch.document.EsProduct;
import com.plume.mall.service.EsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/04/10/14:53
 * @Description: 搜索商品管理Controller
 */
@Controller
@RequestMapping("/esProduct")
@Api(tags = "EsProductController", description = "搜索商品管理")
public class EsProductController {
    @Autowired
    private EsProductService esProductService;

    @ApiOperation(value = "导入所有数据库中商品到ES")
    @RequestMapping(value = "/importAll", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> importAllList() {
        int count = esProductService.importAll();
        return CommonResult.success(count);
    }

    @ApiOperation(value = "根据id删除商品")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> delete(@PathVariable Long id) {
        esProductService.delete(id);
        return CommonResult.success(null);
    }

    @ResponseBody
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ApiOperation(value = "根据id批量删除商品")
    public CommonResult<Object> delete(@RequestParam("ids") List<Long> ids) {
        esProductService.delete(ids);
        return CommonResult.success(null);
    }

    @ResponseBody
    @RequestMapping(value = "/create/{id}", method = RequestMethod.POST)
    @ApiOperation(value = "根据id创建商品")
    public CommonResult<EsProduct> create(@PathVariable Long id) {
        EsProduct esProduct = esProductService.create(id);
        if (esProduct != null) {
            return CommonResult.success(esProduct);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsProduct>> search(@RequestParam(required = false) String keyword,
                                                      @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsProduct> esProductPage = esProductService.search(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esProductPage));
    }

}
