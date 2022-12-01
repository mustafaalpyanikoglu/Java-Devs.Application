package kodlama.io.devs.application.dataAccess.abstracts;

import kodlama.io.devs.application.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    void add(Language language);
    void delete(int id);
    void update(Language language);
    Language getById(int id);
    List<Language> getAll();
}
