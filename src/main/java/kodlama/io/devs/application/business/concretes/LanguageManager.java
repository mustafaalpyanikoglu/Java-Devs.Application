package kodlama.io.devs.application.business.concretes;

import kodlama.io.devs.application.business.abstracts.LanguageService;
import kodlama.io.devs.application.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.application.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public void add(Language language) throws Exception {
        List<Language> languages = languageRepository.getAll();
        for (Language item:languages){
            if(item.getName() == language.getName()){
                throw new Exception("Böyle bir programlama adı zaten var.");
            }
        }
        languageRepository.add(language);
        System.out.println("Programlama dili eklendi.");
    }

    @Override
    public void delete(int id) throws Exception {
        if(id >= 0){
            languageRepository.delete(id);
            System.out.println("Dil başarıyla silindi.");
        }
        else{
            throw new Exception("Böyle bir id mevcut değil.");
        }
    }

    @Override
    public void update(Language language) throws Exception {
        List<Language> languages = languageRepository.getAll();
        for (Language item:languages){
            if(item.getName() == language.getName()){
                throw new Exception("Böyle bir programlama adı zaten var.");
            }
        }
        languageRepository.update(language);
        System.out.println("Programlama dili güncellendi.");
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }
}
