package estudos.crudalunosmongodb.student.application.port.out;

import estudos.crudalunosmongodb.student.domain.Student;

public interface SaveStudentPort {

    void saveStudent(Student student);
}
