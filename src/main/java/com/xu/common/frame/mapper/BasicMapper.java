package com.xu.common.frame.mapper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author lgh
 * @date  2017/11/30
 */
public interface BasicMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
