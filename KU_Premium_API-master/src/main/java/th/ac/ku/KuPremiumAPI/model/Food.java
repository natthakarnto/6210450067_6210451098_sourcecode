package th.ac.ku.KuPremiumAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Food {
    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID prodFoodID; //PK
    private String productName; //FK
    private String prodFoodName;

    public UUID getProdFoodID() {
        return prodFoodID;
    }

    public void setProdFoodID(UUID prodFoodID) {
        this.prodFoodID = prodFoodID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdFoodName() {
        return prodFoodName;
    }

    public void setProdFoodName(String prodFoodName) {
        this.prodFoodName = prodFoodName;
    }
}
