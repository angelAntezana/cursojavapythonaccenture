package com.biblioteca.domain.material;

public abstract sealed class MaterialBiblioteca implements Comparable<MaterialBiblioteca> permits
        MaterialDigital, MaterialFisico {

    private Long identificador;

    protected MaterialBiblioteca(Long identificador) {
        this.identificador = identificador;
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{ " +
                "identificador: " +
                getIdentificador() +
                " }";
    }

    @Override
    public int compareTo(MaterialBiblioteca o) {
        if (this.getIdentificador() > o.getIdentificador()) {
            return 1;
        } else if (this.getIdentificador() < o.getIdentificador()) {
            return -1;
        } else {
            return 0;
        }
    }

}
