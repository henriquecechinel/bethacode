package HC_Desafio06.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Faturado {
    private Long id;
    private Faturavel faturavel;
    private Cliente cliente;
    private LocalDate dataFatura;
    private BigDecimal valorTotal;

    public Faturado(Long id, Faturavel faturavel, Cliente cliente, LocalDate dataFatura, BigDecimal valorTotal) {
        this.id = id;
        this.faturavel = faturavel;
        this.cliente = cliente;
        this.dataFatura = dataFatura;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Faturavel getFaturavel() {
        return faturavel;
    }

    public void setFaturavel(Faturavel faturavel) {
        this.faturavel = faturavel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataFatura() {
        return dataFatura;
    }

    public void setDataFatura(LocalDate dataFatura) {
        this.dataFatura = dataFatura;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getTotalAplicandoDescontoCliente(){
        BigDecimal valorInicial = this.valorTotal;
        BigDecimal descontoCliente = this.cliente.getPercentualDescontoMaximo();
        BigDecimal valorDescontoCliente = valorInicial.multiply(descontoCliente);
        BigDecimal totalComDescontoCliente = valorInicial.subtract(valorDescontoCliente);

        return totalComDescontoCliente;
    }

    public BigDecimal getTotalComissaoVendedor(){
        BigDecimal percentComissao = this.faturavel.getVendedor().getPercentualComissao();
        BigDecimal comissao = this.valorTotal.multiply(percentComissao);

        return comissao;
    }
}
