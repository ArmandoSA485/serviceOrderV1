package mx.com.axity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "computer", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class computerDO implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomputer")
    private int idcomputer;
    
    @Column(name = "brand")
    private String brand;
    
    @Column(name = "model")
    private String model;
    
    @Column(name = "serial_number")
    private String serial_number;
    
    @Column(name = "idmonitor")
    private int idmonitor;
    
    @Column(name = "idmouse")
    private int idmouse;
    
    @Column(name = "idkeyboard")
    private int idkeyboard;
}
