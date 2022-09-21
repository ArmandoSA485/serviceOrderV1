package mx.com.axity.persistence;


import mx.com.axity.model.monitorDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface monitorDAO extends JpaRepository<monitorDO, Long> {

    monitorDO findByIdmonitor (int id);

}
