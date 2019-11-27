
package JavaAula46_1;

public interface BancoDeDados extends SqlDCL,SqlDDL,SqlDML{
    void abrirConexao();
    void fecharConexao();
}
