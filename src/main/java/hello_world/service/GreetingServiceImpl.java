package hello_world.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hello_world.dao.GreetingDao;
import hello_world.model.Greeting;

@Service
@Transactional
public class GreetingServiceImpl implements GreetingService {
 
	GreetingDao greetingDao;
 
 @Autowired
 public void setUserDao(GreetingDao greetingDao) {
  this.greetingDao = greetingDao;
 }

 public Greeting findGreetingById(int id) {
  return greetingDao.findGreetingById(id);
 }

}
