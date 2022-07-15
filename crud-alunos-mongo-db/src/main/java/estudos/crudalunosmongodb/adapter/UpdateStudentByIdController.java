package estudos.crudalunosmongodb.adapter;

import estudos.crudalunosmongodb.adapter.in.web.request.UpdateStudentRequest;
import estudos.crudalunosmongodb.application.UpdateStudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UpdateStudentByIdController {

    private final UpdateStudentUseCase updateStudentUseCase;

    @PutMapping(path = "/{idStudent}")
    public ResponseEntity<String> execute(@Valid @RequestBody UpdateStudentRequest request) {

        updateStudentUseCase.execute(request);

        return ResponseEntity.noContent()
                             .build();
    }

}