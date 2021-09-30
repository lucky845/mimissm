package com.ssm.service;

import com.ssm.pojo.Admin;

/**
 * @author lichuang
 * @create 2021-09-07  18:00
 */

public interface AdminService {
    Admin login(String name,String pwd);
}
