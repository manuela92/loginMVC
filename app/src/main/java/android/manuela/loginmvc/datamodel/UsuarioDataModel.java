package android.manuela.loginmvc.datamodel;

import android.util.Log;

public class UsuarioDataModel {

    public static final String TABELA="usuario";
    public static final String ID="id";
    public static final String NOME="nome";
    public static final String EMAIL="email";
    public static final String SENHA="senha";
    public static String queryCriarTabela="";
    public static String criarTabela(){

        queryCriarTabela += "CREATE TABLE "+TABELA+"(";
        queryCriarTabela += ID+" int primary key autoincrement";
        queryCriarTabela += NOME+" text, ";
        queryCriarTabela += EMAIL+" text, ";
        queryCriarTabela += SENHA+" text";
        queryCriarTabela += ")";

        Log.i("tabela", "criarTabela: " + queryCriarTabela);
        return queryCriarTabela;
    }
}
