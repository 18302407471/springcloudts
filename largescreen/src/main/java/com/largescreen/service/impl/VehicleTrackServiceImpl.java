package com.largescreen.service.impl;

import com.largescreen.service.VehicleTrackService;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：dhl
 * @date ： 2019/9/6 17:53
 * @description：轨迹
 * @version:
 */
@Service
public class VehicleTrackServiceImpl implements VehicleTrackService {

    @Autowired
    QueryRunner queryRunner;
}
