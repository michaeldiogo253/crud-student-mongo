package estudos.crudalunosmongodb.adapter.persistence;

import estudos.crudalunosmongodb.application.port.out.*;
import estudos.crudalunosmongodb.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentPersistenceAdapter implements SaveStudentPort,
                                                  FindStudentByIdPort,
                                                  ExistStudentByIdPort,
                                                  FindAllStudentPort,
                                                  DeleteStudentByIdPort {

    private final StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {

        studentRepository.save(student);
    }

    @Override
    public Student findStudentById(String idStudent) {

        return studentRepository.findById(idStudent)
                                .orElseThrow(() -> new ResourceAccessException("Student not found"));
    }

    @Override
    public boolean existStudentById(String idStudent) {

        return studentRepository.existsById(idStudent);
    }

    @Override
    public List<Student> findAllStudent() {

        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentById(String idStudent) {

        studentRepository.deleteById(idStudent);
    }
}
