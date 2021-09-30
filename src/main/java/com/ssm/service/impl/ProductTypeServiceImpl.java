package com.ssm.service.impl;

import com.ssm.mapper.ProductTypeMapper;
import com.ssm.pojo.ProductType;
import com.ssm.pojo.ProductTypeExample;
import com.ssm.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lichuang
 * @create 2021-09-08  22:16
 */

@Service(value = "ProductTypeServiceImpl")
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    ProductTypeMapper productTypeMapper;
    @Override
    public List<ProductType> getAll() {
        List<ProductType> list = productTypeMapper.selectByExample(new ProductTypeExample());
        return list;
    }
}
