package com.lafsdev.dsmovie.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lafsdev.dsmovie.entities.Score;
import com.lafsdev.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
