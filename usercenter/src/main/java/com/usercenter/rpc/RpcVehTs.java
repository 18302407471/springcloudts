package com.usercenter.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * @author ：dhl
 * @date ： 2019/9/5 17:43
 * @description：rpc业务
 * @version:
 */
@FeignClient(value = "veh-ts")
public interface RpcVehTs {

    @GetMapping("/tsDict/queryAll")
    List<Map<String,Object>> aaa();
}
