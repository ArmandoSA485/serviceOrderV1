package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.serviceorderTO;
import mx.com.axity.model.serviceorderDO;
import mx.com.axity.persistence.serviceorderDAO;
import mx.com.axity.services.service.Iserviceorder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class serviceorderImpl implements Iserviceorder {

    static final Logger LOG = LogManager.getLogger(serviceorderImpl.class);
    
    @Autowired
    serviceorderDAO ServiceorderDAO;
    
    @Autowired
    ModelMapper modelMapper;

	@Override
	public serviceorderTO getserviceorderById(int id) {
		serviceorderDO ServiceOrderDO = this.ServiceorderDAO.findByIdserviceorder(id);
		Type DAOType = new TypeToken<serviceorderTO>() {}.getType();
		serviceorderTO serviceorderTO = this.modelMapper.map(ServiceOrderDO, DAOType);
		
		return serviceorderTO;
	}

	@Override
	public List<serviceorderTO> getAllserviceorder() {
		LOG.info("Consultando service orders");
        List<serviceorderDO> serviceorderDO =(List<serviceorderDO>) this.ServiceorderDAO.findAll();
        Type serviceorderDAOType = new TypeToken<List<serviceorderTO>>() {}.getType();
        List<serviceorderTO> serviceorderTO = this.modelMapper.map(serviceorderDO, serviceorderDAOType);
        LOG.info("Se retornan {} elementos", serviceorderTO.size());
        return serviceorderTO;
	}

	@Override
	public serviceorderDO save(serviceorderDO so) {
		return ServiceorderDAO.save(so);
	}

   
}
