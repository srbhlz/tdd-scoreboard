package com.example;

public class ScoreBoard {
    public String getTennisScore(int points1, int points2) {
        String score = null;
        switch(points1) {
            case 0: score = "Love-all";    break;
            case 1: score = "Fifteen-all"; break;
            case 2: score = "Thirty-all";  break;
        }
        return score;
    }
}
