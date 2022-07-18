package estudos.crudalunosmongodb.student.application.port.out;

import estudos.crudalunosmongodb.student.domain.Student;

public interface FindStudentByIdPort {

    Student findStudentById(String idStudent);
}
