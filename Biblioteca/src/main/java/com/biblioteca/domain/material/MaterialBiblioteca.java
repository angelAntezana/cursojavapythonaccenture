package com.biblioteca.domain.material;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaterialBiblioteca)) {
            return false;
        }
        MaterialBiblioteca materialBiblioteca = (MaterialBiblioteca) obj;
        return Objects.equals(identificador, materialBiblioteca.identificador);

    }
    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

}
