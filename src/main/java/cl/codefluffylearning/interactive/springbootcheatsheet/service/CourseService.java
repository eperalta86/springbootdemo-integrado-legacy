package cl.codefluffylearning.interactive.springbootcheatsheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.codefluffylearning.interactive.springbootcheatsheet.dao.ICourseDAO;
import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Course;

@Service
public class CourseService implements ICourseService {
	
	@Autowired
	private ICourseDAO courseDAO;

	@Override
	public List<Course> getAllCourses() {
		
		
		
		return courseDAO.getAllCourses();
	}
	

}
