package estudos.crudalunosmongodb.student.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DeleteStudentByIdController {


    @DeleteMapping(path = "/{idStudent}")
    public ResponseEntity<Void> execute(@PathVariable("idStudent") String idStudent) {

        return ResponseEntity.noContent()
                             .build();
    }

}