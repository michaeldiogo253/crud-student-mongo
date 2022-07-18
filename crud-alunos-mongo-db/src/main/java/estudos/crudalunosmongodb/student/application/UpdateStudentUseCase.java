package estudos.crudalunosmongodb.student.application;

import estudos.crudalunosmongodb.student.adapter.in.web.request.UpdateStudentRequest;
import estudos.crudalunosmongodb.student.application.port.out.FindStudentByIdPort;
import estudos.crudalunosmongodb.student.application.port.out.SaveStudentPort;
import estudos.crudalunosmongodb.student.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class UpdateStudentUseCase {

    private final FindStudentByIdPort findStudentByIdPort;
    private final SaveStudentPort saveStudentPort;

    public void execute(UpdateStudentRequest request) {

        Student student = findStudentByIdPort.findStudentById(request.getIdStudent());
        student.updateStudent(request.getName(), request.getCpf(), request.getEmail(), request.getBirthDate());
        saveStudentPort.saveStudent(student);
    }

}