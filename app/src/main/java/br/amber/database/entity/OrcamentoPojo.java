package br.amber.database.entity;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class OrcamentoPojo {

    private String dt_status;
    private String ds_senha_sms;
    private String cd_vendedor;
    private String dt_inicio;
    private String fl_status;
    private String ds_erro;
    private String nu_controle;
    private String dt_digitacao;
    private String nm_vendedor;
    private String nu_orcamento;
    private String nm_usuario;
    private String tipo_contrato;
    private String cpf_titular;

    public OrcamentoPojo(String dt_status, String ds_senha_sms, String cd_vendedor, String dt_inicio, String fl_status, String ds_erro, String nu_controle, String dt_digitacao, String nm_vendedor, String nu_orcamento, String nm_usuario, String tipo_contrato, String cpf_titular) {
        this.dt_status = dt_status;
        this.ds_senha_sms = ds_senha_sms;
        this.cd_vendedor = cd_vendedor;
        this.dt_inicio = dt_inicio;
        this.fl_status = fl_status;
        this.ds_erro = ds_erro;
        this.nu_controle = nu_controle;
        this.dt_digitacao = dt_digitacao;
        this.nm_vendedor = nm_vendedor;
        this.nu_orcamento = nu_orcamento;
        this.nm_usuario = nm_usuario;
        this.tipo_contrato = tipo_contrato;
        this.cpf_titular = cpf_titular;
    }

    public String getDt_status() {
        return dt_status;
    }

    public void setDt_status(String dt_status) {
        this.dt_status = dt_status;
    }

    public String getDs_senha_sms() {
        return ds_senha_sms;
    }

    public void setDs_senha_sms(String ds_senha_sms) {
        this.ds_senha_sms = ds_senha_sms;
    }

    public String getCd_vendedor() {
        return cd_vendedor;
    }

    public void setCd_vendedor(String cd_vendedor) {
        this.cd_vendedor = cd_vendedor;
    }

    public String getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(String dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public String getFl_status() {
        return fl_status;
    }

    public void setFl_status(String fl_status) {
        this.fl_status = fl_status;
    }

    public String getDs_erro() {
        return ds_erro;
    }

    public void setDs_erro(String ds_erro) {
        this.ds_erro = ds_erro;
    }

    public String getNu_controle() {
        return nu_controle;
    }

    public void setNu_controle(String nu_controle) {
        this.nu_controle = nu_controle;
    }

    public String getDt_digitacao() {
        return dt_digitacao;
    }

    public void setDt_digitacao(String dt_digitacao) {
        this.dt_digitacao = dt_digitacao;
    }

    public String getNm_vendedor() {
        return nm_vendedor;
    }

    public void setNm_vendedor(String nm_vendedor) {
        this.nm_vendedor = nm_vendedor;
    }

    public String getNu_orcamento() {
        return nu_orcamento;
    }

    public void setNu_orcamento(String nu_orcamento) {
        this.nu_orcamento = nu_orcamento;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public String getCpf_titular() {
        return cpf_titular;
    }

    public void setCpf_titular(String cpf_titular) {
        this.cpf_titular = cpf_titular;
    }
}
