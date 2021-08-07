package HC_Desafio06.model;

import java.math.BigDecimal;

public class VendaBalcaoItens extends Itens{

    public VendaBalcaoItens(Long id, Vendavel vendavel, BigDecimal desconto, Integer quantidade, BigDecimal valorTotal) {
        super(id, vendavel, desconto, quantidade, valorTotal);
    }
}
