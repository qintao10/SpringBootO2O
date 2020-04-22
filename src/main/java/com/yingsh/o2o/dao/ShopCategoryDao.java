package com.yingsh.o2o.dao;

import com.yingsh.o2o.entity.ShopCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by qt on 2020/4/11.
 */
public interface ShopCategoryDao {

    List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);

	/**
	 * ͨ��Id����Ψһ�ĵ��������Ϣ
	 * 
	 * @param shopCategoryId
	 * @return
	 */
	ShopCategory queryShopCategoryById(long shopCategoryId);

	/**
	 * ���ݴ����Id�б��ѯ���������Ϣ(����������Աѡ��ɾ������ʱ���ã���Ҫ�Ǵ���ͼƬ)
	 * 
	 * @param shopCategoryIdList
	 * @return
	 */
	List<ShopCategory> queryShopCategoryByIds(List<Long> shopCategoryIdList);

	/**
	 * ����һ�����������Ϣ
	 * 
	 * @param shopCategory
	 * @return
	 */
	int insertShopCategory(ShopCategory shopCategory);

	/**
	 * ���µ��������Ϣ
	 * 
	 * @param shopCategory
	 * @return
	 */
	int updateShopCategory(ShopCategory shopCategory);

	/**
	 * ɾ���������
	 * 
	 * @param shopCategoryId
	 * @return
	 */
	int deleteShopCategory(long shopCategoryId);

	/**
	 * ����ɾ���������
	 * 
	 * @param shopCategoryIdList
	 * @return
	 */
	int batchDeleteShopCategory(List<Long> shopCategoryIdList);
}
