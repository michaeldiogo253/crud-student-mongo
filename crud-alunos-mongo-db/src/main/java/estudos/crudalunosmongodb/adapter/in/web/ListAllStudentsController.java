package estudos.crudalunosmongodb.adapter.in.web;

import estudos.crudalunosmongodb.adapter.in.web.response.StudentResponse;
import estudos.crudalunosmongodb.application.port.out.FindAllStudentPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ListAllStudentsController {

    private final FindAllStudentPort findAllStudentPort;

    @PostMapping(path = "/list-all")
    public ResponseEntity<List<StudentResponse>> execute() {

        return ResponseEntity.ok()
                             .body(StudentResponse.of(findAllStudentPort.findAllStudent()));
    }

}