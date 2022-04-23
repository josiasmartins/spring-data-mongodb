package springmongodb.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import springmongodb.springmongodb.model.Funcionario;

public interface FuncionaRepository extends MongoRepository<Funcionario, String> {


}
