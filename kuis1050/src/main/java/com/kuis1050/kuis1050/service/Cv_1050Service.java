/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1050.kuis1050.service;
import com.kuis1050.kuis1050.entity.Cv_1050;
import com.kuis1050.kuis1050.repo.Cv_1050Repo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PC35
 */
@Service("cv_1050Service")
@Transactional
public class Cv_1050Service {
    @Autowired
    private Cv_1050Repo repo;

    public Cv_1050 insert(Cv_1050 cv_1050) {
        return repo.save(cv_1050);
    }
    
    public Cv_1050 update(Cv_1050 cv_1050) {
        return repo.save(cv_1050);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Cv_1050 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Cv_1050> getAll(){
        return repo.findAllCv_1050();
    }
}
