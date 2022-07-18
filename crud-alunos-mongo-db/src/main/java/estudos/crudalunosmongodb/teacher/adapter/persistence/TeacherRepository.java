package estudos.crudalunosmongodb.teacher.adapter.persistence;

import estudos.crudalunosmongodb.teacher.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, String> {

}
