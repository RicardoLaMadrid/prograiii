package coronavaitus.coronavairus.Services;

import coronavaitus.coronavairus.Model.CoronaModel;
import coronavaitus.coronavairus.repo.CoronaRepo;
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
        return coronaRepo.save(cModel);
    }

    @Override
    public CoronaModel update(CoronaModel cModel, Integer id_corona_virus) {
        Optional<CoronaModel> corona = coronaRepo.findById(id_corona_virus);
        CoronaModel coronaUpdate = null;

        if (corona.isPresent()) {
            coronaUpdate = corona.get();
            coronaUpdate.setNombre_dep(cModel.getNombre_dep());
            coronaUpdate.setCasos_contagiados(cModel.getCasos_contagiados());
            coronaUpdate.setCasos_sospechosos(cModel.getCasos_sospechosos());
            coronaUpdate.setCasos_recuperados(cModel.getCasos_recuperados());
            coronaRepo.save(coronaUpdate);
        }
        return coronaUpdate;
    }

    @Override
    public List<CoronaModel> delete {
        coronaRepo.deleteById(id_corona_virus);
        return 1;
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
