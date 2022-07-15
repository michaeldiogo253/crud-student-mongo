package estudos.crudalunosmongodb.adapter.in.web;

import estudos.crudalunosmongodb.adapter.in.web.response.StudentResponse;
import estudos.crudalunosmongodb.application.port.out.FindStudentByIdPort;
import estudos.crudalunosmongodb.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ListStudentByIdController {

    private final FindStudentByIdPort findStudentByIdPort;

    @GetMapping(path = "/{idStudent}")
    public ResponseEntity<StudentResponse> execute(@PathVariable("idStudent") String idStudent) {

        Student student = findStudentByIdPort.findStudentById(idStudent);

        return ResponseEntity.ok()
                             .body(StudentResponse.of(student));
    }

}