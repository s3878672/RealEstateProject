package com.example.ead_demo.real_estate;

import jakarta.persistence.*;

@Entity
@Table
public class RealEstate {
    @Id
    @SequenceGenerator(
            name = "real_estate_sequence",
            sequenceName = "real_estate_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "real_estate_sequence"
    )
    private Integer id;

    private String title;
    private String address;
    private Integer area;
    private Integer price;
    private Integer district;
    private Integer floors;
    private String features;
    private Integer contact_number;
    private String contact_name;
    @Transient
    private String image;

    public RealEstate(Integer id, String address, Integer area, Integer price, String title, Integer district, Integer floors, String features, Integer contact_number, String contact_name) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.area = area;
        this.price = price;
        this.district = district;
        this.floors = floors;
        this.features = features;
        this.contact_number = contact_number;
        this.contact_name = contact_name;
        this.image = "image_" + id; //implement auto generate image path
    }

    public RealEstate(String address, Integer area, Integer price, String title, Integer district, Integer floors, String features, Integer contact_number, String contact_name) {
        this.title = title;
        this.address = address;
        this.area = area;
        this.price = price;
        this.district = district;
        this.floors = floors;
        this.features = features;
        this.contact_number = contact_number;
        this.contact_name = contact_name;
    }

    public RealEstate() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public Integer getContact_number() {
        return contact_number;
    }

    public void setContact_number(Integer contact_number) {
        this.contact_number = contact_number;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", district=" + district +
                ", floors=" + floors +
                ", features='" + features + '\'' +
                ", contact_number=" + contact_number +
                ", contact_name='" + contact_name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}