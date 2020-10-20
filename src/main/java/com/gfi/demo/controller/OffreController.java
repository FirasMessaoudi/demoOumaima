package com.gfi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfi.demo.modal.Offre;
import com.gfi.demo.repository.IOffre;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class OffreController {
	

        @Autowired
	    private  IOffre offreRepository;
        
        
        @GetMapping("/offres")
        public List<Offre> getAlloffres() {
        	return offreRepository.findAll();
        
        }

     
        
        @PostMapping("/offres")
        public void ajouterOffre(@RequestBody Offre offre) {
        	offreRepository.save(offre);
   
        
        }

}
