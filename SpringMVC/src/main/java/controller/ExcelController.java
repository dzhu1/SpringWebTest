package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExcelController {
	
	@RequestMapping("/excel")  
	public String helloExcel(){  
	    return "excel";  
	} 	

}
