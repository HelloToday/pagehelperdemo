package com.bjs.demo.pagehelper.service;

import java.util.List;
import java.util.Map;

import com.bjs.demo.pagehelper.model.QueueEntity;


public interface QueueService {
	List<QueueEntity> queryForPageForAgent(Map map) throws Exception;
}
