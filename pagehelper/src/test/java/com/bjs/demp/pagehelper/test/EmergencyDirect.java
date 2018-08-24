package com.bjs.demp.pagehelper.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.bjs.demo.pagehelper.dao.QueueDao;
import com.bjs.demo.pagehelper.service.QueueService;

@ContextConfiguration(locations = { "classpath:spring-mvc.xml", "classpath:spring-mvc.xml" })
public class EmergencyDirect  extends AbstractJUnit4SpringContextTests {
	@Resource
	private QueueService queueService;
	@Test
	public void testPagePlugin() throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", 298666);
		map.put("system", 4);
		map.put("startIndex", 0); 
		map.put("pageSize", 10);
		queueService.queryForPageForAgent(map);
	}
}
