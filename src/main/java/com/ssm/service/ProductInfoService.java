package com.ssm.service;

import com.ssm.pojo.ProductInfo;
import com.ssm.pojo.vo.ProductVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author lichuang
 * @create 2021-09-08  15:15
 */
public interface ProductInfoService {

    //显示商品(不分页)
    List<ProductInfo> getAll();

    //分页查询
    PageInfo splitPage(int pageNum,int pageSize);

    //添加商品
    int save(ProductInfo info);

    //按主键id查询商品
    ProductInfo getById(int pid);

    //更新商品
    int update(ProductInfo info);

    //删除单个商品
    int delete(int pid);

    //批量删除
    int deleteBatch(String[] pids);

    //多条件查询
    List<ProductInfo> selectConditionSplitPage(ProductVo vo);

    //多条件查询分页
    PageInfo splitPageVo(ProductVo vo,int pageSize);

}
