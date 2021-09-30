package com.ssm.test;

import com.ssm.mapper.ProductInfoMapper;
import com.ssm.pojo.ProductInfo;
import com.ssm.pojo.vo.ProductVo;
import com.ssm.utils.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

/**
 * @author lichuang
 * @create 2021-09-07  17:13
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_dao.xml","classpath:applicationContext_service.xml"})
public class Mytest {


    @Autowired
    ProductInfoMapper productInfoMapper;
    @Test
    public void testSelectConditionSplitPage(){
        ProductVo productVo = new ProductVo();
        productVo.setTypeid(1);
        productVo.setHprice(3000);
        List<ProductInfo> list = productInfoMapper.selectConditionSplitPage(productVo);
        list.forEach(System.out::println);
    }






    @Test
    public void testMD5(){
        String md5 = MD5Util.getMD5("000000");
        System.out.println(md5);
    }



}
