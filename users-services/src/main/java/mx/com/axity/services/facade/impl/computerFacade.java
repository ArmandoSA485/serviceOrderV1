package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.computerTO;
import mx.com.axity.model.computerDO;
import mx.com.axity.services.facade.IcomputerFacade;
import mx.com.axity.services.service.Icomputer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class computerFacade implements IcomputerFacade {

    @Autowired
    private Icomputer Computer;


	@Override
	public computerTO getcomputerById(int id) {
		return this.Computer.getComputerById(id);
	}


	@Override
	public List<computerTO> getAllcomputers() {
		return this.Computer.getAllComputers();
	}


	@Override
	public computerDO Save(computerDO comp) {
		return this.Computer.save(comp);
	}
    
   
}
