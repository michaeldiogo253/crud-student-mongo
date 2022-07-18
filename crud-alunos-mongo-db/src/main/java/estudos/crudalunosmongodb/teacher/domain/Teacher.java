package estudos.crudalunosmongodb.teacher.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Getter
@NoArgsConstructor
public class Teacher {

    @Id private String id;
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthDate;
    private String matter;

    public Teacher(String name, String cpf, String email, LocalDate birthDate, String matter) {

        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.birthDate = birthDate;
        this.matter = matter;
    }
}
