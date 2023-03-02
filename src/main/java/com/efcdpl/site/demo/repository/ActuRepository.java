package com.efcdpl.site.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efcdpl.site.demo.model.Actu;

@Repository
public interface ActuRepository extends JpaRepository<Actu, Integer>{
}
