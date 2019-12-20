package com.usercenter.mapper;

import com.usercenter.entity.TsDict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dhl
 * @since 2019-09-06
 */
public interface TsDictMapper extends BaseMapper<TsDict> {

    List<TsDict> queryAllDict();
}
