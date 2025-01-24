package com.example.querodoar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5174")
@RequestMapping("/livros")  // Mudando o caminho base para algo mais específico
public class LivroController {

    private List<Livro> livrosDoados = new ArrayList<>();

    // Endpoint para exibir mensagem inicial
    @GetMapping("/")
    public String home() {
        return "Bem-vindo ao sistema de doação de livros!";
    }

    // Endpoint para doar o livro
    @PostMapping("/doar")
    public ResponseEntity<String> doarLivro(@RequestBody Livro livro) {
        // Recebe o objeto Livro enviado pelo frontend (JSON)
        if (livro.getTitulo() == null || livro.getCategoria() == null || livro.getAutor() == null || livro.getImagem() == null) {
            return new ResponseEntity<>("Todos os campos devem ser preenchidos", HttpStatus.BAD_REQUEST);
        }

        System.out.println("Livro doado: " + livro.getTitulo());
        System.out.println("Categoria: " + livro.getCategoria());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Link da Imagem: " + livro.getImagem());
        
        livrosDoados.add(livro);
        
        // Retorna uma resposta com status HTTP 200 (OK)
        return new ResponseEntity<>("Livro doado com sucesso!", HttpStatus.OK);
    }

    // Endpoint para listar todos os livros doados
    @GetMapping("/doar")
    public ResponseEntity<List<Livro>> listarLivros() {
        return new ResponseEntity<>(livrosDoados, HttpStatus.OK);
    }

    // Tratamento de erros
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleError(Exception e) {
        return new ResponseEntity<>("Houve um erro ao processar a sua solicitação: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
