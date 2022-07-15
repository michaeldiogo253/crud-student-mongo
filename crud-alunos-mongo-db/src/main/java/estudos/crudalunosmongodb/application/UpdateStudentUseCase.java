package estudos.crudalunosmongodb.application;

import estudos.crudalunosmongodb.adapter.in.web.request.UpdateStudentRequest;
import estudos.crudalunosmongodb.application.port.out.FindStudentByIdPort;
import estudos.crudalunosmongodb.application.port.out.SaveStudentPort;
import estudos.crudalunosmongodb.domain.Student;
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