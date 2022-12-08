package fr.chakib.formation.spring.localibback.Voiture;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/voitures")
public class VoitureController {
    private final VoitureService voitureService;

    public VoitureController(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GetMapping("")
    public List<Voiture> findAll() {

        return voitureService.findAll();

    }

    @GetMapping("recherche")


    @PostMapping("")
    public Voiture save(@RequestBody Voiture entity) {
        return voitureService.save(entity);
    }

    @GetMapping("{id}")
    public Voiture findById(@PathVariable String id) {
        return voitureService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        voitureService.deleteById(id);
    }
}
