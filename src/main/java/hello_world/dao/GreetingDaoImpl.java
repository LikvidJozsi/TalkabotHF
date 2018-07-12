package hello_world.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hello_world.model.Greeting;

@Repository
public class GreetingDaoImpl implements GreetingDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public Greeting findGreetingById(int id) {
		return (Greeting) getSession().get(Greeting.class, id);
	}

}
