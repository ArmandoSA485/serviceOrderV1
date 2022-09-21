package mx.com.axity.persistence;


import mx.com.axity.model.computerDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface computerDAO extends CrudRepository<computerDO, Long> {

	computerDO findByIdcomputer (int id);

}
