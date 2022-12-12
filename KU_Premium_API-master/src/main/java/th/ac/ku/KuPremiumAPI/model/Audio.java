package th.ac.ku.KuPremiumAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Audio {
    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID prodAudioID; //PK
    private String productName; //FK
    private String prodAudioName;

    public UUID getProdAudioID() {
        return prodAudioID;
    }

    public void setProdAudioID(UUID prodAudioID) {
        this.prodAudioID = prodAudioID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdAudioName() {
        return prodAudioName;
    }

    public void setProdAudioName(String prodAudioName) {
        this.prodAudioName = prodAudioName;
    }
}
