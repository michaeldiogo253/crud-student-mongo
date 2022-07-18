package estudos.crudalunosmongodb.student.domain;

import estudos.crudalunosmongodb.teacher.domain.Teacher;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Getter
@NoArgsConstructor
public class Student {

    @Id private String id;
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthDate;
    @DBRef
    private Teacher teacher;

    public Student(String name, String cpf, String email, LocalDate birthDate) {

        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.birthDate = birthDate;
    }

    public void updateStudent(String name, String cpf, String email, LocalDate birthDate) {

        this.name = name.isBlank() ? this.name : name;
        this.cpf = cpf.isBlank() ? this.cpf : cpf;
        this.email = email.isBlank() ? this.email : email;
        this.birthDate = birthDate == null ? this.birthDate : birthDate;
    }

    public void bindTeacher(Teacher teacher) {

        this.teacher = teacher;
    }

}
