package com.crud.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String inputFname;
    private String inputLname;
    private String inputEmail ;
    private String inputPassword;
    private String inputAddress;
    private String inputAddress2;
    private String inputCity;
    private String inputZip;
    private String gridCheck;
    private String radioCheck;
    private String department;
    private String designation;
    private String role;
    private Boolean active = true;
    private Boolean deleted = false;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private Integer createdBy;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private Integer updatedBy;

    public void setId(Long id) {
    }


//    @PrePersist
//    public void prePersist() {
//        this.active = true;
//    }
}
