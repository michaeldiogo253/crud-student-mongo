package estudos.crudalunosmongodb.teacher.application.port.out;

import estudos.crudalunosmongodb.teacher.domain.Teacher;

public interface SaveTeacherPort {

    public void saveTeacher(Teacher teacher);
}
