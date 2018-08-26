package com.bjs.demo.pagehelper.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bjs.demo.pagehelper.model.QueueEntity;
import com.bjs.demo.pagehelper.service.QueueService;
import com.github.pagehelper.PageHelper;

@Controller
public class IndexController {
	@Resource
	private QueueService queueService;
	@RequestMapping("/index")
	@ResponseBody
	public String index() throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", 298666);
		map.put("system", 4);
		map.put("startIndex", 0); 
		map.put("pageSize", 10);
		
		List<QueueEntity> list = queueService.queryForPageForAgent(map);
		return JSON.toJSONString(list);
	}
}
