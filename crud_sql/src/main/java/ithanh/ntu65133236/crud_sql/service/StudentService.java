package ithanh.ntu65133236.crud_sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ithanh.ntu65133236.crud_sql.models.Student;
import ithanh.ntu65133236.crud_sql.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public List<Student> getAll() {
		return repository.findAll();
	}

	public Student getById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Student save(Student student) {
		return repository.save(student);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
}