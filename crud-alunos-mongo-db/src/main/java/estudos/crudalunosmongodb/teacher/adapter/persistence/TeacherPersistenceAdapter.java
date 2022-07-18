package estudos.crudalunosmongodb.teacher.adapter.persistence;

import estudos.crudalunosmongodb.teacher.application.port.out.FindTeacherByIdPort;
import estudos.crudalunosmongodb.teacher.application.port.out.SaveTeacherPort;
import estudos.crudalunosmongodb.teacher.domain.Teacher;
import estudos.crudalunosmongodb.util.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherPersistenceAdapter implements SaveTeacherPort, FindTeacherByIdPort {

    private final TeacherRepository teacherRepository;

    @Override
    public Teacher findTeacherById(String idTeacher) {

        return teacherRepository.findById(idTeacher)
                                .orElseThrow(() -> new ResourceNotFoundException("Teacher not found"));
    }

    @Override
    public void saveTeacher(Teacher teacher) {

        teacherRepository.save(teacher);
    }
}
