package com.bjs.demp.pagehelper.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.alibaba.fastjson.JSONObject;
import com.bjs.demo.pagehelper.model.QueueEntity;
import com.bjs.demo.pagehelper.service.QueueService;
import com.github.pagehelper.PageHelper;

@ContextConfiguration(locations = {  "classpath:spring-config.xml" })
public class EmergencyDirect  extends AbstractJUnit4SpringContextTests {
	@Resource
	private QueueService queueService;
	@Test
	public void testPagePlugin() throws Exception{
		PageHelper.startPage(10000, 10);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", 298666);
		map.put("system", 4);
		map.put("startIndex", 0); 
		map.put("pageSize", 10);
		List<QueueEntity> list = queueService.queryForPageForAgent(map);
		System.out.println(list.size());
		System.out.println(JSONObject.toJSONString(list));
	}
}
