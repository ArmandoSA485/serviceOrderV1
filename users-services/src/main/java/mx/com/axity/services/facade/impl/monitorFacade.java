package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.monitorTO;
import mx.com.axity.services.facade.ImonitorFacade;
import mx.com.axity.services.service.Imonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class monitorFacade implements ImonitorFacade {

    @Autowired
    private Imonitor monitor;

	@Override
	public monitorTO getmonitorById(int id) {
		return this.monitor.getmonitorById(id);
	}
    
    

   
}
