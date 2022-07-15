package estudos.crudalunosmongodb.application;

import estudos.crudalunosmongodb.application.port.out.SaveStudentPort;
import estudos.crudalunosmongodb.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
@Transactional
public class RegisterStudentUseCase {

    private final SaveStudentPort saveStudentPort;

    public void execute(String name, String cpf, String email, LocalDate birthDate) {

        Student student = new Student(name, cpf, email, birthDate);
        saveStudentPort.saveStudent(student);
    }

}
