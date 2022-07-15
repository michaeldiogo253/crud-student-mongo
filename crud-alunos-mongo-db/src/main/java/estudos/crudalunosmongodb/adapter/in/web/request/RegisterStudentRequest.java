package estudos.crudalunosmongodb.adapter.in.web.request;

import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Value
public class RegisterStudentRequest {

    @NotEmpty(message = "Name cannot be empty") String name;
    @CPF(message = "CPF is not valid") @NotEmpty(message = "CPF cannot be empty") String cpf;
    @Email(message = "Email is not valid") @NotEmpty(message = "Email cannot be empty") String email;
    @NotNull(message = "BirthDate cannot be null") LocalDate birthDate;
}
