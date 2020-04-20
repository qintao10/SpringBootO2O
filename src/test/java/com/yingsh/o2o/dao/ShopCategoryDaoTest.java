package com.yingsh.o2o.dao;

import com.yingsh.o2o.entity.ShopCategory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopCategoryDaoTest {
	@Autowired
	private ShopCategoryDao shopCategoryDao;

	@Test
	@Ignore
	public void testQueryShopCategory() {
		List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(null);
		System.out.println(shopCategoryList.size());
		assertEquals(1,shopCategoryList.size());
	}
}
