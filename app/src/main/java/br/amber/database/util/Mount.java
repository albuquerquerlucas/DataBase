package br.amber.database.util;

/**
 * Created by Mrluke on 23/01/2018.
 */

public class Mount {

    // Nomes das tabelas...
    public static final String TABELA_OCAMENTOS = "orcamentos";
    public static final String TABELA_TITULAR = "titular";
    public static final String TABELA_DEPENDENTE = "dependente";
    public static final String TABELA_STATUS_OP = "status_op";
    public static final String TABELA_TIPOS_DOCS = "tipo_docs";

    // Colunas da tabela Orcamentos...
    public static final String COL_TB_O_ID = "id_orcamento";
    public static final String COL_TB_O_COD_CONS = "cod_cons";
    public static final String COL_TB_O_DT_STATUS = "dt_status";
    public static final String COL_TB_O_DS_SENHA_SMS = "ds_senha_sms";
    public static final String COL_TB_O_CD_VENDEDOR = "cd_vendedor";
    public static final String COL_TB_O_DT_INICIO = "dt_inicio";
    public static final String COL_TB_O_FL_STATUS = "fl_status";
    public static final String COL_TB_O_DS_ERRO = "ds_erro";
    public static final String COL_TB_O_NU_CONTROLE = "nu_controle";
    public static final String COL_TB_O_DT_DIGITACAO = "dt_digitacao";
    public static final String COL_TB_O_NM_VENDEDOR = "nm_vendedor";
    public static final String COL_TB_O_NU_ORCAMENTO = "nu_orcamento";
    public static final String COL_TB_O_NM_USUARIO = "nm_usuario";
    public static final String COL_TB_O_TIPO_CONTRATO = "tipo_contrato";
    public static final String COL_TB_O_CPF_TITULAR = "cpf_titular";

    // Colunas da Tabela Titular...
    public static final String COL_TB_T_ID = "id_titular";
    public static final String COL_TB_T_CPF_TITULAR = "cpf_titular";
    public static final String COL_TB_T_CPF = "cpf";
    public static final String COL_TB_T_RG = "rg";
    public static final String COL_TB_T_CNH = "cnh";
    public static final String COL_TB_T_CTPS = "ctps";
    public static final String COL_TB_T_PASSAPORTE = "passaporte";
    public static final String COL_TB_T_RNE = "rne";
    public static final String COL_TB_T_RG_CPF = "rg_cpf";
    public static final String COL_TB_T_CNH_CPF = "cnh_cpf";
    public static final String COL_TB_T_CTPS_CPF = "ctps_cpf";
    public static final String COL_TB_T_PASSAPORTE_CPF = "passaporte_cpf";
    public static final String COL_TB_T_RNE_CPF = "rne_cpf";
    public static final String COL_TB_T_AGUA = "agua";
    public static final String COL_TB_T_LUZ = "lua";
    public static final String COL_TB_T_TELEFONE = "telefone";
    public static final String COL_TB_T_CARTAO = "cartao";
    public static final String COL_TB_T_TV = "tv";
    public static final String COL_TB_T_INTERNET = "internet";
    public static final String COL_TB_T_STATUS_ENVIO = "st_envio";
    public static final String COL_TB_T_PK_ORCAMENTO = "pk_orcamento";

    // Colunas da Tabela Dependente...
    public static final String COL_TB_D_ID = "id_dependente";
    public static final String COL_TB_D_COD_DEPENDENTE = "cod_dependente";
    public static final String COL_TB_D_CPF = "cpf";
    public static final String COL_TB_D_RG = "rg";
    public static final String COL_TB_D_CNH = "cnh";
    public static final String COL_TB_D_CTPS = "ctps";
    public static final String COL_TB_D_PASSAPORTE = "passaporte";
    public static final String COL_TB_D_RNE = "rne";
    public static final String COL_TB_D_RG_CPF = "rg_cpf";
    public static final String COL_TB_D_CNH_CPF = "cnh_cpf";
    public static final String COL_TB_D_CTPS_CPF = "ctps_cpf";
    public static final String COL_TB_D_PASSAPORTE_CPF = "passaporte_cpf";
    public static final String COL_TB_D_RNE_CPF = "rne_cpf";
    public static final String COL_TB_D_STATUS_ENVIO = "st_envio";
    public static final String COL_TB_D_PK_ORCAMENTO_TITULAR = "pk_orcamento_titular";

    // Colunas da Tabela Status Op...
    public static final String COL_TB_ST_OP_ID = "id_status_op";
    public static final String COL_TB_ST_OP_TIPO_ARQUIVO = "tipo_arquivo";
    public static final String COL_TB_ST_OP_TIPO_USUARIO = "tipo_usuario";
    public static final String COL_TB_ST_OP_STATUS = "status";
    public static final String COL_TB_ST_OP_COD_ORCAMENTO = "cod_orcamento";
    public static final String COL_TB_ST_OP_COD_USUARIO = "cod_usuario";

    // Colunas da Tabela Tipos de documentos...
    public static final String COL_TB_DOCS_ID = "id_tipos_documentos";
    public static final String COL_TB_DOCS_CD_TIPO_DOCUMENTO = "cd_tipo_documento";
    public static final String COL_TB_DOCS_FL_TIPO_USUARIO = "fl_tipo_usuario";
    public static final String COL_TB_DOCS_NM_DOCUMENTO = "nm_documento";
    public static final String COL_TB_DOCS_DS_DOCUMENTO = "ds_documento";
    public static final String COL_TB_DOCS_FL_OBRIGATORIO = "fl_obrigatorio";
    public static final String COL_TB_DOCS_FL_CPF = "fl_cpf";
    public static final String COL_TB_DOCS_Ds_ERRO = "ds_erro";

