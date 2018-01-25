package br.amber.database.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import br.amber.database.R;
import br.amber.database.dao.DependenteDAO;
import br.amber.database.dao.OrcamentosDAO;
import br.amber.database.dao.StatusDAO;
import br.amber.database.dao.TiposDocsDAO;
import br.amber.database.dao.TitularDAO;
import br.amber.database.entity.TitularPojo;
import br.amber.database.util.Inserts;
import br.amber.database.util.Mount;

public class MainActivity extends Activity {

    private OrcamentosDAO orcDao;
    private TitularDAO tDao;
    private DependenteDAO dDao;
    private StatusDAO sDAO;
    private TiposDocsDAO tipDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.orcDao = new OrcamentosDAO(this);
        this.tDao = new TitularDAO(this);
        this.dDao = new DependenteDAO(this);
        this.sDAO = new StatusDAO(this);
        this.tipDao = new TiposDocsDAO(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

//        this.orcDao.insertOrcamento(Inserts.getOrcamento());
//        this.tDao.insertTitular(Inserts.getTitular());
//        this.tDao.inserirTitularSeNaoExistir(Inserts.getTitular());
//        this.dDao.insertDependente(Inserts.getDependente());
//        this.sDAO.insertStatus(Inserts.getStatus());
//        this.tipDao.insertTipoDocs(Inserts.getTiposDocumento());

//        int qtd = this.tDao.qtdDeTitulares();
//        Toast.makeText(this, "QTD Registros = " + qtd, Toast.LENGTH_SHORT).show();
//
//        for(TitularPojo t : this.tDao.listarTodosOsTitulares()){
//            Log.i("TITULAR CPF ", t.getCpf_titular());
//        }
//
//        TitularPojo titular = this.tDao.getTitularPorOrcamento("332850750");
//        Log.i("TITULAR POR ORCAMENTO ", titular.getCpf_titular());
//
//        TitularPojo titular2 = this.tDao.getTitularPorCpf(titular.getCpf_titular());
//        Log.i("TITULAR POR ORCAMENTO ", titular2.getCpf_titular());
//
//        this.tDao.excluirTitular(titular2.getCpf_titular());
//        Toast.makeText(this, "Titular " + titular2.getCpf_titular() + " Excluído!", Toast.LENGTH_LONG).show();
//
//        int qtd1 = this.tDao.qtdDeTitulares();
//        Toast.makeText(this, "Nova QTD Registros = " + qtd1, Toast.LENGTH_SHORT).show();

    }
}
