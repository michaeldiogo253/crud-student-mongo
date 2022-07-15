package estudos.crudalunosmongodb.adapter.persistence;

import estudos.crudalunosmongodb.application.port.out.FindStudentByIdPort;
import estudos.crudalunosmongodb.application.port.out.SaveStudentPort;
import estudos.crudalunosmongodb.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

@Service
@RequiredArgsConstructor
public class StudentPersistenceAdapter implements SaveStudentPort, FindStudentByIdPort {

    private final StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudentById(String idStudent) {

        return studentRepository.findById(idStudent).orElseThrow(() -> new ResourceAccessException("Student not found"));
    }
}
