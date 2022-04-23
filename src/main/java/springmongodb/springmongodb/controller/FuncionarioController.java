package springmongodb.springmongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springmongodb.springmongodb.model.Funcionario;
import springmongodb.springmongodb.service.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> obterTodos() {
        return this.funcionarioService.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Funcionario obterPorCodigo(@PathVariable String codigo) {
        return this.funcionarioService.obterPorCodigo(codigo);
    }

    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario) {
        return this.funcionarioService.criar(funcionario);
    }

    @GetMapping("/range")
    public List<Funcionario> obterFuncionariosPorRangeIdade(
            @RequestParam("de") Integer de,
            @RequestParam("ate") Integer ate
    ) {
        return  this.funcionarioService.obterFuncionariosPorRangeIdade(de, ate);
    }

    @GetMapping("/por-nome")
    public List<Funcionario> obterFuncionariosPorNome(
            @RequestParam("nome") String nome
    ) {
        return this.funcionarioService.obterFuncionariosPorNome(nome);
    }
}
