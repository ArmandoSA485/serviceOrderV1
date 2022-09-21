package mx.com.axity.commons.to;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class mouseTO implements Serializable {

    private static final long serialVersionUID = 1L;
	private int idmouse;
    private String brand;
    private String model;
    private String serial_number;
}
