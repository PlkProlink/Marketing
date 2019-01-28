package br.com.tiagods.repository.interfaces;

import br.com.tiagods.model.ProtocoloEntrada;
import br.com.tiagods.model.Usuario;
import br.com.tiagods.repository.Paginacao;
import br.com.tiagods.repository.helpers.filters.ProtocoloEntradaFilter;
import javafx.util.Pair;

import java.time.LocalDate;
import java.util.List;

public interface ProtocoloEntradaDAO {
    ProtocoloEntrada save(ProtocoloEntrada p);
    void remove(ProtocoloEntrada p);
    List<ProtocoloEntrada> getAll();

    Pair<List<ProtocoloEntrada>,Paginacao> filtrar(Paginacao paginacao, ProtocoloEntradaFilter filter);
}