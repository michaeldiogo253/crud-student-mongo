package estudos.crudalunosmongodb.student.application;

import estudos.crudalunosmongodb.student.application.port.out.DeleteStudentByIdPort;
import estudos.crudalunosmongodb.student.application.port.out.ExistStudentByIdPort;
import estudos.crudalunosmongodb.util.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class DeleteStudentByIdUseCase {

    private final DeleteStudentByIdPort deleteStudentByIdPort;
    private final ExistStudentByIdPort existStudentByIdPort;

    public void execute(String idStudent) {

        if (!existStudentByIdPort.existStudentById(idStudent)) {
            throw new ResourceNotFoundException("Student not found!");
        }

        deleteStudentByIdPort.deleteStudentById(idStudent);

    }

}