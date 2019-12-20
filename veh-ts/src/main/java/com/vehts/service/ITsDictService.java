package com.vehts.service;

import com.vehts.entity.TsDict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dhl
 * @since 2019-09-06
 */
public interface ITsDictService extends IService<TsDict> {

    List<TsDict> queryAll();
}
