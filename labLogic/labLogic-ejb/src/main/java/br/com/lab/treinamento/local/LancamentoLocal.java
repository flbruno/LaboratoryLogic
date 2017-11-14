package br.com.lab.treinamento.local;

import java.io.Serializable;
import javax.ejb.Local;

/**
 *
 * @author furlan
 */
@Local
public interface LancamentoLocal extends Serializable {
    
    String teste();
}
