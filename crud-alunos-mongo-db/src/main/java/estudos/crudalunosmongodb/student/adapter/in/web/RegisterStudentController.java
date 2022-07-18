package estudos.crudalunosmongodb.student.adapter.in.web;

import estudos.crudalunosmongodb.student.adapter.in.web.request.RegisterStudentRequest;
import estudos.crudalunosmongodb.student.application.RegisterStudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RegisterStudentController {

    private final RegisterStudentUseCase useCase;

    @PostMapping(path = "/register")
    public ResponseEntity<String> execute(@Valid @RequestBody RegisterStudentRequest request) {

        useCase.execute(request.getName(), request.getCpf(), request.getEmail(), request.getBirthDate());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}