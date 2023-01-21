package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreBoardTest {

    private ScoreBoard board = new ScoreBoard();

    @Test
    void testLoveAll() {
       String score = board.getTennisScore(0, 0);
       assertThat(score).isEqualTo("Love-all");
    }

    @Test
    void testFifteenAll() {
       String score = board.getTennisScore(1, 1);
       assertThat(score).isEqualTo("Fifteen-all");
    }

    @Test
    void testThirtyAll() {
       String score = board.getTennisScore(2, 2);
       assertThat(score).isEqualTo("Thirty-all");
    }
}
