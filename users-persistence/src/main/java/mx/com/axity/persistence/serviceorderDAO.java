package mx.com.axity.persistence;

import mx.com.axity.model.serviceorderDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface serviceorderDAO extends CrudRepository<serviceorderDO, Long> {

    List<serviceorderDO> findAll();
    serviceorderDO findByIdserviceorder (int id);
    
    
    
    
}
