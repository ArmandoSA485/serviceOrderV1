package mx.com.axity.services.facade;

import java.util.List;
import mx.com.axity.commons.to.computerTO;
import mx.com.axity.model.computerDO;


public interface IcomputerFacade {

   computerTO getcomputerById(int id);
   List<computerTO> getAllcomputers();
   computerDO Save (computerDO comp);
}
