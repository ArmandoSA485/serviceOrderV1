package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.mouseTO;
import mx.com.axity.model.mouseDO;
import mx.com.axity.persistence.mouseDAO;
import mx.com.axity.services.service.Imouse;
import java.lang.reflect.Type;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mouseimpl implements Imouse {

	static final Logger LOG = LogManager.getLogger(mouseimpl.class);

    @Autowired
    mouseDAO MouseDAO;
    
    @Autowired
    ModelMapper modelMapper;
    
	@Override
	public mouseTO getmouseById(int id) {
		mouseDO MouseDO = this.MouseDAO.findByIdmouse(id);
		Type DAOType = new TypeToken<mouseTO>() {}.getType();
		mouseTO MouseTO = this.modelMapper.map(MouseDO, DAOType);
		
		return MouseTO;
	}

    

}
