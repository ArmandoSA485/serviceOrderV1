package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.computerTO;
import mx.com.axity.commons.to.monitorTO;
import mx.com.axity.model.computerDO;
import mx.com.axity.model.monitorDO;
import mx.com.axity.persistence.computerDAO;
import mx.com.axity.persistence.monitorDAO;
import mx.com.axity.services.service.Icomputer;
import mx.com.axity.services.service.Imonitor;

import java.lang.reflect.Type;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class monitorimpl implements Imonitor {

	static final Logger LOG = LogManager.getLogger(monitorimpl.class);

    @Autowired
    monitorDAO MonitorDAO;
    
    @Autowired
    ModelMapper modelMapper;

	@Override
	public monitorTO getmonitorById(int id) {
		monitorDO monitorDO = this.MonitorDAO.findByIdmonitor(id);
		Type DAOType = new TypeToken<monitorTO>() {}.getType();
		monitorTO monitorTO = this.modelMapper.map(monitorDO, DAOType);
		
		return monitorTO;
	}

    

}
