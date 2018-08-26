package com.bjs.demp.pagehelper.test;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
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
		PageHelper.startPage(1, 5);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", 298666);
		map.put("system", 4);
		map.put("startIndex", 0); 
		map.put("pageSize", 10);
		List<QueueEntity> list = queueService.queryForPageForAgent(map);
		System.out.println(list.size());
		System.out.println(JSONObject.toJSONString(list));
	}
	
	@Test
	public void saveQueue() {
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM--dd HH:mm:ss");
		for(int i =0;i<100;i++) {
			QueueEntity queue = new QueueEntity();
			queue.setAndroidJumpParam("test");
			queue.setAppid("1");
			queue.setContent("家庭和女人"+i);
			queue.setCreateTime(dateformat.format(new Date()));
			queue.setGeneralNoticeId(123);
			queue.setLocationCode("dfad");
			queue.setSystem(4);
			queue.setStatus(1);
			queue.setUserId(298666);
			queue.setReminderId(BigInteger.valueOf(1233L));
			queueService.saveQueue(queue);
		}
	}
}
