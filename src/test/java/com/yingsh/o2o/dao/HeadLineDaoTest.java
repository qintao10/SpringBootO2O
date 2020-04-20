package com.yingsh.o2o.dao;

import com.yingsh.o2o.entity.HeadLine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeadLineDaoTest {
	@Autowired
	private HeadLineDao headLineDao;

	@Test
	public void testQueryheadLine() {
		List<HeadLine> headLineList = headLineDao.queryHeadLine(new HeadLine());
		assertEquals(4, headLineList.size());
	}
}
