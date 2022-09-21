package mx.com.axity.commons.to;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class computerTO implements Serializable {

    private static final long serialVersionUID = 1L;
	private int idcomputer;
    private String brand;
    private String model;
    private String serial_number;
    private int idmonitor;
    private int idmouse;
    private int idkeyboard;
    private monitorTO monitor;
    private mouseTO mouse;
    private keyboardTO keyboard;
}
