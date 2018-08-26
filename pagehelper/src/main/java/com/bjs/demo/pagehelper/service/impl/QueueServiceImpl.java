package com.bjs.demo.pagehelper.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.support.json.JSONParser;
import com.bjs.demo.pagehelper.dao.QueueDao;
import com.bjs.demo.pagehelper.model.QueueEntity;
import com.bjs.demo.pagehelper.service.QueueService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;



@Service("queueService")
public class QueueServiceImpl implements QueueService {
    private static final Logger log = LoggerFactory.getLogger(QueueServiceImpl.class);
    @Autowired
    private QueueDao queueDao;
	public List<QueueEntity> queryForPageForAgent(Map map) throws Exception {

        try {
        	PageHelper.startPage(1, 10);
            log.info("QueueServiceImpl#queryForPageForAgent()---START...");
            List<QueueEntity> list = queueDao.queryForPageForAgent(map);
            log.info("QueueServiceImpl#queryForPageForAgent()---END.....");
            return list;
        } catch (Exception e) {
            log.error("QueueServiceImpl#queryForPageForAgent()---END....", e);
            throw new Exception("分页获取消息信息报错。", e);
        }
	}
	
	public int saveQueue(QueueEntity queue) {
		return queueDao.saveQueue(queue);
	}

}
