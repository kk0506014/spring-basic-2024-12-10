package com.ll.basic.domain.wiseSaying.wiseSaying.repository;

import com.ll.basic.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Repository
public class WiseSayingRepository {
    private final List<WiseSaying> wiseSayings;
    private long lastId;

    public WiseSayingRepository() {
        this.lastId = 0;
        this.wiseSayings = new ArrayList<>();
    }

    public List<WiseSaying> findAll() {
        return wiseSayings
                .stream()
                .sorted(Comparator.comparing(WiseSaying::getId).reversed())
                .toList();
    }

    public Optional<WiseSaying> findById(long id) {
        return wiseSayings
                .stream()
                .filter(wiseSaying -> wiseSaying.getId() == id)
                .findFirst();
    }

    public boolean deleteById(long id) {
        return wiseSayings.removeIf(wiseSaying -> wiseSaying.getId() == id);
    }

    public void save(WiseSaying wiseSaying) {
        if (wiseSaying.isNew()) {
            wiseSaying.setId(++lastId);
            wiseSayings.add(wiseSaying);
        }
    }
}