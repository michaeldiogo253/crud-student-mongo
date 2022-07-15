package estudos.crudalunosmongodb.application.port.out;

import estudos.crudalunosmongodb.domain.Student;

import java.util.List;

public interface FindAllStudentPort {

    List<Student> findAllStudent();
}
