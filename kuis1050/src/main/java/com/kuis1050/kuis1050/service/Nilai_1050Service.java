/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1050.kuis1050.service;

import com.kuis1050.kuis1050.entity.Nilai_1050;
import com.kuis1050.kuis1050.repo.Nilai_1050Repo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PC35
 */
public class Nilai_1050Service {
    
    @Autowired
    private Nilai_1050Repo repo;

    public Nilai_1050 insertOrUpdate(Nilai_1050 nilai_1050) {
        return repo.save(nilai_1050);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Nilai_1050> findAll() {
        return repo.findAllNilai_1050();
    }

    public List<Nilai_1050> findByCv_1050(Long cv_1050Id) {
        return repo.findByCv_1050(cv_1050Id);
    }

    public List<Nilai_1050> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
