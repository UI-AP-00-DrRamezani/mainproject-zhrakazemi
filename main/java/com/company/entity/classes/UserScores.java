package com.company.entity.classes;

public class UserScores {
    private GeneralAccount user;
    public double score;
    private Goods good;

    public GeneralAccount getUser() {
        return user;
    }

    public void setUser(GeneralAccount user) {
        this.user = user;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Goods getGood() {
        return good;
    }

    public void setGood(Goods good) {
        this.good = good;
    }
}
