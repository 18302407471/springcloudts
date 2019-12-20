package com.vehts.service.impl;

import com.vehts.entity.TsDict;
import com.vehts.mapper.TsDictMapper;
import com.vehts.service.ITsDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dhl
 * @since 2019-09-06
 */
@Service
public class TsDictService extends ServiceImpl<TsDictMapper, TsDict> implements ITsDictService {

    @Autowired
    TsDictMapper tsDictMapper;

    @Override
    public List<TsDict> queryAll() {
        return tsDictMapper.queryAll();
    }
}
