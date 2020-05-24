package com.kenesys.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.kenesys.model.entitys.Task;

public interface ITaskDao extends CrudRepository<Task, Long> {

}