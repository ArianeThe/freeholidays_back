package com.FreeHolidays.Back.Entities;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name="Hébergements")
public class Hebergement implements Serializable{
    

    @Id
    @Transient
    @Column(name="id_auto")
    @GeneratedValue
    private int id_auto;

    @Column(name="Nom")
    private String Nom;

    @Column(name="Adresse")
    private String Adresse;

    @Column(name="Description")
    private String Description;

    @Column(name="Type")
    private String Type;

    @Column(name="Prix")
    private int Prix;

    @Column(name="Capacité")
    private int Capacite;

}
