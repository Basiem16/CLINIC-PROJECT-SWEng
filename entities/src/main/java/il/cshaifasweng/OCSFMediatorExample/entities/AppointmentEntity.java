package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class AppointmentEntity implements Serializable {
    @Id
    private int id;
    private LocalDateTime date; // date of appointment
    private LocalDateTime time; // time of appointment
    private boolean reserved = false;
    private int timeDuration;
    @ManyToOne
    @JoinColumn(name = "clinic_id")
    private ClinicEntity clinic;
    @ManyToOne
    @JoinColumn(name = "patient_patient_id")
    private PatientEntity patient;
    @ManyToOne
    @JoinColumn(name = "doctor_doctor_id")
    private DoctorEntity doctor;

    public AppointmentEntity() {
    }

    public AppointmentEntity(LocalDateTime date, LocalDateTime time, boolean reserved, int timeDuration, ClinicEntity clinic, PatientEntity patient, DoctorEntity doctor) {
        this.date = date;
        this.time = time;
        this.reserved = reserved;
        this.timeDuration = timeDuration;
        this.clinic = clinic;
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorEntity doctor) {
        this.doctor = doctor;
    }


    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public ClinicEntity getClinic() {
        return clinic;
    }

    public void setClinic(ClinicEntity clinic) {
        this.clinic = clinic;
    }
}