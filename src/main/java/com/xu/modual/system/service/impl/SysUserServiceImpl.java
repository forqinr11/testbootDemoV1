package com.xu.modual.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xu.modual.system.dao.SysUserMapper;
import com.xu.modual.system.model.SysUser;
import com.xu.modual.system.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getUserInfo(String userName){

        return sysUserMapper.selectByUserName(userName);
    }
}
