package mx.com.axity.services.facade;

import mx.com.axity.commons.to.serviceorderTO;
import mx.com.axity.model.serviceorderDO;
import java.util.List;

public interface IserviceorderFacade {

	 serviceorderTO getserviceorderById(int id);
	   List<serviceorderTO> getAllserviceorder();
	   serviceorderDO Save (serviceorderDO so);
}
