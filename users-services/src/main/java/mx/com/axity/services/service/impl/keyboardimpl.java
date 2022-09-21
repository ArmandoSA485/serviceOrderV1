package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.keyboardTO;
import mx.com.axity.model.keyboardDO;
import mx.com.axity.persistence.keyboardDAO;
import mx.com.axity.services.service.Ikeyboard;

import java.lang.reflect.Type;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class keyboardimpl implements Ikeyboard {

	static final Logger LOG = LogManager.getLogger(keyboardimpl.class);

    @Autowired
    keyboardDAO KeyBoardDAO;
    
    @Autowired
    ModelMapper modelMapper;
    
	@Override
	public keyboardTO getKeyboardById(int id) {
		//LOG.info(message:"Consultando Keyboard");
		keyboardDO KeyBoardDO = this.KeyBoardDAO.findByIdkeyboard(id);
		Type DAOType = new TypeToken<keyboardTO>() {}.getType();
		keyboardTO KeyBoardTO = this.modelMapper.map(KeyBoardDO, DAOType);
		
		return KeyBoardTO;
	}

    

}
