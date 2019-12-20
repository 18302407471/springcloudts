package com.vehts.controller;


import com.vehts.entity.TsDict;
import com.vehts.service.ITsDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dhl
 * @since 2019-09-06
 */
@RestController
@RequestMapping(value = "/tsDict")
public class TsDictController {

    @Autowired
    ITsDictService tsDictService;

    @GetMapping(value = "/queryAll")
    public List<TsDict> queryAll(){
        return tsDictService.queryAll();
    }
}

