package cl.codefluffylearning.interactive.springbootcheatsheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.codefluffylearning.interactive.springbootcheatsheet.entity.Person;
import cl.codefluffylearning.interactive.springbootcheatsheet.service.IPersonService;

@Controller
public class PersonController {
	
	@Autowired
	private IPersonService personService;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		 
		List<Person> delBBDD = personService.getAllPersons();
		
		String a = delBBDD.get(0).getName();
	
		
        model.addAttribute("name", a);
        return "greeting";
    }
	
	@GetMapping("/listPerson")
    public String listPerson(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		 
		List<Person> delBBDD = personService.getAllPersons();
		
		String a = delBBDD.get(0).getName();
	
		
        model.addAttribute("name", a);
        return "listPerson";
    }
	
	

}
