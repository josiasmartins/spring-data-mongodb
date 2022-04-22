package springmongodb.springmongodb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping
    public void obterDados() {

    }

    @GetMapping("/{codigo}")
    public void obterPorCodigo(@PathVariable Long codigo) {

    }

    @PostMapping
    public void criar(@RequestBody Object funcionario) {

    }
}
