package estudos.crudalunosmongodb.application;

import estudos.crudalunosmongodb.application.port.out.DeleteStudentByIdPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class DeleteStudentByIdUseCase {

    private final DeleteStudentByIdPort deleteStudentByIdPort;

    public void execute(String idStudent) {

        deleteStudentByIdPort.deleteStudentById(idStudent);

    }

}