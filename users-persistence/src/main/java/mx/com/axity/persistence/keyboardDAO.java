package mx.com.axity.persistence;

import mx.com.axity.model.keyboardDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface keyboardDAO extends JpaRepository<keyboardDO, Long> {

    keyboardDO findByIdkeyboard (int id);

}
