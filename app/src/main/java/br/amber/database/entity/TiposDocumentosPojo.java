package br.amber.database.entity;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class TiposDocumentosPojo {

    private String cd_tipo_documento;
    private String fl_tipo_usuario;
    private String nm_documento;
    private String ds_documento;
    private String fl_obrigatorio;
    private String fl_cpf;
    private String ds_erro;

    public TiposDocumentosPojo(String cd_tipo_documento, String fl_tipo_usuario, String nm_documento, String ds_documento, String fl_obrigatorio, String fl_cpf, String ds_erro) {
        this.cd_tipo_documento = cd_tipo_documento;
        this.fl_tipo_usuario = fl_tipo_usuario;
        this.nm_documento = nm_documento;
        this.ds_documento = ds_documento;
        this.fl_obrigatorio = fl_obrigatorio;
        this.fl_cpf = fl_cpf;
        this.ds_erro = ds_erro;
    }

    public String getCd_tipo_documento() {
        return cd_tipo_documento;
    }

    public void setCd_tipo_documento(String cd_tipo_documento) {
        this.cd_tipo_documento = cd_tipo_documento;
    }

    public String getFl_tipo_usuario() {
        return fl_tipo_usuario;
    }

    public void setFl_tipo_usuario(String fl_tipo_usuario) {
        this.fl_tipo_usuario = fl_tipo_usuario;
    }

    public String getNm_documento() {
        return nm_documento;
    }

    public void setNm_documento(String nm_documento) {
        this.nm_documento = nm_documento;
    }

    public String getDs_documento() {
        return ds_documento;
    }

    public void setDs_documento(String ds_documento) {
        this.ds_documento = ds_documento;
    }

    public String getFl_obrigatorio() {
        return fl_obrigatorio;
    }

    public void setFl_obrigatorio(String fl_obrigatorio) {
        this.fl_obrigatorio = fl_obrigatorio;
    }

    public String getFl_cpf() {
        return fl_cpf;
    }

    public void setFl_cpf(String fl_cpf) {
        this.fl_cpf = fl_cpf;
    }

    public String getDs_erro() {
        return ds_erro;
    }

    public void setDs_erro(String ds_erro) {
        this.ds_erro = ds_erro;
    }
}
