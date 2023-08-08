package com.earlybird.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Entity;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "user")

public class User implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name="contactNumber")
    private String contactNumber;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="status")
    private String status;

    @Column(name="role")
    private String role;

    public User(Integer id) {
        this.id=id;
    }
    public User(String name, String contactNumber, String email, String password, String status, String role) {
        this.name=name;
        this.contactNumber=contactNumber;
        this.email=email;
        this.password=password;
        this.status=status;
        this.role=role;
    }

    public void setId(Integer id) {
        this.id=id;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber=contactNumber;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public String getStatus(){
        return status;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }
}