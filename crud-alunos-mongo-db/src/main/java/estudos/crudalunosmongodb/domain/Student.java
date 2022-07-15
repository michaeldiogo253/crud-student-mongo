package estudos.crudalunosmongodb.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Getter
@NoArgsConstructor
public class Student {

    private String id;
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthDate;

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

}
