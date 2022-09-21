package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.keyboardTO;
import mx.com.axity.services.facade.IkeyboardFacade;
import mx.com.axity.services.service.Ikeyboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class keyboardFacade implements IkeyboardFacade {

    @Autowired
    private Ikeyboard keyboard;

	@Override
	public keyboardTO getkeyboardById(int id) {
		return this.keyboard.getKeyboardById(id);
	}
    
    

   
}
