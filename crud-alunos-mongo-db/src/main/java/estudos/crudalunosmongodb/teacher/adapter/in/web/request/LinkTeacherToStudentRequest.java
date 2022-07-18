package estudos.crudalunosmongodb.teacher.adapter.in.web.request;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class LinkTeacherToStudentRequest {

    @NotBlank(message = "ID student not be empty or null") String idStudent;
    @NotBlank(message = "ID teacher not be empty or null") String idTeacher;
}
