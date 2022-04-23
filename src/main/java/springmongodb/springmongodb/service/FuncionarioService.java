package springmongodb.springmongodb.service;

import springmongodb.springmongodb.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    public List<Funcionario> obterTodos();

    public Funcionario obterPorCodigo(String codigo);

    public Funcionario criar(Funcionario funcionario);

    public List<Funcionario> obterFuncionariosPorRangeIdade(Integer de, Integer ate);

    public List<Funcionario> obterFuncionariosPorNome(String nome);
}
