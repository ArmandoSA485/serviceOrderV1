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
@Table(name = "serviceorder")
@NoArgsConstructor
@AllArgsConstructor
public class serviceorderDO implements Serializable{

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idserviceorder")
    private int idserviceorder;
    
    @Column(name = "idcomputer1")
    private int idcomputer1;
    
    @Column(name = "idcomputer2")
    private Integer idcomputer2;
    
    @Column(name = "idcomputer3")
    private Integer idcomputer3;
    
    @Column(name = "idcomputer4")
    private Integer idcomputer4;
    
    @Column(name = "idcomputer5")
    private Integer idcomputer5;
    
    
}
