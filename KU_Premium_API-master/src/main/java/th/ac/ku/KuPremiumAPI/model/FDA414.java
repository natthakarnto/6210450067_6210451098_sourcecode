package th.ac.ku.KuPremiumAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class FDA414 {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID fda414ID;
    private String productName;
    private String r_name;
    private double lead_s;
    private double lead_c;
    private String lead_f;

    public UUID getFda414ID() {
        return fda414ID;
    }

    public void setFda414ID(UUID fda414ID) {
        this.fda414ID = fda414ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public double getLead_s() {
        return lead_s;
    }

    public void setLead_s(double lead_s) {
        this.lead_s = lead_s;
    }

    public double getLead_c() {
        return lead_c;
    }

    public void setLead_c(double lead_c) {
        this.lead_c = lead_c;
    }

    public String getLead_f() {
        return lead_f;
    }

    public void setLead_f(String lead_f) {
        this.lead_f = lead_f;
    }
}
