package br.amber.database.util;

import br.amber.database.entity.DependentePojo;
import br.amber.database.entity.OrcamentoPojo;
import br.amber.database.entity.StatusPojo;
import br.amber.database.entity.TiposDocumentosPojo;
import br.amber.database.entity.TitularPojo;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class Inserts {

    public static OrcamentoPojo getOrcamento(){

        OrcamentoPojo orcamento = new OrcamentoPojo(
                "1000",
                "22/01/2018",
                "TQBQSGDF",
                "14486",
                "22/01/2018",
                "11",
                "N/A",
                "17159716",
                "22/01/2018",
                "TODOS PROMARKET/CAR",
                "332850720",
                "LUCAS RODRIGUES",
                "1",
                "01301401566"
        );

        return orcamento;
    }

    public static TitularPojo getTitular(){

        TitularPojo titularPojo = new TitularPojo(
                "foto.png",
                "",
                "foto.png",
                "",
                "foto.png",
                "",
                "foto.png",
                "",
                "",
                "foto.png",
                "",
                "foto.png",
                "",
                "foto.png",
                "foto.png",
                "",
                "foto.png",
                "332850720",
                "01301401566"
        );

        return titularPojo;
    }

    public static DependentePojo getDependente(){

        DependentePojo dependentePojo = new DependentePojo(
            "002",
                "foto.png",
                "foto.png",
                "",
                "foto.png",
                "foto.png",
                "",
                "",
                "",
                "foto.png",
                "foto.png",
                "foto.png",
                "332850719",
                "01301401566"
        );

        return dependentePojo;
    }

    public static StatusPojo getStatus(){

        StatusPojo statusPojo = new StatusPojo(
                "cpf",
                "titular",
                "on",
                "332850720",
                "123456"
        );

        return statusPojo;
    }

    public static TiposDocumentosPojo getTiposDocumento(){

        TiposDocumentosPojo tiposDocumentosPojo = new TiposDocumentosPojo(
                "1",
                "T",
                "RG",
                "Registro Geral",
                "N",
                "N",
                "N/A"
        );

        return tiposDocumentosPojo;
    }
}
