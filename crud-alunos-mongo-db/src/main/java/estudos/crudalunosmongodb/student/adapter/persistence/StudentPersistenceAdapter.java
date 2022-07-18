package estudos.crudalunosmongodb.student.adapter.persistence;

import estudos.crudalunosmongodb.student.application.port.out.*;
import estudos.crudalunosmongodb.student.domain.Student;
import estudos.crudalunosmongodb.util.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
                                .orElseThrow(() -> new ResourceNotFoundException("Student not found!"));
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
