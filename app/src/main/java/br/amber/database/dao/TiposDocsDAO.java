package br.amber.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.amber.database.entity.TiposDocumentosPojo;
import br.amber.database.helper.DataBaseHelper;
import br.amber.database.util.Mount;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class TiposDocsDAO {

    private DataBaseHelper helper;
    private SQLiteDatabase db = null;

    public TiposDocsDAO(Context context) {
        this.helper = new DataBaseHelper(context);
    }

    public long insertTipoDocs(TiposDocumentosPojo tipos){
        this.db = this.helper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Mount.COL_TB_DOCS_CD_TIPO_DOCUMENTO, tipos.getCd_tipo_documento());
        values.put(Mount.COL_TB_DOCS_FL_TIPO_USUARIO, tipos.getFl_tipo_usuario());
        values.put(Mount.COL_TB_DOCS_NM_DOCUMENTO, tipos.getNm_documento());
        values.put(Mount.COL_TB_DOCS_DS_DOCUMENTO, tipos.getDs_documento());
        values.put(Mount.COL_TB_DOCS_FL_OBRIGATORIO, tipos.getFl_obrigatorio());
        values.put(Mount.COL_TB_DOCS_FL_CPF, tipos.getFl_cpf());
        values.put(Mount.COL_TB_DOCS_Ds_ERRO, tipos.getDs_erro());

        long id = db.insert(Mount.CREATE_TABELA_TIPOS_DOCS, null, values);
        db.close();
        return id;
    }
}
