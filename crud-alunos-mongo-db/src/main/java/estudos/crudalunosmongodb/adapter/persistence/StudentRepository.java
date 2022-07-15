package estudos.crudalunosmongodb.adapter.persistence;

import estudos.crudalunosmongodb.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
