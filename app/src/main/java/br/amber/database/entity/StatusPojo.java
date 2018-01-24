package br.amber.database.entity;

/**
 * Created by fredericom on 24/01/2018.
 */

public class StatusPojo {

    private String tipo_arquivo;
    private String tipo_usuario;
    private String status;
    private String cod_orcamento;
    private String cod_usuario;

    public StatusPojo(String tipo_arquivo, String tipo_usuario, String status, String cod_orcamento, String cod_usuario) {
        this.tipo_arquivo = tipo_arquivo;
        this.tipo_usuario = tipo_usuario;
        this.status = status;
        this.cod_orcamento = cod_orcamento;
        this.cod_usuario = cod_usuario;
    }

    public String getTipo_arquivo() {
        return tipo_arquivo;
    }

    public void setTipo_arquivo(String tipo_arquivo) {
        this.tipo_arquivo = tipo_arquivo;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCod_orcamento() {
        return cod_orcamento;
    }

    public void setCod_orcamento(String cod_orcamento) {
        this.cod_orcamento = cod_orcamento;
    }

    public String getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
}
