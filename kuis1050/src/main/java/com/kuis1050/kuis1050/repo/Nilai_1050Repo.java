/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1050.kuis1050.repo;
import com.kuis1050.kuis1050.entity.Nilai_1050;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC35
 */
public interface Nilai_1050Repo extends CrudRepository<Nilai_1050, Long> {
    @Query("select p from Nilai_1050 p")
    public List<Nilai_1050> findAllNilai_1050();
    
    @Query("select p from Nilai_1050 p where p.Nilai_1050.id= :id")
    public List<Nilai_1050> findByCv_1050(@Param("id") Long id);
    
    @Query("select p from Nilai_1050 p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Nilai_1050> findByName(@Param("name") String name);
    
}
