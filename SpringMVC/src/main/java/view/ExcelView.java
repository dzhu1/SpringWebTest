package view;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import model.Student;

public class ExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Student> studentList = new LinkedList<Student>();
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Number1");
		student1.setAge(1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Number2");
		student2.setAge(2);
		
		studentList.add(student1);
		studentList.add(student2);

		Sheet sheet = workbook.createSheet();
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Id");
		header.createCell(1).setCellValue("Name");
		header.createCell(2).setCellValue("Age");

		int rowNum = 1;
		for (Student student : studentList) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(student.getId());
			row.createCell(1).setCellValue(student.getName());
			row.createCell(2).setCellValue(student.getAge());
		}
	}  

}
