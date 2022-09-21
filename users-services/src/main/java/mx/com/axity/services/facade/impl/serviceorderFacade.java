package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.serviceorderTO;
import mx.com.axity.model.serviceorderDO;
import mx.com.axity.services.facade.IserviceorderFacade;
import mx.com.axity.services.service.Iserviceorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class serviceorderFacade implements IserviceorderFacade {

    @Autowired
    private Iserviceorder serviceorder;

	@Override
	public serviceorderTO getserviceorderById(int id) {
		return this.serviceorder.getserviceorderById(id);
	}

	@Override
	public List<serviceorderTO> getAllserviceorder() {
		return this.serviceorder.getAllserviceorder();
	}

	@Override
	public serviceorderDO Save(serviceorderDO so) {
		return this.serviceorder.save(so);
	}

	
   
}
