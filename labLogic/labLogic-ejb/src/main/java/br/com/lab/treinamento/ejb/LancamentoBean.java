package br.com.lab.treinamento.ejb;

import br.com.lab.treinamento.local.LancamentoLocal;
import br.com.lab.treinamento.remote.LancamentoRemote;
import javax.ejb.Stateless;

/**
 *
 * @author furlan
 */
@Stateless
public class LancamentoBean implements LancamentoLocal, LancamentoRemote {

    @Override
    public String teste() {
        return "Corinthians";
    }
}
