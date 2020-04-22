package com.yingsh.o2o.service;

import com.yingsh.o2o.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by qt on 2020/4/9.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceTest {

    @Autowired
    private AreaService areaService;

    @Autowired
    private CacheService cacheService;

    @Test
    public void getAreaList(){
        List<Area> areaList = areaService.getAreaList();
        cacheService.removeFromCache(areaService.AREAKEY);
        areaList = areaService.getAreaList();
        assertEquals(2, areaList.size());
    }
}
