package HC_Desafio06.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Pedido implements Faturavel{
    private Long id;
    private LocalDate dataPedido;
    private Orcamento orcamento;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<PedidoItens> pedidoItens;

    @Override
    public LocalDate getDataFatura() {
        return this.dataPedido;
    }

    @Override
    public BigDecimal getValorTotalFaturamento() {
        BigDecimal valorTotal = BigDecimal.ZERO;

        for(int i=0; i <=this.pedidoItens.size(); i++) {
            valorTotal = valorTotal.add(this.pedidoItens.get(i).getValorTotal());
        }
        return valorTotal;
    }

    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public Vendedor getVendedor() {
        return this.vendedor;
    }

    public Pedido(Long id, LocalDate dataPedido, Orcamento orcamento, Cliente cliente, Vendedor vendedor, List<PedidoItens> pedidoItens) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.orcamento = orcamento;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.pedidoItens = pedidoItens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<PedidoItens> getPedidoItens() {
        return pedidoItens;
    }

    public void setPedidoItens(List<PedidoItens> pedidoItens) {
        this.pedidoItens = pedidoItens;
    }
}
