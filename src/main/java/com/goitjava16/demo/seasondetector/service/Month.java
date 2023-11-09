package com.goitjava16.demo.seasondetector.service;

import lombok.Getter;

public enum Month {
    january(Season.winter),
    february(Season.winter),
    march(Season.spring),
    april(Season.spring),
    may(Season.spring),
    june(Season.summer),
    july(Season.summer),
    august(Season.summer),
    september(Season.autumn),
    october(Season.autumn),
    november(Season.autumn),
    december(Season.winter);

    @Getter
    private Season season;

    Month(Season season) {
        this.season = season;
    }
}
