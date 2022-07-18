package estudos.crudalunosmongodb.teacher.application;

import estudos.crudalunosmongodb.teacher.adapter.in.web.request.RegisterTeacherRequest;
import estudos.crudalunosmongodb.teacher.application.port.out.SaveTeacherPort;
import estudos.crudalunosmongodb.teacher.domain.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class RegisterTeacherUseCase {

    private final SaveTeacherPort saveTeacherPort;

    public void execute(RegisterTeacherRequest request) {

        Teacher teacher = new Teacher(request.getName(),
                                      request.getCpf(),
                                      request.getEmail(),
                                      request.getBirthDate(),
                                      request.getMatter());

        saveTeacherPort.saveTeacher(teacher);

    }

}
