package coronavaitus.coronavairus.Services;

import coronavaitus.coronavairus.Model.CoronaModel;

import java.util.List;

public interface CoronaServiceInterface {

    public CoronaModel save(CoronaModel cModel);
    public CoronaModel update(CoronaModel cModel, Integer id_corona_virus);
    public Integer delete(Integer id_corona_virus);
    public List<CoronaModel> getAllPersons();
    public CoronaModel getPersonByIdPer(Integer id_corona_virus);

}
