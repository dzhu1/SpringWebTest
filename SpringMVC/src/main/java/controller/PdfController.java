package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PdfController {

    @RequestMapping("/pdf")  
    public String helloPDF(){  
        return "helloPDF";  
    }  
}
