package kodlama.io.devs.application.dataAccess.concretes;

import kodlama.io.devs.application.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.application.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;
    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"C#"));
        languages.add(new Language(2,"Java"));
        languages.add(new Language(3,"JavaScript"));
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        languages.remove(id-1);
    }

    @Override
    public void update(Language language) {
        for (Language item:languages){
            if(item.getId() == language.getId()){
                item.setId(language.getId());
                item.setName(language.getName());
            }
        }
    }

    @Override
    public Language getById(int id) {
        Language language = new Language();
        for (Language item:languages){
            if(item.getId() == id){
                language.setId(item.getId());
                language.setName(item.getName());
            }
        }
        return language;
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }
}
