package br.amber.database.entity;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class DependentePojo {

    private String cod_dependente;
    private String cpf;
    private String rg;
    private String cnh;
    private String ctps;
    private String passaporte;
    private String rne;
    private String rg_cpf;
    private String cnh_cpf;
    private String ctps_cpf;
    private String passaporte_cpf;
    private String rne_cpf;
    private String st_envio;
    private String pk_orcamento_titular;
    private String pk_cpf_titular;

    public DependentePojo(String cod_dependente, String cpf, String rg, String cnh, String ctps, String passaporte,
                          String rne, String rg_cpf, String cnh_cpf, String ctps_cpf, String passaporte_cpf,
                          String rne_cpf, String st_envio, String pk_orcamento_titular, String pk_cpf_titular) {
        this.cod_dependente = cod_dependente;
        this.cpf = cpf;
        this.rg = rg;
        this.cnh = cnh;
        this.ctps = ctps;
        this.passaporte = passaporte;
        this.rne = rne;
        this.rg_cpf = rg_cpf;
        this.cnh_cpf = cnh_cpf;
        this.ctps_cpf = ctps_cpf;
        this.passaporte_cpf = passaporte_cpf;
        this.rne_cpf = rne_cpf;
        this.st_envio = st_envio;
        this.pk_orcamento_titular = pk_orcamento_titular;
        this.pk_cpf_titular = pk_cpf_titular;
    }

    public String getCod_dependente() {
        return cod_dependente;
    }

    public void setCod_dependente(String cod_dependente) {
        this.cod_dependente = cod_dependente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getRne() {
        return rne;
    }

    public void setRne(String rne) {
        this.rne = rne;
    }

    public String getRg_cpf() {
        return rg_cpf;
    }

    public void setRg_cpf(String rg_cpf) {
        this.rg_cpf = rg_cpf;
    }

    public String getCnh_cpf() {
        return cnh_cpf;
    }

    public void setCnh_cpf(String cnh_cpf) {
        this.cnh_cpf = cnh_cpf;
    }

    public String getCtps_cpf() {
        return ctps_cpf;
    }

    public void setCtps_cpf(String ctps_cpf) {
        this.ctps_cpf = ctps_cpf;
    }

    public String getPassaporte_cpf() {
        return passaporte_cpf;
    }

    public void setPassaporte_cpf(String passaporte_cpf) {
        this.passaporte_cpf = passaporte_cpf;
    }

    public String getRne_cpf() {
        return rne_cpf;
    }

    public void setRne_cpf(String rne_cpf) {
        this.rne_cpf = rne_cpf;
    }

    public String getSt_envio() {
        return st_envio;
    }

    public void setSt_envio(String st_envio) {
        this.st_envio = st_envio;
    }

    public String getPk_orcamento_titular() {
        return pk_orcamento_titular;
    }

    public void setPk_orcamento_titular(String pk_orcamento_titular) {
        this.pk_orcamento_titular = pk_orcamento_titular;
    }

    public String getPk_cpf_titular() {
        return pk_cpf_titular;
    }

    public void setPk_cpf_titular(String pk_cpf_titular) {
        this.pk_cpf_titular = pk_cpf_titular;
    }
}
