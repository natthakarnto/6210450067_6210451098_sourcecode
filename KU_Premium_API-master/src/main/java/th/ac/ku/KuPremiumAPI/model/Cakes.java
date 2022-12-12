package th.ac.ku.KuPremiumAPI.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.beans.Transient;
import java.util.UUID;

@Entity
public class Cakes {
    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")

    private UUID pID;
    private String productName;
    private String username;
    private String productCategory;
    private double price;
    private String poID;
    private String productDescription;
    private String productAttrib;
    private String productUsageGuideline;
    private String productIngredients;

    private String productNutrition;

    private String productUseIndication;
    private int productQuantity;
    private String productSize;
    private String productVolume;
    private String productWeight;

    private String productPromotion;

    private double productDiscountPercent;

    private double priceExcludingVat;

    private double pricePromotion;

//    private String pcID;
//
//    private String prr_ID;
//
//    private String psvID;
//
//    private String ftvID;
//
//    private String aID;
//
//    private String rreID;

//    @Column(nullable = true, length = 128)
//    private String photos;

    public UUID getpID() {
        return pID;
    }

    public void setpID(UUID pID) {
        this.pID = pID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPoID() {
        return poID;
    }

    public void setPoID(String poID) {
        this.poID = poID;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductAttrib() {
        return productAttrib;
    }

    public void setProductAttrib(String productAttrib) {
        this.productAttrib = productAttrib;
    }

    public String getProductUsageGuideline() {
        return productUsageGuideline;
    }

    public void setProductUsageGuideline(String productUsageGuideline) {
        this.productUsageGuideline = productUsageGuideline;
    }

    public String getProductIngredients() {
        return productIngredients;
    }

    public void setProductIngredients(String productIngredients) {
        this.productIngredients = productIngredients;
    }

    public String getProductNutrition() {
        return productNutrition;
    }

    public void setProductNutrition(String productNutrition) {
        this.productNutrition = productNutrition;
    }

    public String getProductUseIndication() {
        return productUseIndication;
    }

    public void setProductUseIndication(String productUseIndication) {
        this.productUseIndication = productUseIndication;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductVolume() {
        return productVolume;
    }

    public void setProductVolume(String productVolume) {
        this.productVolume = productVolume;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductPromotion() {
        return productPromotion;
    }

    public void setProductPromotion(String productPromotion) {
        this.productPromotion = productPromotion;
    }

    public double getProductDiscountPercent() {
        return productDiscountPercent;
    }

    public void setProductDiscountPercent(double productDiscountPercent) {
        this.productDiscountPercent = productDiscountPercent;
    }

    public double getPriceExcludingVat() {
        return priceExcludingVat;
    }

    public void setPriceExcludingVat(double priceExcludingVat) {
        this.priceExcludingVat = priceExcludingVat;
    }

    public double getPricePromotion() {
        return pricePromotion;
    }

    public void setPricePromotion(double pricePromotion) {
        this.pricePromotion = pricePromotion;
    }

//    public String getPcID() {
//        return pcID;
//    }
//
//    public void setPcID(String pcID) {
//        this.pcID = pcID;
//    }
//
//    public String getPrr_ID() {
//        return prr_ID;
//    }
//
//    public void setPrr_ID(String prr_ID) {
//        this.prr_ID = prr_ID;
//    }
//
//    public String getPsvID() {
//        return psvID;
//    }
//
//    public void setPsvID(String psvID) {
//        this.psvID = psvID;
//    }
//
//    public String getFtvID() {
//        return ftvID;
//    }
//
//    public void setFtvID(String ftvID) {
//        this.ftvID = ftvID;
//    }
//
//    public String getaID() {
//        return aID;
//    }
//
//    public void setaID(String aID) {
//        this.aID = aID;
//    }
//
//    public String getRreID() {
//        return rreID;
//    }
//
//    public void setRreID(String rreID) {
//        this.rreID = rreID;
//    }

}
