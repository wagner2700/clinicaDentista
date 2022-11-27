package controller;


import Model.Dentista;
import Service.DentistaService;
import dao.ConfiguracaoJDBC;
import dao.impl.DentistaDAOH2;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/dentista")
public class DentistaController {

    private DentistaService dentistaService = new DentistaService(new DentistaDAOH2(new ConfiguracaoJDBC()));

    @PostMapping("/salvar")
    public Dentista salvar(@RequestBody Dentista dentista)  {
        return dentistaService.salvar(dentista);
    }


    @GetMapping("{id}")
    public Dentista teste(@PathVariable Integer id){
       System.out.println("teste");
    //public Dentista buscarPorId(@PathVariable Integer id)  {
       // return dentistaService.buscarPorId(id);

        return null;
    }
}
