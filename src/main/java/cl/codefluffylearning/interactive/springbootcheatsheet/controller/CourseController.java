package cl.codefluffylearning.interactive.springbootcheatsheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Course;
import cl.codefluffylearning.interactive.springbootcheatsheet.service.ICourseService;

@Controller
public class CourseController {
	
	@Autowired
	private ICourseService courseService;
	
	@GetMapping("/listCourses")
    public ModelAndView listCourses() {
		 
		List<Course> courseList = courseService.getAllCourses();
	
		ModelAndView mav = new ModelAndView();
		
        mav.addObject("courseList", courseList);
        
        return mav;
    }
	
	@GetMapping("/newCourse")
    public ModelAndView newCourse() {
		 
		ModelAndView mav = new ModelAndView();
        
        return mav;
    }
	
	@GetMapping("/modifyCourse")
    public ModelAndView modifyCourse() {
		 
		ModelAndView mav = new ModelAndView();
        
        return mav;
    }
	
	
	


}
