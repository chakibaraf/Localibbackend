package fr.chakib.formation.spring.localibback.Location;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("")
    public List<Location> findAll() {
        return locationService.findAll();
    }

    @PostMapping("")
    public Location save(@RequestBody Location entity) {
        return locationService.save(entity);
    }

    @GetMapping("{id}")
    public Location findById(@PathVariable String id) {
        return locationService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        locationService.deleteById(id);
    }
}