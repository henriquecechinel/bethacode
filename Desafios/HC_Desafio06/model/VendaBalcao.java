package HC_Desafio06.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VendaBalcao implements Faturavel{
    private Long id;
    private LocalDate dataPedido;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<VendaBalcaoItens> vendaBalcaoItens;

    @Override
    public LocalDate getDataFatura() {
        return this.dataPedido;
    }

    @Override
    public BigDecimal getValorTotalFaturamento() {
        BigDecimal valorTotal = BigDecimal.ZERO;

        for(int i=0; i <=this.vendaBalcaoItens.size(); i++) {
            valorTotal = valorTotal.add(this.vendaBalcaoItens.get(i).getValorTotal());
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

    public VendaBalcao(Long id, LocalDate dataPedido, Cliente cliente, Vendedor vendedor, List<VendaBalcaoItens> vendaBalcaoItens) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vendaBalcaoItens = vendaBalcaoItens;
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<VendaBalcaoItens> getVendaBalcaoItens() {
        return vendaBalcaoItens;
    }

    public void setVendaBalcaoItens(List<VendaBalcaoItens> vendaBalcaoItens) {
        this.vendaBalcaoItens = vendaBalcaoItens;
    }
}
