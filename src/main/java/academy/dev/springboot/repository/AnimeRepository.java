package academy.dev.springboot.repository;

import academy.dev.springboot.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
