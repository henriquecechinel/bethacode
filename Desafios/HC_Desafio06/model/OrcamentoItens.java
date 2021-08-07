package HC_Desafio06.model;

import java.math.BigDecimal;

public class OrcamentoItens extends Itens{

    public OrcamentoItens(Long id, Vendavel vendavel, BigDecimal desconto, Integer quantidade, BigDecimal valorTotal) {
        super(id, vendavel, desconto, quantidade, valorTotal);
    }
}
