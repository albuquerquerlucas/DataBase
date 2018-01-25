package br.amber.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.amber.database.entity.TitularPojo;
import br.amber.database.helper.DataBaseHelper;
import br.amber.database.util.Mount;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class TitularDAO {

    private DataBaseHelper helper;
    private SQLiteDatabase db = null;

    public TitularDAO(Context context) {
        this.helper = new DataBaseHelper(context);
    }

    public long insertTitular(TitularPojo titular){
        this.db = this.helper.getWritableDatabase();
        ContentValues values = new ContentValues();

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
        values.put(Mount.COL_TB_T_PK_CPF_TITULAR, titular.getPk_cpf_titular());

        long id = db.insert(Mount.TABELA_TITULAR, null, values);
        db.close();
        return id;
    }
}
