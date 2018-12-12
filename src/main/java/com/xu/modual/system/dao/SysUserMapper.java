package com.xu.modual.system.dao;

import org.apache.ibatis.annotations.Param;

import com.xu.common.frame.mapper.BasicMapper;
import com.xu.modual.system.model.SysUser;

public interface SysUserMapper extends BasicMapper<SysUser> {

    SysUser selectByUserName(String userName);
}