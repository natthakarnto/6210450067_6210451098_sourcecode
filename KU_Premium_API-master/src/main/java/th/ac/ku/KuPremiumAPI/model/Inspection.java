package th.ac.ku.KuPremiumAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Inspection {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID track_No; //PK
    private String productName; //FK
    private String sent_Date;
    private String r_Name;
    private String r_Rank;
    private String note;
    private String status;

    public UUID getTrack_No() {
        return track_No;
    }

    public void setTrack_No(UUID track_No) {
        this.track_No = track_No;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSent_Date() {
        return sent_Date;
    }

    public void setSent_Date(String sent_Date) {
        this.sent_Date = sent_Date;
    }

    public String getR_Name() {
        return r_Name;
    }

    public void setR_Name(String r_Name) {
        this.r_Name = r_Name;
    }

    public String getR_Rank() {
        return r_Rank;
    }

    public void setR_Rank(String r_Rank) {
        this.r_Rank = r_Rank;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
