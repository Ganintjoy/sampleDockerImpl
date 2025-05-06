package com.example.sampleDockerImpl.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "S001_103025")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class S001103025 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "S103025_0001")
    private Long	      s1030250001;
    @Column(name = "S103025_0002")
    private Long	      s1030250002;
    @Column(name = "S103025_0813")
    private String          s1030250813;
    @Column(name = "S103025_0814")
    private String	      s1030250814;
    @Column(name = "S101000_0001")
    private Long	      s1010000001;
}
