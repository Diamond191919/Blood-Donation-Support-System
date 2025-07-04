package com.gtwo.bdss_system.entity.commons;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Blood_Type")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BloodType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Type")
    private String type;
    @Column(name = "Rh_Factor")
    private String rhFactor;
}
