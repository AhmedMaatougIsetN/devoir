package com.ahmed.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.produits.entities.produit;

public interface ProduitRepository extends JpaRepository<produit, Long> {

}
