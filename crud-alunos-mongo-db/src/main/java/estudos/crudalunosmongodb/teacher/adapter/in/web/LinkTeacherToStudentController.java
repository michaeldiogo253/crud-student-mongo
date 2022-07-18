package estudos.crudalunosmongodb.teacher.adapter.in.web;

import estudos.crudalunosmongodb.teacher.adapter.in.web.request.LinkTeacherToStudentRequest;
import estudos.crudalunosmongodb.teacher.application.LinkTeacherToStudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LinkTeacherToStudentController {

    private final LinkTeacherToStudentUseCase useCase;

    @PostMapping("/link-teacher-to-student")
    public ResponseEntity<Void> linkTeacherToStudent(@Valid @RequestBody LinkTeacherToStudentRequest request) {

        useCase.execute(request.getIdStudent(), request.getIdTeacher());
        return ResponseEntity.ok()
                             .build();
    }
}
