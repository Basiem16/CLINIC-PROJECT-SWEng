package il.cshaifasweng.OCSFMediatorExample.entities;


import javax.persistence.*;
import java.security.NoSuchAlgorithmException;

@Entity
@Table(name = "manager_entity")
public class ManagerEntity extends UserEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private int manager_id;


    @OneToOne
    @JoinColumn(name = "clinic_id")
    private  ClinicEntity clinic;

    public ManagerEntity(int id, String first_name, String family_name, String mail, String Password, ClinicEntity clinic) throws NoSuchAlgorithmException {
        super(id, first_name, family_name, mail, Password);
        //this.manager_id = manager_id;
        setClinic(clinic);
    }

    public ManagerEntity() {
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public ClinicEntity getClinic() {
        return clinic;
    }

    public void setClinic(ClinicEntity clinic) {
        this.clinic = clinic;
        clinic.updateManager(this);
    }
}
