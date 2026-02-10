package com.sinensia.biblioteca.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.biblioteca.infrastructure.persistence.entity.LibroEntity;

@Repository
public interface LibroJpaRepository extends JpaRepository<LibroEntity, Long>{
    
}
