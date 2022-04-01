package cl.codefluffylearning.interactive.springbootcheatsheet.dao;

import java.util.List;

import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Person;

public interface IPersonDAO {

	  List<Person> getAllPersons();
}
