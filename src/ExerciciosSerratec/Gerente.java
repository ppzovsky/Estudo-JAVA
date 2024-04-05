package ExerciciosSerratec;
import ExerciciosSerratec.Funcionario;
public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    private int qtdFuncionariosDepto;
    private int mesesTrabalhados;

    public int getMesesTrabalhados() {
        return mesesTrabalhados;
    }

    public void setQtdFuncionariosDepto(int qtdFuncionariosDepto) {
        this.qtdFuncionariosDepto = qtdFuncionariosDepto;
    }

    public void setMesesTrabalhados(int mesesTrabalhados) {
        this.mesesTrabalhados = mesesTrabalhados;
    }

    public int getQtdFuncionariosDepto() {
        return qtdFuncionariosDepto;
    }

    public double partLucros(){
        return (getSalario()/12)*mesesTrabalhados;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("""
                        Quantidade de Funcionarios no Departamento: %d
                        Participacao nos lucros: %.2f
                        """, qtdFuncionariosDepto, partLucros());
    }
}
