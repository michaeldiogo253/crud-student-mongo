package estudos.crudalunosmongodb.teacher.adapter.in.web;

import estudos.crudalunosmongodb.teacher.adapter.in.web.request.RegisterTeacherRequest;
import estudos.crudalunosmongodb.teacher.application.RegisterTeacherUseCase;
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
public class RegisterTeacherController {

    private final RegisterTeacherUseCase useCase;

    @PostMapping("/register-teacher")
    public ResponseEntity<Void> registerTeacher(@Valid @RequestBody RegisterTeacherRequest request) {

        useCase.execute(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                             .build();
    }
}
