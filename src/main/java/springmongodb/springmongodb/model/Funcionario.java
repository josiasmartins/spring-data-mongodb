package springmongodb.springmongodb.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
// @Document: represeta o documento do mongodb: registro
@Document
public class Funcionario {

    @Id
    private String codigo;

    private String nome;

    private Integer idade;

    private BigDecimal salario;

    @DBRef // @DBRef: uma referência de uma collection dentro de outra
    private Funcionario chefe;
}

