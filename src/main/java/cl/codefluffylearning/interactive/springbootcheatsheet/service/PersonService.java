package cl.codefluffylearning.interactive.springbootcheatsheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.codefluffylearning.interactive.springbootcheatsheet.dao.IPersonDAO;
import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Person;

@Service
public class PersonService implements IPersonService {
	
	@Autowired
	private IPersonDAO personDAO;

	@Override
	public List<Person> getAllPersons() {
		
		return personDAO.getAllPersons();
	}
	

}
