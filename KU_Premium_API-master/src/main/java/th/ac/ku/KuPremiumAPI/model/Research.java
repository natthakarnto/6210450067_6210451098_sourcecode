package th.ac.ku.KuPremiumAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Research {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID relatedResearchID; //PK
    private String productName; //FK
    private String relatedResearchName;

    public UUID getRelatedResearchID() {
        return relatedResearchID;
    }

    public void setRelatedResearchID(UUID relatedResearchID) {
        this.relatedResearchID = relatedResearchID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRelatedResearchName() {
        return relatedResearchName;
    }

    public void setRelatedResearchName(String relatedResearchName) {
        this.relatedResearchName = relatedResearchName;
    }
}
