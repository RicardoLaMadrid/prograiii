package defensahito3.defensahito3.services;

import defensahito3.defensahito3.Model.CoronaModel;
import defensahito3.defensahito3.repo.CoronaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoronaService implements CoronaServiceInterface {
    @Autowired
    private CoronaRepo coronaRepo;

    @Override
    public CoronaModel save(CoronaModel cModel) {
        if (cModel.getEdad_paciente() >= 21 || cModel.getEdad_paciente() <=69 ) {
            cModel.setCategoria("ADULTO");
            String fullname = (cModel.getNombre_paciente() + " " + cModel.getApellidos_paciente());
            cModel.setFullname(fullname);
        } else if (cModel.getEdad_paciente() >= 11 && cModel.getEdad_paciente() <= 20 ) {
            cModel.setCategoria("ADOLECENTE");
            String fullname = (cModel.getNombre_paciente() + " " + cModel.getApellidos_paciente());
            cModel.setFullname(fullname);
        } else if (cModel.getEdad_paciente() <= 10) {
            cModel.setCategoria("NINO");
            String fullname = (cModel.getNombre_paciente() + " " + cModel.getApellidos_paciente());
            cModel.setFullname(fullname);

        }else if (cModel.getEdad_paciente() >= 70){
            return null;
        }
        else {
            cModel.setCategoria("ERROR");
        }
        return coronaRepo.save(cModel);
    }

    @Override
    public CoronaModel update(CoronaModel cModel, Integer id_corona_virus) {
        Optional<CoronaModel> corona = coronaRepo.findById(id_corona_virus);
        CoronaModel coronaUpdate = null;
        if (corona.isPresent()) {
            coronaUpdate = corona.get();
            coronaUpdate.setNombre_dep(cModel.getNombre_dep());
            coronaUpdate.setNombre_paciente(cModel.getNombre_paciente());
            coronaUpdate.setApellidos_paciente(cModel.getApellidos_paciente());
            coronaUpdate.setEdad_paciente(cModel.getEdad_paciente());
            if (cModel.getEdad_paciente() >= 21) {
                coronaUpdate.setCategoria("ADULTO");
            } else if (cModel.getEdad_paciente() >= 11 && cModel.getEdad_paciente() <= 20 ) {
                coronaUpdate.setCategoria("ADOLECENTE");
            } else if (cModel.getEdad_paciente() <= 10) {
                coronaUpdate.setCategoria("NINO");
            }
            coronaUpdate.setFullname(cModel.getNombre_paciente() + " " + cModel.getApellidos_paciente());
            coronaUpdate.setCasos_contagiados(cModel.getCasos_contagiados());
            coronaUpdate.setCasos_sospechosos(cModel.getCasos_sospechosos());
            coronaUpdate.setCasos_recuperados(cModel.getCasos_recuperados());
            coronaRepo.save(coronaUpdate);

        }

        return coronaUpdate;
    }
    @Override
    public Integer delete(CoronaModel cModel) {
        return 0;
    }

    @Override
    public List<CoronaModel> getAllPersons() {
        List<CoronaModel> corona = new ArrayList<CoronaModel>();
        coronaRepo.findAll().forEach(corona::add);

        return corona;
    }

    @Override
    public CoronaModel getPersonByIdPer(Integer id_corona_virus) {
        Optional<CoronaModel> corona = coronaRepo.findById(id_corona_virus);
        CoronaModel cModel = null;

        if (corona.isPresent()) {
            cModel = corona.get();
        }
        return cModel;
    }
}
