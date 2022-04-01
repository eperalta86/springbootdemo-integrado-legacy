package cl.codefluffylearning.interactive.springbootcheatsheet.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Course;

@Transactional
@Repository
public class CourseDAO implements ICourseDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> getAllCourses() {

		List<Course> result = new ArrayList<Course>();

		try {

			String hql = "FROM Course as c ORDER BY c.courseId";

			result = (List<Course>) entityManager.createQuery(hql).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
			result = new ArrayList<Course>(); // better empty than null
		}

		return result;

	}

	@Override
	public String createCourse(Course course) {

		String result;

		try {

			entityManager.getTransaction().begin();
			entityManager.persist(course);
			entityManager.getTransaction().commit();

			result = "ok";

		} catch (Exception e) {
			e.printStackTrace();
			result = "fail";

		}

		return result;
	}

	@Override
	public Course findCourse(Long courseId) {

		Course course = new Course();

		try {
			course = entityManager.find(Course.class, courseId);
			entityManager.detach(course);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return course;

	}

	@Override
	public String updateCourse(Course course) {

		String result;

		try {
			Course updatedCourse = course;
			entityManager.detach(course);

			updatedCourse.setCost(course.getCost());
			updatedCourse.setDuration(course.getDuration());
			updatedCourse.setTitle(course.getTitle());
			entityManager.getTransaction().begin();
			entityManager.merge(updatedCourse);
			entityManager.getTransaction().commit();
			result = "ok";
		} catch (Exception e) {
			e.printStackTrace();
			result = "fail";
		}

		return result;
	}

	@Override
	public String deleteCourse(Long courseId) {
		String result;
		
		try {
			
			Course course = entityManager.find(Course.class, courseId);
			entityManager.remove(course);
			entityManager.getTransaction().commit();
			result = "ok";
			
		} catch (Exception e) {
			e.printStackTrace();
			result = "fail";
		}
		
		return result;
	}
}
