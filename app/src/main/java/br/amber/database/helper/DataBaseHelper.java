package br.amber.database.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.IOException;

import br.amber.database.util.Mount;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "testedb";
    private static final int DB_VERSAO = 1;

    public DataBaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Mount.CREATE_TABELA_ORCAMENTOS);
        db.execSQL(Mount.CREATE_TABELA_TITULAR);
        db.execSQL(Mount.CREATE_TABELA_DEPENDENTE);
        db.execSQL(Mount.CREATE_TABELA_STATUS_OP);
        db.execSQL(Mount.CREATE_TABELA_TIPOS_DOCS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + Mount.TABELA_OCAMENTOS);
        db.execSQL("DROP TABLE IF EXISTS " + Mount.TABELA_TITULAR);
        db.execSQL("DROP TABLE IF EXISTS " + Mount.TABELA_DEPENDENTE);
        db.execSQL("DROP TABLE IF EXISTS " + Mount.TABELA_STATUS_OP);
        db.execSQL("DROP TABLE IF EXISTS " + Mount.TABELA_TIPOS_DOCS);
    }

    public static void deleteFiles(String path) {

        File file = new File(path);

        if (file.exists()) {
            String deleteCmd = "rm -r " + path;
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec(deleteCmd);
            } catch (IOException e) { }
        }
    }
}
