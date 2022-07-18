package estudos.crudalunosmongodb.teacher.application;

import estudos.crudalunosmongodb.student.application.port.out.FindStudentByIdPort;
import estudos.crudalunosmongodb.student.application.port.out.SaveStudentPort;
import estudos.crudalunosmongodb.student.domain.Student;
import estudos.crudalunosmongodb.teacher.application.port.out.FindTeacherByIdPort;
import estudos.crudalunosmongodb.teacher.domain.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class LinkTeacherToStudentUseCase {

    private final FindStudentByIdPort findStudentByIdPort;
    private final FindTeacherByIdPort findTeacherByIdPort;
    private final SaveStudentPort saveStudentPort;

    public void execute(String idStudent , String idTeacher){

        Student student = findStudentByIdPort.findStudentById(idStudent);

        Teacher teacher = findTeacherByIdPort.findTeacherById(idTeacher);

        student.bindTeacher(teacher);

        saveStudentPort.saveStudent(student);

    }

}
