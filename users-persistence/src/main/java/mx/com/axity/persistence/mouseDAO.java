package mx.com.axity.persistence;


import mx.com.axity.model.mouseDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface mouseDAO extends JpaRepository<mouseDO, Long> {

	mouseDO findByIdmouse (int id);

}
