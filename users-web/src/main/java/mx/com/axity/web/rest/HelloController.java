package mx.com.axity.web.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mx.com.axity.commons.to.computerTO;
import mx.com.axity.commons.to.keyboardTO;
import mx.com.axity.commons.to.monitorTO;
import mx.com.axity.commons.to.mouseTO;
import mx.com.axity.commons.to.serviceorderTO;
import mx.com.axity.model.computerDO;
import mx.com.axity.model.serviceorderDO;
import mx.com.axity.services.facade.IcomputerFacade;
import mx.com.axity.services.facade.IkeyboardFacade;
import mx.com.axity.services.facade.ImonitorFacade;
import mx.com.axity.services.facade.ImouseFacade;
import mx.com.axity.services.service.Iserviceorder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("serviceorder/v1")
@Api(value="order")
public class HelloController {

    static final Logger LOG = LogManager.getLogger(HelloController.class);

    //Keyboard
    @Autowired 
    IkeyboardFacade keyboardFacade;
    
    @GetMapping(value = "/keyboard/{id}", produces = "application/json")
    @ApiOperation(value = "Buscar keyboards por id",
            notes = "Regresa un keyboard por id",
            response = keyboardTO.class,
            produces = "application/json")

    public ResponseEntity<keyboardTO> getkeyboardById(@PathVariable("id") int id) {
        keyboardTO keyboard = this.keyboardFacade.getkeyboardById(id);
        if (keyboard != null){
            return new ResponseEntity<>(keyboard, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(keyboard, HttpStatus.BAD_REQUEST);
        }
    }
    
    //Monitor
    @Autowired 
    ImonitorFacade monitorFacade;
    
    @GetMapping(value = "/monitor/{id}", produces = "application/json")
    @ApiOperation(value = "Buscar monitor por id",
            notes = "Regresa un monitor por id",
            response = monitorTO.class,
            produces = "application/json")

    public ResponseEntity<monitorTO> getmonitorById(@PathVariable("id") int id) {
    	monitorTO monitor = this.monitorFacade.getmonitorById(id);
        if (monitor!= null){
            return new ResponseEntity<>(monitor, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(monitor, HttpStatus.BAD_REQUEST);
        }
    }
    
  //Mouse
    @Autowired 
    ImouseFacade mouseFacade;
    
    @GetMapping(value = "/mouse/{id}", produces = "application/json")
    @ApiOperation(value = "Buscar mouse por id",
            notes = "Regresa un mouse por id",
            response = mouseTO.class,
            produces = "application/json")

    public ResponseEntity<mouseTO> getmouseById(@PathVariable("id") int id) {
    	mouseTO mouse = this.mouseFacade.getmouseById(id);
        if (mouse!= null){
            return new ResponseEntity<>(mouse, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(mouse, HttpStatus.BAD_REQUEST);
        }
    }
    
    //Computers
    @Autowired 
    IcomputerFacade computerFacade;
    
    @GetMapping(value = "/computer/{id}", produces = "application/json")
    @ApiOperation(value = "Buscar computer por id",
            notes = "Regresa un computer por id",
            response = computerTO.class,
            produces = "application/json")

    public ResponseEntity<computerTO> getcomputerById(@PathVariable("id") int id) {
    	computerTO computer = this.computerFacade.getcomputerById(id);
        if (computer!= null){
            return new ResponseEntity<>(computer, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(computer, HttpStatus.BAD_REQUEST);
        }
    }
    
    @GetMapping(value = "/computers", produces = "application/json")
    @ApiOperation(value = "Buscar computers",
            notes = "Retorna todas las computadoras",
            response = computerTO.class,
            produces = "application/json")
            
    public ResponseEntity<List<computerTO>> getAllcomputers() {
        List<computerTO> computers = this.computerFacade.getAllcomputers();
        return new ResponseEntity<>(computers, HttpStatus.OK);
    }
    
    @PostMapping(value = "/create_computers/", produces = "application/json")
    @ApiOperation(value = "Crea computers",
    notes = "Retorna la computadora insertada",
    response = computerTO.class,
    produces = "application/json")
    public ResponseEntity<?> create (@RequestBody computerDO comp){
		return ResponseEntity.status(HttpStatus.CREATED).body(computerFacade.Save(comp));
    	
    }
    
  //Service Orders
    @Autowired 
    Iserviceorder serviceorder;
    
    @GetMapping(value = "/service_order/{id}", produces = "application/json")
    @ApiOperation(value = "Buscar orden de servicio por id",
            notes = "Regresa una orden por id",
            response = serviceorderTO.class,
            produces = "application/json")

    public ResponseEntity<serviceorderTO> getserviceorderById(@PathVariable("id") int id) {
    	serviceorderTO serviceorder = this.serviceorder.getserviceorderById(id);
        if (serviceorder!= null){
            return new ResponseEntity<>(serviceorder, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(serviceorder, HttpStatus.BAD_REQUEST);
        }
    }
    
    @GetMapping(value = "/service_orders", produces = "application/json")
    @ApiOperation(value = "Buscar ordenes de servicio",
            notes = "Retorna todas las ordenes de servicio",
            response = serviceorderTO.class,
            produces = "application/json")
            
    public ResponseEntity<List<serviceorderTO>> getAllserviceorder() {
        List<serviceorderTO> serviceorder = this.serviceorder.getAllserviceorder();
        return new ResponseEntity<>(serviceorder, HttpStatus.OK);
    }
    
    @PostMapping(value = "/create_service_order/", produces = "application/json")
    @ApiOperation(value = "Crea ordenes de servicio",
    notes = "Retorna la orden insertada",
    response = serviceorderTO.class,
    produces = "application/json")
    public ResponseEntity<?> create (@RequestBody serviceorderDO so){
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceorder.save(so));
    	
    }
}
