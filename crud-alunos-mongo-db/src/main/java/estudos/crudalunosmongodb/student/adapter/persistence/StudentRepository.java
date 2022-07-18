package estudos.crudalunosmongodb.student.adapter.persistence;

import estudos.crudalunosmongodb.student.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
