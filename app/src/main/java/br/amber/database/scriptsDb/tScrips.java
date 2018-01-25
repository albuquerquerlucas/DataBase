package br.amber.database.scriptsDb;

import android.content.ContentValues;

import java.util.List;

import br.amber.database.entity.TitularPojo;
import br.amber.database.util.Mount;

/**
 * Created by fredericom on 25/01/2018.
 */

public class tScrips {

    public static ContentValues insert(TitularPojo titular){
        ContentValues values = new ContentValues();

        values.put(Mount.COL_TB_T_CPF_TITULAR, titular.getCpf_titular());
        values.put(Mount.COL_TB_T_CPF, titular.getCpf());
        values.put(Mount.COL_TB_T_RG, titular.getRg());
        values.put(Mount.COL_TB_T_CNH, titular.getCnh());
        values.put(Mount.COL_TB_T_CTPS, titular.getCtps());
        values.put(Mount.COL_TB_T_PASSAPORTE, titular.getPassaporte());
        values.put(Mount.COL_TB_T_RNE, titular.getRne());
        values.put(Mount.COL_TB_T_RG_CPF, titular.getRg_cpf());
        values.put(Mount.COL_TB_T_CNH_CPF, titular.getCnh_cpf());
        values.put(Mount.COL_TB_T_CTPS_CPF, titular.getCtps_cpf());
        values.put(Mount.COL_TB_T_PASSAPORTE_CPF, titular.getPassaporte_cpf());
        values.put(Mount.COL_TB_T_RNE_CPF, titular.getRne_cpf());
        values.put(Mount.COL_TB_T_AGUA, titular.getAgua());
        values.put(Mount.COL_TB_T_LUZ, titular.getLuz());
        values.put(Mount.COL_TB_T_TELEFONE, titular.getTelefone());
        values.put(Mount.COL_TB_T_CARTAO, titular.getCartao());
        values.put(Mount.COL_TB_T_TV, titular.getTv());
        values.put(Mount.COL_TB_T_INTERNET, titular.getInternet());
        values.put(Mount.COL_TB_T_STATUS_ENVIO, titular.getSt_envio());
        values.put(Mount.COL_TB_T_PK_ORCAMENTO, titular.getPk_orcamento());

        return values;
    }

    public static String insertIfExists(TitularPojo t){
        String script = "INSERT INTO " + Mount.TABELA_TITULAR  + "(" +
                Mount.COL_TB_T_CPF_TITULAR + ", " +
                Mount.COL_TB_T_CPF + ", " +
                Mount.COL_TB_T_RG + ", " +
                Mount.COL_TB_T_CNH + ", " +
                Mount.COL_TB_T_CTPS + ", " +
                Mount.COL_TB_T_PASSAPORTE + ", " +
                Mount.COL_TB_T_RNE + ", " +
                Mount.COL_TB_T_RG_CPF + ", " +
                Mount.COL_TB_T_CNH_CPF + ", " +
                Mount.COL_TB_T_CTPS_CPF + ", " +
                Mount.COL_TB_T_PASSAPORTE_CPF + ", " +
                Mount.COL_TB_T_RNE_CPF + ", " +
                Mount.COL_TB_T_AGUA + ", " +
                Mount.COL_TB_T_LUZ + ", " +
                Mount.COL_TB_T_TELEFONE + ", " +
                Mount.COL_TB_T_CARTAO + ", " +
                Mount.COL_TB_T_TV + ", " +
                Mount.COL_TB_T_INTERNET + ", " +
                Mount.COL_TB_T_STATUS_ENVIO + ", " +
                Mount.COL_TB_T_PK_ORCAMENTO + ") " +
                "SELECT " + "\'" + t.getCpf_titular() + "\'" + ", "  + "\'" + t.getCpf() + "\'" + ", " + "\'" + t.getRg() + "\'" + ", " + "\'" + t.getCnh() + "\'" + ", " + "\'" + t.getCtps() + "\'" + ", " + "\'" + t.getPassaporte() + "\'" + ", " + "\'" + t.getRne() + "\'" + ", " +
                "\'" + t.getRg_cpf() + "\'" + ", " + "\'" + t.getCnh_cpf() + "\'" + ", " + "\'" + t.getCtps_cpf() + "\'" + ", " + "\'" + t.getPassaporte_cpf() + "\'" + ", " + "\'" + t.getRne_cpf() + "\'" + ", " +
                "\'" + t.getAgua() + "\'" + ", " + "\'" + t.getLuz() + "\'" + ", " + "\'" + t.getTelefone() + "\'" + ", " + "\'" + t.getCartao() + "\'" + ", " + "\'" + t.getTv() + "\'" + ", " + "\'" + t.getInternet() + "\'" + ", " +
                "\'" + t.getSt_envio() + "\'" + ", " + "\'" + t.getPk_orcamento() + "\'" + " " +
                "WHERE NOT EXISTS (SELECT 1 FROM " + Mount.TABELA_TITULAR + " WHERE " + Mount.COL_TB_T_CPF_TITULAR + " = " + "\'" + t.getCpf_titular() + "\'" + ");";
        return script;
    }

    public static String getListAll(){
        String script = "SELECT * from " + Mount.TABELA_TITULAR;
        return script;
    }

    public static String getTitularForOrcamento(String numOrcamento){
        String script = "SELECT * from " + Mount.TABELA_TITULAR + " WHERE " + Mount.COL_TB_T_PK_ORCAMENTO + " = " + "\'" + numOrcamento + "\'";
        return script;
    }

    public static String getTitularForCpf(String cpfTitular){
        String script = "SELECT * from " + Mount.TABELA_TITULAR + " WHERE " + Mount.COL_TB_T_CPF_TITULAR + " = " + "\'" + cpfTitular + "\'";
        return script;
    }

    public static String qtdRegisters(){
        String script = "SELECT * from " + Mount.TABELA_TITULAR;
        return script;
    }

    public static String deleteTitularForCpf(String cpfTitular){
        String script = "DELETE from " + Mount.TABELA_TITULAR + " WHERE " + Mount.COL_TB_T_CPF_TITULAR + " = " + "\'" + cpfTitular + "\'";
        return script;
    }

    public static String deleteTable(){
        String script = "DELETE from " + Mount.TABELA_TITULAR;
        return script;
    }
}
