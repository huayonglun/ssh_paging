package com.oracle.dao;

import java.util.List;

import com.oracle.common.PageInfo;

public interface BaseDao<T>{
	
	public void save(T t);
	
	public void update(T t);
	
	public void delete(Class<T> clazz,java.io.Serializable id);

	
	public T getEntityById(Class<T> clazz,java.io.Serializable id);
	
	public List<T> getAll(Class<T> clazz);
	
	public List<T> getEntity(Class<T> clazz,String name,Object value);
	
	public void getAll(Class<T> clazz,PageInfo	info);
	
	public Integer getCount(Class<T> clazz);

}
