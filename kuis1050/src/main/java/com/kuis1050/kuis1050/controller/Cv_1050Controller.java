/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1050.kuis1050.controller;
import com.kuis1050.kuis1050.entity.Cv_1050;
import com.kuis1050.kuis1050.service.Cv_1050Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC35
 */
@RestController
@RequestMapping("/cv_1050")
public class Cv_1050Controller {
     @Autowired
    private Cv_1050Service cv_1050Service;

    @RequestMapping(method = RequestMethod.POST)
    public Cv_1050 insert(@RequestBody Cv_1050 cv_1050) {
        return cv_1050Service.insert(cv_1050);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Cv_1050 update(@RequestBody Cv_1050 cv_1050) {
        return cv_1050Service.update(cv_1050);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1050Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Cv_1050 getById(@PathVariable("id") Long id){
        return cv_1050Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Cv_1050> getAll(){
        return cv_1050Service.getAll();
    }

}
