package kodlama.io.devs.application.business.abstracts;

import kodlama.io.devs.application.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    void add(Language language) throws Exception;
    void delete(int id) throws Exception;
    void update(Language language) throws Exception;
    Language getById(int id);
    List<Language> getAll();
}
