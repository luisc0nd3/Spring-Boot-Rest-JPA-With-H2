package com.kenesys.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenesys.model.dao.ITaskDao;
import com.kenesys.model.entitys.Task;

@Service
public class TaskService implements ITaskService {
	
	@Autowired
	private ITaskDao taskDao;
	
	/**
	 * Method to get all the task
	 * @return
	 */
	public List<Task> getTask() {
		
		return (List<Task>) taskDao.findAll();
	}
	
}
