package com.vehts.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author ：dhl
 * @date ： 2019/9/5 17:08
 * @description：veh-ts的rpc
 * @version:
 */
@FeignClient(value = "usercenter")
public interface RpcUserCenter {

    @GetMapping(value = "/getUser")
    Map<String,Object> getUser();

}
