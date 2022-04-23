package springmongodb.springmongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmongodb.springmongodb.model.Funcionario;
import springmongodb.springmongodb.repository.FuncionaRepository;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    // Autowired: injeção de dependencias
    @Autowired
    private FuncionaRepository funcionaRepository;

    @Override
    public List<Funcionario> obterTodos() {
        return this.funcionaRepository.findAll();
    }

    @Override
    public Funcionario obterPorCodigo(String codigo) {
        return this.funcionaRepository
                .findById(codigo)
                .orElseThrow(() -> new IllegalArgumentException("Funcionario não existe"));
    }

    @Override
    public Funcionario criar(Funcionario funcionario) {

        Funcionario chefe = this.funcionaRepository
                .findById(funcionario.getChefe().getCodigo())
                .orElseThrow(() -> new IllegalArgumentException("Chefe inexistente."));

        return this.funcionaRepository.save(funcionario);
    }
}
