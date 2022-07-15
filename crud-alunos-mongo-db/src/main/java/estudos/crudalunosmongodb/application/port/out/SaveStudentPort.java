package estudos.crudalunosmongodb.application.port.out;

import estudos.crudalunosmongodb.domain.Student;

public interface SaveStudentPort {

    void saveStudent(Student student);
}
