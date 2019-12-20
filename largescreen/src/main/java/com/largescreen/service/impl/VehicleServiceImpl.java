package com.largescreen.service.impl;

import com.largescreen.service.VehicleService;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：dhl
 * @date ： 2019/9/6 17:57
 * @description：地图数据逻辑
 * @version: v1.0
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    QueryRunner queryRunner;
}
