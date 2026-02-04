package com.biblioteca.domain.material;

public final class MaterialDigital extends MaterialBiblioteca{

    static final String URL_BASE_MATERIALES_DIGITALES = "https://test?resource_id=";
    private TipoMaterialDigital tipoMaterialDigital;

    public MaterialDigital(long identificador, TipoMaterialDigital tipoMaterialDigital) {
        super(identificador);
        this.tipoMaterialDigital = tipoMaterialDigital;
    }

    public TipoMaterialDigital getTipoMaterialDigital() {
        return tipoMaterialDigital;
    }

    public void setTipoMaterialDigital(TipoMaterialDigital tipoMaterialDigital) {
        this.tipoMaterialDigital = tipoMaterialDigital;
    }

    public void getResource() {
        IO.println("OBTENIENDO RECURSO A TRAVÉS DEL ENLACE: " + URL_BASE_MATERIALES_DIGITALES + this.getIdentificador());
    }



}
