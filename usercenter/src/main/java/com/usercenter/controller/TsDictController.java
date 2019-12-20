package com.usercenter.controller;


import com.usercenter.entity.TsDict;
import com.usercenter.service.ITsDictService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dhl
 * @since 2019-09-06
 */
@RestController
@RequestMapping("/tsDict")
public class TsDictController {

    @Autowired
    ITsDictService tsDictService;

    @ApiOperation(value = "获取所有的业务字典",notes = "查询所有的业务字典数据")
    @ApiImplicitParams({@ApiImplicitParam()})
    @PostMapping(value = "/queryAllDict")
    public List<TsDict> queryAllDict(){
        return tsDictService.queryAllDict();
    }

    @GetMapping(value = "/aaa")
    public List<Map<String,Object>> aaa(){
       return tsDictService.aaa();
    }
}

