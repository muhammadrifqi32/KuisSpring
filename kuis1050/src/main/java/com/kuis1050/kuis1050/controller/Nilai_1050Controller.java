/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1050.kuis1050.controller;
import com.kuis1050.kuis1050.entity.Nilai_1050;
import com.kuis1050.kuis1050.service.Nilai_1050Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC35
 */
@RestController
@RequestMapping("/Nilai_1050")
public class Nilai_1050Controller {
    @Autowired
    private Nilai_1050Service nilai_1050Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public Nilai_1050 insertOrUpdate(@RequestBody Nilai_1050 nilai_1050){
        return nilai_1050Service.insertOrUpdate(nilai_1050);
    }
}
