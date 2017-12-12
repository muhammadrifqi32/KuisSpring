/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1050.kuis1050.repo;
import com.kuis1050.kuis1050.entity.Cv_1050;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC35
 */
public interface Cv_1050Repo extends CrudRepository<Cv_1050, Long> {

        @Query("select c from Cv_1050 c")
    public List<Cv_1050> findAllCv_1050();
}
