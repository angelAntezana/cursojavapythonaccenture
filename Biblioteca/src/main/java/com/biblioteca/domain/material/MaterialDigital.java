package com.biblioteca.domain.material;

import com.biblioteca.util.LoggerUtil;

public final class MaterialDigital extends MaterialBiblioteca{

    static final String URL_BASE_MATERIALES_DIGITALES = "https://test?resource_id=";
    private TipoMaterialDigital tipoMaterialDigital;
    private LoggerUtil log = new LoggerUtil();

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
        log.info("OBTENIENDO RECURSO A TRAVÉS DEL ENLACE: " + URL_BASE_MATERIALES_DIGITALES + this.getIdentificador());
    }


}
