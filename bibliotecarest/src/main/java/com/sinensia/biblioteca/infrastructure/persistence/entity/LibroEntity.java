package com.sinensia.biblioteca.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libros")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LibroEntity {
    
    @Id
    @GeneratedValue
    private Long idLibro;

    private String nombre;

}
