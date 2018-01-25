package br.amber.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.amber.database.entity.DependentePojo;
import br.amber.database.helper.DataBaseHelper;
import br.amber.database.util.Mount;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class DependenteDAO {

    private DataBaseHelper helper;
    private SQLiteDatabase db = null;

    public DependenteDAO(Context context) {
        this.helper = new DataBaseHelper(context);
    }

    public long insertDependente(DependentePojo dependente){
        this.db = this.helper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Mount.COL_TB_D_COD_DEPENDENTE, dependente.getCod_dependente());
        values.put(Mount.COL_TB_D_CPF, dependente.getCpf());
        values.put(Mount.COL_TB_D_RG, dependente.getRg());
        values.put(Mount.COL_TB_D_CNH, dependente.getCnh());
        values.put(Mount.COL_TB_D_CTPS, dependente.getCtps());
        values.put(Mount.COL_TB_D_PASSAPORTE, dependente.getPassaporte());
        values.put(Mount.COL_TB_D_RNE, dependente.getRne());
        values.put(Mount.COL_TB_D_RG_CPF, dependente.getRg_cpf());
        values.put(Mount.COL_TB_D_CNH_CPF, dependente.getCnh_cpf());
        values.put(Mount.COL_TB_D_CTPS_CPF, dependente.getCtps_cpf());
        values.put(Mount.COL_TB_D_PASSAPORTE_CPF, dependente.getPassaporte_cpf());
        values.put(Mount.COL_TB_D_RNE_CPF, dependente.getRne_cpf());
        values.put(Mount.COL_TB_D_STATUS_ENVIO, dependente.getSt_envio());
        values.put(Mount.COL_TB_D_PK_ORCAMENTO_TITULAR, dependente.getPk_orcamento_titular());

        long id = db.insert(Mount.TABELA_DEPENDENTE, null, values);
        db.close();
        return id;
    }
}
