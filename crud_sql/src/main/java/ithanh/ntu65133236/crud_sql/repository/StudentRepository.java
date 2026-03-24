package ithanh.ntu65133236.crud_sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ithanh.ntu65133236.crud_sql.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}