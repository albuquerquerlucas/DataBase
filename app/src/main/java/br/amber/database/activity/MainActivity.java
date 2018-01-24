package br.amber.database.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.amber.database.R;
import br.amber.database.dao.DependenteDAO;
import br.amber.database.dao.OrcamentosDAO;
import br.amber.database.dao.TiposDocsDAO;
import br.amber.database.dao.TitularDAO;
import br.amber.database.util.Inserts;

public class MainActivity extends AppCompatActivity {

    private OrcamentosDAO orcDao;
    private TitularDAO tDao;
    private DependenteDAO dDao;
    private TiposDocsDAO tipDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.orcDao = new OrcamentosDAO(this);
        this.tDao = new TitularDAO(this);
        this.dDao = new DependenteDAO(this);
        this.tipDao = new TiposDocsDAO(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //this.orcDao.insertOrcamento(Inserts.getOrcamento());
        //this.tDao.insertTitular(Inserts.getTitular());
        //this.dDao.insertDependente(Inserts.getDependente());
        //this.tipDao.insertTipoDocs(Inserts.getTiposDocumento());
    }
}
