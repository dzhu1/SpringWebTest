package controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Student;

@Controller
@RequestMapping("/home")
public class FreeMarkerController {
	
	@RequestMapping("/freemarkerTest")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		Student student1 = new Student();
		student1.setName("hello");
		student1.setId(1);
		student1.setAge(10);
		
		Student student2 = new Student();
		student2.setName("world");
		student2.setId(2);
		student2.setAge(20);
		
		List<Student> students = new LinkedList<Student>();
		students.add(student1);
		students.add(student2);
		
		return new ModelAndView("freemarkerTest", "students", students);
	}

}
