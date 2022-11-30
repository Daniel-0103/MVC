package br.edu.filmes.mvcfilmes.controller;

import br.edu.filmes.mvcfilmes.model.filmes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class controlerfilmes {

    private static final List<filmes> filmes = new ArrayList<filmes>();

    public controlerfilmes() {
        filmes.add(new filmes("terror","O exorcista"));
        filmes.add(new filmes("romance","O diario de uma paixão"));
    }

    @GetMapping
    public String getAlunos(Model model)
    {
        model.addAttribute("filmes", filmes);
        return "filmes";

    }
}
