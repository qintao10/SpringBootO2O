package com.yingsh.o2o.service;

import com.yingsh.o2o.dto.AreaExecution;
import com.yingsh.o2o.entity.Area;

import java.util.List;

/**
 * Created by qt on 2020/4/9.
 */
public interface AreaService {

    public static final String AREAKEY = "arealist";

	/**
	 * ��ȡ�����б����ȴӻ����ȡ
	 * 
	 * @return
	 */
	List<Area> getAreaList();

	/**
	 * ����������Ϣ
	 * 
	 * @param area
	 * @return
	 */
	AreaExecution addArea(Area area);

	/**
	 * �޸�������Ϣ
	 * 
	 * @param area
	 * @return
	 */
	AreaExecution modifyArea(Area area);

}
