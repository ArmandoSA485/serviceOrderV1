package mx.com.axity.services.service;

import java.util.List;

import mx.com.axity.commons.to.computerTO;
import mx.com.axity.model.computerDO;

public interface Icomputer {
    
   computerTO getComputerById (int id);
   List<computerTO> getAllComputers();
   computerDO save(computerDO comp);
}
