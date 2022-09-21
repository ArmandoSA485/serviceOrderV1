package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.computerTO;
import mx.com.axity.model.computerDO;
import mx.com.axity.persistence.computerDAO;
import mx.com.axity.services.service.Icomputer;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class computerimlp implements Icomputer {

	static final Logger LOG = LogManager.getLogger(computerimlp.class);

    @Autowired
    computerDAO ComputerDAO;
    
    @Autowired
    ModelMapper modelMapper;
    
	@Override
	public computerTO getComputerById(int id) {
		computerDO computerDO = this.ComputerDAO.findByIdcomputer(id);
		Type DAOType = new TypeToken<computerTO>() {}.getType();
		computerTO computerTO = this.modelMapper.map(computerDO, DAOType);
		
		return computerTO;
	}

	@Override
	public List<computerTO> getAllComputers() {
		LOG.info("Consultando computers");
        List<computerDO> computersDO =(List<computerDO>) this.ComputerDAO.findAll();
        Type computerDAOType = new TypeToken<List<computerTO>>() {}.getType();
        List<computerTO> ComputerTO = this.modelMapper.map(computersDO, computerDAOType);
        LOG.info("Se retornan {} elementos", ComputerTO.size());
        return ComputerTO;
	}

	@Override
	public computerDO save(computerDO comp) {
		return ComputerDAO.save(comp);
	}


}
