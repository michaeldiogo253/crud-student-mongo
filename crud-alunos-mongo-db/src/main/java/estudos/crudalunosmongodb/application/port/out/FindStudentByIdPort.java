package estudos.crudalunosmongodb.application.port.out;

import estudos.crudalunosmongodb.domain.Student;

public interface FindStudentByIdPort {

    Student findStudentById(String idStudent);
}
