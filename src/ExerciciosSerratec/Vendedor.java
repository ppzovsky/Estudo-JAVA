package ExerciciosSerratec;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }
    private double percComissao;
    private int totalVendas;

    public double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double valorvendas(){
        return totalVendas*100;
    }
    public double comissao(){
        return (percComissao/100) * valorvendas();
    }
    @Override
    public String toString() {
        return super.toString() +
                String.format("""
                        Total de Vendas: %d
                        Valor da Comissao: %.2f
                        """, totalVendas, comissao());
    }
}
