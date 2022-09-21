package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.mouseTO;
import mx.com.axity.services.facade.ImouseFacade;
import mx.com.axity.services.service.Imouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class mouseFacade implements ImouseFacade {

    @Autowired
    private Imouse Mouse;

	@Override
	public mouseTO getmouseById(int id) {
		return this.Mouse.getmouseById(id);
	}
    
    

   
}
