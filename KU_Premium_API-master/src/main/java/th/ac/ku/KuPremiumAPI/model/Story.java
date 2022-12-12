package th.ac.ku.KuPremiumAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Story {
    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID prodStoryID; //PK
    private String productName; //FK
    private String prodStoryName;

    public UUID getProdStoryID() {
        return prodStoryID;
    }

    public void setProdStoryID(UUID prodStoryID) {
        this.prodStoryID = prodStoryID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdStoryName() {
        return prodStoryName;
    }

    public void setProdStoryName(String prodStoryName) {
        this.prodStoryName = prodStoryName;
    }
}
