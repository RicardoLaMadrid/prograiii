package coronavaitus.coronavairus.Controller;

import coronavaitus.coronavairus.Model.CoronaModel;
import coronavaitus.coronavairus.Services.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/v1/")
public class UserControllerCorona {

    @Autowired
    private CoronaService coronaService;


    @PostMapping("/corona")
    public ResponseEntity save(@RequestBody CoronaModel corona) {
        try {
            return new ResponseEntity<>(coronaService.save(corona), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }


    @DeleteMapping("/corona/delete/{id_corona_virus}")
    public ResponseEntity<String> delete(@PathVariable("id_corona_virus") Integer id_corona_virus) {
        try {
            coronaService.delete(id_corona_virus);
            return new ResponseEntity<>("person successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/corona/{id_corona_virus}")
    public ResponseEntity<CoronaModel> updateMaterias(@PathVariable("id_corona_virus") Integer id_corona_virus, @RequestBody CoronaModel cModel) {
        try {
            CoronaModel pUpdate = coronaService.update(cModel, id_corona_virus);
            if (pUpdate != null) {
                return new ResponseEntity<>(pUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/corona/")
    public ResponseEntity<List<CoronaModel>> getAllPersons() {
        try {
            List<CoronaModel> corona = coronaService.getAllPersons();

            if (corona.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(corona, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/corona/getOne/{id_corona_virus}")
    public ResponseEntity<CoronaModel> getPersonByIdPer(@PathVariable("id_corona_virus") Integer id_corona_virus) {
        try {
            CoronaModel pModel = coronaService.getPersonByIdPer(id_corona_virus);

            if (pModel != null) {
                return new ResponseEntity<>(pModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}