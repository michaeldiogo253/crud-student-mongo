package estudos.crudalunosmongodb.student.adapter.in.web.response;

import estudos.crudalunosmongodb.student.domain.Student;
import estudos.crudalunosmongodb.teacher.adapter.in.web.response.TeacherResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private String id;
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthDate;
    private TeacherResponse teacherResponse;

    public static StudentResponse of(Student student) {

        return new StudentResponse(student.getId(),
                                   student.getName(),
                                   student.getCpf(),
                                   student.getEmail(),
                                   student.getBirthDate(),
                                   TeacherResponse.from(student.getTeacher()));
    }

    public static List<StudentResponse> of(List<Student> students) {

        return students.stream()
                       .map(StudentResponse::of)
                       .collect(Collectors.toList());

    }



}
