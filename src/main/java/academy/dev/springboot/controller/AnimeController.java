package academy.dev.springboot.controller;


import academy.dev.springboot.domain.Anime;
import academy.dev.springboot.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
public class AnimeController {
    private DateUtil dateUtil;

    public AnimeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @GetMapping(path = "list")
    public List <Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));

        return List.of(new Anime("DB-GT"), new Anime("Attack On Titan"));
    }
}
