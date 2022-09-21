package mx.com.axity.services.service;

import mx.com.axity.commons.to.serviceorderTO;
import mx.com.axity.model.serviceorderDO;
import java.util.List;

public interface Iserviceorder {
    
	serviceorderTO getserviceorderById (int id);
	   List<serviceorderTO> getAllserviceorder();
	   serviceorderDO save(serviceorderDO so);
}
