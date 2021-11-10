package br.com.solid.rh.service.promocao;

import br.com.solid.rh.ValidacaoException;
import br.com.solid.rh.model.Cargo;
import br.com.solid.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }
        if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }
        else {
            throw new ValidacaoException("Funcionário não bateu a meta");
        }
    }
}
