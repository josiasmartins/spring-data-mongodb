package springmongodb.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import springmongodb.springmongodb.model.Funcionario;

import java.util.List;

public interface FuncionaRepository extends MongoRepository<Funcionario, String> {

    // customizar os métodos do mongoRepository
    @Query("{ $and: [ { 'idade': { $gt: ?0 } }, { 'idade': { $lt: ?1 } } ] }")
    public List<Funcionario> obterFuncionariosPorRangeIdade(Integer de, Integer ate);

    public List<Funcionario> findByNome(String nome);
}
