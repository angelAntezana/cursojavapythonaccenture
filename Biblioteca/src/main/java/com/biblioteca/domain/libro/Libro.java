package com.biblioteca.domain.libro;

import java.util.List;
import java.util.Objects;

import com.biblioteca.domain.material.MaterialBiblioteca;
import com.biblioteca.domain.obra.TipoObra;

public class Libro {

    private String titulo;
    private String editorial;
    private int numeroPaginas;
    private String autor;
    private int stock;
    private TipoObra tipoObra;
    private List<MaterialBiblioteca> listMaterialBibliotecas;


    public Libro(String titulo, String editorial, int numeroPaginas, String autor, int stock,
        TipoObra tipoObra
    ) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.stock = stock;
        this.tipoObra = tipoObra;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

        public TipoObra getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(TipoObra tipoObra) {
        this.tipoObra = tipoObra;
    }
    
    public List<MaterialBiblioteca> getListMaterialBibliotecas() {
        return listMaterialBibliotecas;
    }

    public void setListMaterialBibliotecas(List<MaterialBiblioteca> listMaterialBibliotecas) {
        this.listMaterialBibliotecas = listMaterialBibliotecas;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) obj;
        return Objects.equals(titulo, libro.titulo)
        && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
    
}