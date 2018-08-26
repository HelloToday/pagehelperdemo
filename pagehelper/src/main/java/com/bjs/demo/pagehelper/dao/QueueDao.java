package com.bjs.demo.pagehelper.dao;

import java.util.List;
import java.util.Map;

import com.bjs.demo.pagehelper.model.QueueEntity;

public interface QueueDao{
	public List<QueueEntity> queryForPageForAgent(Map map);
	public int saveQueue(QueueEntity map);
}
