package HC_Desafio06.model;

import java.time.LocalDate;
import java.util.List;

public class Orcamento {
    private Long id;
    private LocalDate dataPedido;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<OrcamentoItens> orcamentoItens;

    public Orcamento(Long id, LocalDate dataPedido, Cliente cliente, Vendedor vendedor, List<OrcamentoItens> orcamentoItens) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.orcamentoItens = orcamentoItens;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<OrcamentoItens> getOrcamentoItens() {
        return orcamentoItens;
    }

    public void setOrcamentoItens(List<OrcamentoItens> orcamentoItens) {
        this.orcamentoItens = orcamentoItens;
    }
}
