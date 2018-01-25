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
                "0001",
                "22/01/2018",
                "TQBQSGDF",
                "14486",
                "22/01/2018",
                "11",
                "N/A",
                "17159716",
                "22/01/2018",
                "TODOS PROMARKET/CAR",
                "332850750",
                "LUCAS RODRIGUES",
                "1",
                "00100200345"
        );

        return orcamento;
    }

    public static TitularPojo getTitular(){

        TitularPojo titularPojo = new TitularPojo(
                "00100200345",
                "",
                "foto.png",
                "foto.png",
                "foto.png",
                "",
                "foto.png",
                "foto.png",
                "foto.png",
                "foto.png",
                "",
                "",
                "foto.png",
                "foto.png",
                "foto.png",
                "",
                "foto.png",
                "enviado",
                "enviado",
                "332850750"
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
                "não enviado",
                "332850750"
        );

        return dependentePojo;
    }

    public static StatusPojo getStatus(){

        StatusPojo statusPojo = new StatusPojo(
                "cpf",
                "titular",
                "on",
                "332850750",
                "00100200345"
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
