/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1050.kuis1050.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC35
 */
@Entity
@Table(name = "Nilai_1050")
public class Nilai_1050 {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String Subject_name;
    private double Score;
    @Column(length = 255, nullable = true)
    private String description;
    @ManyToOne
    private Cv_1050 Cv_1050;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getSubject_name() {
        return Subject_name;
    }

    /**
     * @param name the name to set
     */
    public void setSubject_name(String subject_name) {
        this.Subject_name = subject_name;
    }

    /**
     * @return the price
     */
    public double getScore() {
        return Score;
    }

    /**
     * @param price the price to set
     */
    public void setScore(double score) {
        this.Score = score;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the category
     */
    public Cv_1050 getCv_1050() {
        return Cv_1050;
    }

    /**
     * @param category the category to set
     */
    public void setCv_1050(Cv_1050 cv_1050) {
        this.Cv_1050 = cv_1050;
    }
}
