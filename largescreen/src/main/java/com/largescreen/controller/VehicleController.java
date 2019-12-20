package com.largescreen.controller;

import com.largescreen.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：dhl
 * @date ： 2019/9/6 17:56
 * @description：地图接口
 * @version: v1.0
 */
@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;
}
