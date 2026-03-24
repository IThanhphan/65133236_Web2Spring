package ithanh.ntu65133236.crud_sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ithanh.ntu65133236.crud_sql.models.Student;
import ithanh.ntu65133236.crud_sql.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping
	public List<Student> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Student getById(@PathVariable int id) {
		return service.getById(id);
	}

	@PostMapping
	public Student create(@RequestBody Student student) {
		return service.save(student);
	}

	@PutMapping("/{id}")
	public Student update(@PathVariable int id, @RequestBody Student student) {
		student.setId(id);
		return service.save(student);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
}