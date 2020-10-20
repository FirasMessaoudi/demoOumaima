package com.gfi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.gfi.demo.modal.Offre;

@Repository
public interface IOffre extends JpaRepository<Offre, Integer>, JpaSpecificationExecutor<Offre> {


}
