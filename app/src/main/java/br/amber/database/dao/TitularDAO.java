package br.amber.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.amber.database.entity.TitularPojo;
import br.amber.database.helper.DataBaseHelper;
import br.amber.database.util.Mount;
import br.amber.database.scriptsDb.tScrips;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class TitularDAO {

    private static final String TAG_ERROR = "ERRO";
    private DataBaseHelper helper;
    private SQLiteDatabase db = null;

    public TitularDAO(Context context) {
        this.helper = new DataBaseHelper(context);
    }

    public long inserirTitular(TitularPojo titular){
        this.db = this.helper.getWritableDatabase();
        long id = db.insert(Mount.TABELA_TITULAR, null, tScrips.insert(titular));
        db.close();
        return id;
    }

    public void inserirTitularSeNaoExistir(TitularPojo titular){
        this.db = this.helper.getWritableDatabase();
        db.execSQL(tScrips.insertIfExists(titular));
        db.close();
    }

    public List<TitularPojo> listarTodosOsTitulares(){
        this.db = this.helper.getReadableDatabase();
        Cursor cursor = db.rawQuery(tScrips.getListAll(), null);
        List<TitularPojo> listaTitulares = new ArrayList<>();
        TitularPojo titularPojo;

        try{
            if(cursor.moveToFirst()){
                do{
                    String cpf_titular = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CPF_TITULAR));
                    String cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CPF));
                    String rg = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RG));
                    String cnh = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CNH));
                    String ctps = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CTPS));
                    String passaporte = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PASSAPORTE));
                    String rne = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RNE));
                    String rg_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RG_CPF));
                    String cnh_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CNH_CPF));
                    String ctps_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CTPS_CPF));
                    String passaporte_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PASSAPORTE_CPF));
                    String rne_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RNE_CPF));
                    String agua = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_AGUA));
                    String lua = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_LUZ));
                    String telefone = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_TELEFONE));
                    String cartao = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CARTAO));
                    String tv = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_TV));
                    String internet = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_INTERNET));
                    String st_envio = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_STATUS_ENVIO));
                    String pk_orcamento = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PK_ORCAMENTO));

                    titularPojo = new TitularPojo(
                            cpf_titular, cpf, rg, cnh, ctps, passaporte, rne, rg_cpf, cnh_cpf, ctps_cpf, passaporte_cpf, rne_cpf, agua, lua, telefone, cartao, tv, internet, st_envio, pk_orcamento
                    );
                    listaTitulares.add(titularPojo);
                }while (cursor.moveToNext());
            }
            cursor.close();
            db.close();
        }catch (Exception e){
            Log.i(TAG_ERROR, e.getMessage());
        }
        return listaTitulares;
    }

    public TitularPojo getTitularPorOrcamento(String numOrcamento){
        this.db = this.helper.getReadableDatabase();
        Cursor cursor = db.rawQuery(tScrips.getTitularForOrcamento(numOrcamento), null);
        TitularPojo titular = null;

        try{
            if (cursor != null){
                cursor.moveToFirst();
                String cpf_titular = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CPF_TITULAR));
                String cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CPF));
                String rg = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RG));
                String cnh = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CNH));
                String ctps = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CTPS));
                String passaporte = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PASSAPORTE));
                String rne = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RNE));
                String rg_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RG_CPF));
                String cnh_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CNH_CPF));
                String ctps_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CTPS_CPF));
                String passaporte_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PASSAPORTE_CPF));
                String rne_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RNE_CPF));
                String agua = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_AGUA));
                String lua = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_LUZ));
                String telefone = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_TELEFONE));
                String cartao = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CARTAO));
                String tv = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_TV));
                String internet = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_INTERNET));
                String st_envio = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_STATUS_ENVIO));
                String pk_orcamento = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PK_ORCAMENTO));

                titular = new TitularPojo(
                        cpf_titular, cpf, rg, cnh, ctps, passaporte, rne, rg_cpf, cnh_cpf, ctps_cpf, passaporte_cpf, rne_cpf, agua, lua, telefone, cartao, tv, internet, st_envio, pk_orcamento
                );
            }
            cursor.close();
            db.close();
        }catch (Exception e){
            Log.i(TAG_ERROR, e.getMessage());
        }
        return titular;
    }

    public TitularPojo getTitularPorCpf(String cpfTitular){
        this.db = this.helper.getReadableDatabase();
        Cursor cursor = db.rawQuery(tScrips.getTitularForCpf(cpfTitular), null);
        TitularPojo titular = null;

        try{
            if (cursor != null){
                cursor.moveToFirst();
                String cpf_titular = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CPF_TITULAR));
                String cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CPF));
                String rg = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RG));
                String cnh = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CNH));
                String ctps = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CTPS));
                String passaporte = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PASSAPORTE));
                String rne = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RNE));
                String rg_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RG_CPF));
                String cnh_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CNH_CPF));
                String ctps_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CTPS_CPF));
                String passaporte_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PASSAPORTE_CPF));
                String rne_cpf = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_RNE_CPF));
                String agua = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_AGUA));
                String lua = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_LUZ));
                String telefone = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_TELEFONE));
                String cartao = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_CARTAO));
                String tv = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_TV));
                String internet = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_INTERNET));
                String st_envio = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_STATUS_ENVIO));
                String pk_orcamento = cursor.getString(cursor.getColumnIndex(Mount.COL_TB_T_PK_ORCAMENTO));

                titular = new TitularPojo(
                        cpf_titular, cpf, rg, cnh, ctps, passaporte, rne, rg_cpf, cnh_cpf, ctps_cpf, passaporte_cpf, rne_cpf, agua, lua, telefone, cartao, tv, internet, st_envio, pk_orcamento
                );
            }
            cursor.close();
            db.close();
        }catch (Exception e){
            Log.i(TAG_ERROR, e.getMessage());
        }
        return titular;
    }

    public int qtdDeTitulares(){
        this.db = this.helper.getReadableDatabase();
        Cursor cursor = db.rawQuery(tScrips.qtdRegisters(), null);
        int qtd = cursor.getCount();
        return qtd;
    }

    public void excluirTitular(String cpfTitular){
        this.db = this.helper.getWritableDatabase();
        db.execSQL(tScrips.deleteTitularForCpf(cpfTitular));
        db.close();
    }

    public void excluirTodosOsTitulares(){
        this.db = this.helper.getWritableDatabase();
        db.execSQL(tScrips.deleteTable());
        db.close();
    }
}
