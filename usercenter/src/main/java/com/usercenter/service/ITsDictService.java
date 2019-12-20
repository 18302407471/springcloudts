package com.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.usercenter.entity.TsDict;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dhl
 * @since 2019-09-06
 */
public interface ITsDictService extends IService<TsDict> {

    List<TsDict> queryAllDict();

    List<Map<String,Object>> aaa();

}
