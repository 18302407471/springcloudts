package com.usercenter.service.impl;

import com.usercenter.entity.TsDict;
import com.usercenter.mapper.TsDictMapper;
import com.usercenter.rpc.RpcVehTs;
import com.usercenter.service.ITsDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Autowired
    RpcVehTs rpcVehTs;

    @Override
    public List<TsDict> queryAllDict() {
        return tsDictMapper.queryAllDict();
    }


    @Override
    public List<Map<String,Object>> aaa() {
        return rpcVehTs.aaa();
    }
}
