package com.ssm.service.impl;

import com.ssm.mapper.AdminMapper;
import com.ssm.pojo.Admin;
import com.ssm.pojo.AdminExample;
import com.ssm.service.AdminService;
import com.ssm.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lichuang
 * @create 2021-09-07  18:00
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String name, String pwd) {

        //添加查询条件
        AdminExample example = new AdminExample();

        example.createCriteria().andANameEqualTo(name);

        List<Admin> list = adminMapper.selectByExample(example);
        if (list.size()>0){
            Admin admin = list.get(0);

            //进行密码比对
            String pwdMd5 = MD5Util.getMD5(pwd);
            if (admin.getaPass().equals(pwdMd5)){
                return admin;
            }
        }

        return null;
    }
}
