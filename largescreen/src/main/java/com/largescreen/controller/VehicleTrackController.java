package com.largescreen.controller;

import com.largescreen.service.VehicleTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：dhl
 * @date ： 2019/9/6 17:55
 * @description：大屏轨迹接口
 * @version: v1.0
 */
@RestController
@RequestMapping(value = "/vehicletrack")
public class VehicleTrackController {

    @Autowired
    VehicleTrackService vehicleTrackService;
}
