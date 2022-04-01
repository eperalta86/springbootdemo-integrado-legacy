package cl.codefluffylearning.interactive.springbootcheatsheet.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Person;

@Transactional
@Repository
public class PersonDAO implements IPersonDAO{

	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public List<Person> getAllPersons() {
		
		List<Person> result = new ArrayList<Person>();
		
		try {
			
			String hql = "FROM Person as p ORDER BY p.personId";
			
			result = (List<Person>) entityManager.createQuery(hql).getResultList();
			
			return result;
			
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}

	}

}
