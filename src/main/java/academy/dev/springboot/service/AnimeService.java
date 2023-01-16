package academy.dev.springboot.service;

import academy.dev.springboot.domain.Anime;
import academy.dev.springboot.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService implements AnimeRepository {
    public List<Anime> listAll(){
        return List.of(new Anime(1L,"DB-GT"), new Anime(2L, "Attack On Titan"));
    }


}
