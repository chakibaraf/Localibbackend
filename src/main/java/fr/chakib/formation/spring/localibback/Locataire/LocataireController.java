package fr.chakib.formation.spring.localibback.Locataire;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/locataires")
public class LocataireController {

    private final LocataireService locataireService;

    public LocataireController(LocataireService locataireService) {
        this.locataireService = locataireService;
    }

    @GetMapping("")
    public List<Locataire> findAll() {
        return locataireService.findAll();
    }

    @PostMapping("")
    public Locataire save(@RequestBody Locataire entity) {
        return locataireService.save(entity);
    }

    @GetMapping("{id}")
    public Locataire findById(@PathVariable String id) {
        return locataireService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        locataireService.deleteById(id);
    }
}