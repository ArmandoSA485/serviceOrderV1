package mx.com.axity.commons.to;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class serviceorderTO implements Serializable {

    private static final long serialVersionUID = 1L;
	private int idserviceorder;
    private int idcomputer1;
    private Integer idcomputer2;
    private Integer idcomputer3;
    private Integer idcomputer4;
    private Integer idcomputer5;
}