    public static final String CREATE_TABELA_ORCAMENTOS = "CREATE TABLE " + TABELA_OCAMENTOS + "(" +
            COL_TB_O_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_TB_O_COD_CONS + " TEXT, " +
            COL_TB_O_DT_STATUS + " TEXT, " +
            COL_TB_O_DS_SENHA_SMS + " TEXT, " +
            COL_TB_O_CD_VENDEDOR + " TEXT, " +
            COL_TB_O_DT_INICIO + " TEXT, " +
            COL_TB_O_FL_STATUS + " TEXT, " +
            COL_TB_O_DS_ERRO + " TEXT, " +
            COL_TB_O_NU_CONTROLE + " TEXT, " +
            COL_TB_O_DT_DIGITACAO + " TEXT, " +
            COL_TB_O_NM_VENDEDOR + " TEXT, " +
            COL_TB_O_NU_ORCAMENTO + " TEXT, " +
            COL_TB_O_NM_USUARIO + " TEXT, " +
            COL_TB_O_TIPO_CONTRATO + " TEXT, " +
            COL_TB_O_CPF_TITULAR + " TEXT);";

    public static final String CREATE_TABELA_TITULAR = "CREATE TABLE " + TABELA_TITULAR + "(" +
            COL_TB_T_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_TB_T_CPF_TITULAR + " TEXT, " +
            COL_TB_T_CPF + " TEXT, " +
            COL_TB_T_RG + " TEXT, " +
            COL_TB_T_CNH + " TEXT, " +
            COL_TB_T_CTPS + " TEXT, " +
            COL_TB_T_PASSAPORTE + " TEXT, " +
            COL_TB_T_RNE + " TEXT, " +
            COL_TB_T_RG_CPF + " TEXT, " +
            COL_TB_T_CNH_CPF + " TEXT, " +
            COL_TB_T_CTPS_CPF + " TEXT, " +
            COL_TB_T_PASSAPORTE_CPF + " TEXT, " +
            COL_TB_T_RNE_CPF + " TEXT, " +
            COL_TB_T_AGUA + " TEXT, " +
            COL_TB_T_LUZ + " TEXT, " +
            COL_TB_T_TELEFONE + " TEXT, " +
            COL_TB_T_CARTAO + " TEXT, " +
            COL_TB_T_TV + " TEXT, " +
            COL_TB_T_INTERNET + " TEXT, " +
            COL_TB_T_STATUS_ENVIO + " TEXT, " +
            COL_TB_T_PK_ORCAMENTO + " TEXT, " +
            "FOREIGN KEY (" + COL_TB_T_PK_ORCAMENTO + ") REFERENCES " + TABELA_OCAMENTOS + "(" + COL_TB_O_NU_ORCAMENTO + "));";

    public static final String CREATE_TABELA_DEPENDENTE = "CREATE TABLE " + TABELA_DEPENDENTE + "(" +
            COL_TB_D_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_TB_D_COD_DEPENDENTE + " TEXT, " +
            COL_TB_D_CPF + " TEXT, " +
            COL_TB_D_RG + " TEXT, " +
            COL_TB_D_CNH + " TEXT, " +
            COL_TB_D_CTPS + " TEXT, " +
            COL_TB_D_PASSAPORTE + " TEXT, " +
            COL_TB_D_RNE + " TEXT, " +
            COL_TB_D_RG_CPF + " TEXT, " +
            COL_TB_D_CNH_CPF + " TEXT, " +
            COL_TB_D_CTPS_CPF + " TEXT, " +
            COL_TB_D_PASSAPORTE_CPF + " TEXT, " +
            COL_TB_D_RNE_CPF + " TEXT, " +
            COL_TB_D_STATUS_ENVIO + " TEXT, " +
            COL_TB_D_PK_ORCAMENTO_TITULAR + " TEXT, " +
            "FOREIGN KEY (" + COL_TB_D_PK_ORCAMENTO_TITULAR + ") REFERENCES " + TABELA_TITULAR + "(" + COL_TB_T_PK_ORCAMENTO + "));";

    public static final String CREATE_TABELA_STATUS_OP = "CREATE TABLE " + TABELA_STATUS_OP + "(" +
            COL_TB_ST_OP_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_TB_ST_OP_TIPO_ARQUIVO + " TEXT, " +
            COL_TB_ST_OP_TIPO_USUARIO + " TEXT, " +
            COL_TB_ST_OP_STATUS + " TEXT, " +
            COL_TB_ST_OP_COD_ORCAMENTO + " TEXT, " +
            COL_TB_ST_OP_COD_USUARIO + " TEXT);";

    public static final String CREATE_TABELA_TIPOS_DOCS = "CREATE TABLE " + TABELA_TIPOS_DOCS + "(" +
            COL_TB_DOCS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_TB_DOCS_CD_TIPO_DOCUMENTO + " TEXT, " +
            COL_TB_DOCS_FL_TIPO_USUARIO + " TEXT, " +
            COL_TB_DOCS_NM_DOCUMENTO + " TEXT, " +
            COL_TB_DOCS_DS_DOCUMENTO + " TEXT, " +
            COL_TB_DOCS_FL_OBRIGATORIO + " TEXT, " +
            COL_TB_DOCS_FL_CPF + " TEXT, " +
            COL_TB_DOCS_Ds_ERRO + " TEXT);";
}
