package br.amber.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.amber.database.entity.StatusPojo;
import br.amber.database.helper.DataBaseHelper;
import br.amber.database.util.Mount;

/**
 * Created by fredericom on 24/01/2018.
 */

public class StatusDAO {

    private DataBaseHelper helper;
    private SQLiteDatabase db = null;

    public StatusDAO(Context context) {
        this.helper = new DataBaseHelper(context);
    }

    public long insertStatus(StatusPojo st){
        this.db = this.helper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Mount.COL_TB_ST_OP_TIPO_ARQUIVO, st.getTipo_arquivo());
        values.put(Mount.COL_TB_ST_OP_TIPO_USUARIO, st.getTipo_usuario());
        values.put(Mount.COL_TB_ST_OP_STATUS, st.getStatus());
        values.put(Mount.COL_TB_ST_OP_COD_ORCAMENTO, st.getCod_orcamento());
        values.put(Mount.COL_TB_ST_OP_COD_USUARIO, st.getCod_usuario());

        long id = db.insert(Mount.TABELA_STATUS_OP, null, values);
        db.close();
        return id;
    }
}
