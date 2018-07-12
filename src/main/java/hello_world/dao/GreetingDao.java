package hello_world.dao;

import java.util.List;

import hello_world.model.Greeting;

public interface GreetingDao { 
 public Greeting findGreetingById(int id);
}
