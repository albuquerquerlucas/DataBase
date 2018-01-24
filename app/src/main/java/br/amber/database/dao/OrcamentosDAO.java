package br.amber.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.amber.database.entity.OrcamentoPojo;
import br.amber.database.helper.DataBaseHelper;
import br.amber.database.util.Mount;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class OrcamentosDAO {

    private DataBaseHelper helper = null;
    private SQLiteDatabase db = null;

    public OrcamentosDAO(Context context) {
        this.helper = new DataBaseHelper(context);
    }

    public long insertOrcamento(OrcamentoPojo orcamento){
        this.db = this.helper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Mount.COL_TB_O_DT_STATUS, orcamento.getCod_cons());
        values.put(Mount.COL_TB_O_DT_STATUS, orcamento.getDt_status());
        values.put(Mount.COL_TB_O_DS_SENHA_SMS, orcamento.getDs_senha_sms());
        values.put(Mount.COL_TB_O_CD_VENDEDOR, orcamento.getCd_vendedor());
        values.put(Mount.COL_TB_O_DT_INICIO, orcamento.getDt_inicio());
        values.put(Mount.COL_TB_O_FL_STATUS, orcamento.getFl_status());
        values.put(Mount.COL_TB_O_DS_ERRO, orcamento.getDs_erro());
        values.put(Mount.COL_TB_O_NU_CONTROLE, orcamento.getNu_controle());
        values.put(Mount.COL_TB_O_DT_DIGITACAO, orcamento.getDt_digitacao());
        values.put(Mount.COL_TB_O_NM_VENDEDOR, orcamento.getNm_vendedor());
        values.put(Mount.COL_TB_O_NU_ORCAMENTO, orcamento.getNu_orcamento());
        values.put(Mount.COL_TB_O_NM_USUARIO, orcamento.getNm_usuario());
        values.put(Mount.COL_TB_O_TIPO_CONTRATO, orcamento.getTipo_contrato());
        values.put(Mount.COL_TB_O_CPF_TITULAR, orcamento.getCpf_titular());

        long id = db.insert(Mount.TABELA_OCAMENTOS, null, values);
        db.close();
        return id;
    }
}
