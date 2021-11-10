package br.com.solid.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario {

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        super(nome, cpf, cargo, salario);
    }

    @Override
    public void atualizarSalario(BigDecimal novoSalario) {
        super.atualizarSalario(novoSalario);
    }

    @Override
    public void promover(Cargo novoCargo) {
        super.promover(novoCargo);
    }


}
