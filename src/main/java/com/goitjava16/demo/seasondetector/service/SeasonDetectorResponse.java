package com.goitjava16.demo.seasondetector.service;

import lombok.Data;

@Data
public class SeasonDetectorResponse {
    private Error error;
    private Season season;
}
