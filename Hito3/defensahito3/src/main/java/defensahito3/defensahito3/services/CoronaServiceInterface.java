package defensahito3.defensahito3.services;

import defensahito3.defensahito3.Model.CoronaModel;

import java.util.List;

public interface CoronaServiceInterface {

    public CoronaModel save(CoronaModel cModel);

    public CoronaModel update(CoronaModel cModel, Integer id_corona_virus);
    public Integer delete(CoronaModel cModel);
    public List<CoronaModel> getAllPersons();
    public CoronaModel getPersonByIdPer(Integer id_corona_virus);

}
