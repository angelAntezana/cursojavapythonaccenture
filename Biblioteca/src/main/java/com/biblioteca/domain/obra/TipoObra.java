package com.biblioteca.domain.obra;

public enum TipoObra {
    NOVELA("Novela"),
    ENCICLOPEDIA("Enciclopedia"),
    TRATADO("Tratado"),
    CUENTO_INFANTIL("Cuento infantil");

    
    private String tipo;
    
    private TipoObra(String tipo) {
        this.tipo = tipo;
    }
    public String getTipoObra() {
        return tipo;
    }
}
