package com.hxy.hr.service;

import com.hxy.hr.entity.PersonEntity;

import java.util.List;
import java.util.Map;

/**
 * 人事表
 * 
 * @author kenny
 * @email xuyongkun22@163.com
 * @date 2017-10-26 14:48:12
 */
public interface PersonService {
	
	PersonEntity queryObject(String id);
	
	List<PersonEntity> queryList(Map<String, Object> map);

    List<PersonEntity> queryListByBean(PersonEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(PersonEntity person);
	
	int update(PersonEntity person);
	
	int delete(String id);
	
	int deleteBatch(String[] ids);
}
