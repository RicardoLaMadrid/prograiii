package coronavaitus.coronavairus.repo;

import coronavaitus.coronavairus.Model.CoronaModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CoronaRepo extends JpaRepository<CoronaModel, Integer> {
}
