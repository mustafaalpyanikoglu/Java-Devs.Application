package kodlama.io.devs.application.webApi.controller;

import kodlama.io.devs.application.business.abstracts.LanguageService;
import kodlama.io.devs.application.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;

    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/add")
    public void add(Language language) throws Exception {
        languageService.add(language);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id",required = true) int id) throws Exception {
        languageService.delete(id);
    }

    @PutMapping("/update")
    public void update(Language language) throws Exception {
        languageService.update(language);
    }

    @GetMapping("/getbyid/{id}")
    public Language getById(@PathVariable(value = "id",required = true) int id){
        return languageService.getById(id);
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }
}
