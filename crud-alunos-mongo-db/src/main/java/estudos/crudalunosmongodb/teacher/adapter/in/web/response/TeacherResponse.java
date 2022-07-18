package estudos.crudalunosmongodb.teacher.adapter.in.web.response;

import estudos.crudalunosmongodb.teacher.domain.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherResponse {

    private String id;
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthDate;
    private String matter;

    public static TeacherResponse from(Teacher teacher) {

        return teacher == null ? new TeacherResponse() : new TeacherResponse(teacher.getId(),
                                   teacher.getName(),
                                   teacher.getCpf(),
                                   teacher.getEmail(),
                                   teacher.getBirthDate(),
                                   teacher.getMatter());
    }

    public static List<TeacherResponse> from(List<Teacher> teachers) {

        return teachers.stream()
                       .map(TeacherResponse::from)
                       .collect(Collectors.toList());
    }
}
