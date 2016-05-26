package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import exceptions.InternalException;
import model.Student;

@Controller
public class ExceptionController {

	@RequestMapping(value = "/studentException", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("studentException", "command", new Student());
	}

	@RequestMapping(value = "/addStudentException", method = RequestMethod.POST)
	@ExceptionHandler({ InternalException.class })
	public String addStudent(@ModelAttribute("student") Student student, ModelMap model) {

		if (student.getName().length() < 5) {
			throw new InternalException("Given name is too short");
		} else {
			model.addAttribute("name", student.getName());
		}

		if (student.getAge() < 10) {
			throw new InternalException("Given age is too low");
		} else {
			model.addAttribute("age", student.getAge());
		}
		model.addAttribute("id", student.getId());
		return "result";
	}

}
