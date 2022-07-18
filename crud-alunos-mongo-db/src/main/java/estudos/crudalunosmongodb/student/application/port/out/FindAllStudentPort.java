package estudos.crudalunosmongodb.student.application.port.out;

import estudos.crudalunosmongodb.student.domain.Student;

import java.util.List;

public interface FindAllStudentPort {

    List<Student> findAllStudent();
}
