package com.biblioteca.domain.material;

public abstract sealed class MaterialBiblioteca permits
MaterialDigital, MaterialFisico {

    private long identificador;

    protected MaterialBiblioteca(long identificador) {
        this.identificador = identificador;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }
    
    
}
