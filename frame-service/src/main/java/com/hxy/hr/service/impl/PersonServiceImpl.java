package com.hxy.hr.service.impl;

import com.hxy.hr.dao.PersonDao;
import com.hxy.hr.entity.PersonEntity;
import com.hxy.hr.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("personService")
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;
	
	@Override
	public PersonEntity queryObject(String id){
		return personDao.queryObject(id);
	}
	
	@Override
	public List<PersonEntity> queryList(Map<String, Object> map){
		return personDao.queryList(map);
	}

    @Override
    public List<PersonEntity> queryListByBean(PersonEntity entity) {
        return personDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return personDao.queryTotal(map);
	}
	
	@Override
	public int save(PersonEntity person){
		return personDao.save(person);
	}
	
	@Override
	public int update(PersonEntity person){
        return personDao.update(person);
	}
	
	@Override
	public int delete(String id){
        return personDao.delete(id);
	}
	
	@Override
	public int deleteBatch(String[] ids){
        return personDao.deleteBatch(ids);
	}
	
}
