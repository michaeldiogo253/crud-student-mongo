package estudos.crudalunosmongodb.teacher.application.port.out;

import estudos.crudalunosmongodb.teacher.domain.Teacher;

public interface FindTeacherByIdPort {

    Teacher findTeacherById(String idTeacher);
}
