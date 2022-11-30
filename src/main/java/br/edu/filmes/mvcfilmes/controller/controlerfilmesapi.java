package br.edu.filmes.mvcfilmes.controller;

import br.edu.filmes.mvcfilmes.model.filmes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class controlerfilmesapi {


    private static final List<filmes> filmes = new ArrayList<filmes>();

    public controlerfilmesapi() {

        filmes.add(new filmes("terror", "O exorcista"));
        filmes.add(new filmes("romance", "O diario de uma paixão"));
    }

    @GetMapping
    public List<filmes> getAlunos(){
        return filmes;
    }

}
