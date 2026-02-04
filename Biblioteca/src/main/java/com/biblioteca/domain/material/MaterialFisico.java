package com.biblioteca.domain.material;

public final class MaterialFisico extends MaterialBiblioteca{

    private TipoMaterialFisico tipoMaterialFisico;

    public MaterialFisico(long identificador, TipoMaterialFisico tipoMaterialFisico) {
        super(identificador);
        this.tipoMaterialFisico = tipoMaterialFisico;
    }

    public TipoMaterialFisico getTipoMaterialFisico() {
        return tipoMaterialFisico;
    }

    public void setTipoMaterialFisico(TipoMaterialFisico tipoMaterialFisico) {
        this.tipoMaterialFisico = tipoMaterialFisico;
    }

    
}
