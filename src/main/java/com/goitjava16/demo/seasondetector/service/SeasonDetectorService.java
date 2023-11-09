package com.goitjava16.demo.seasondetector.service;

import org.springframework.stereotype.Service;

@Service
public class SeasonDetectorService {
    public SeasonDetectorResponse detect(String month) {
        if (month == null || month.isBlank()) {
            SeasonDetectorResponse result = new SeasonDetectorResponse();
            result.setError(Error.emptyInput);
            return result;
        }

        try {
            Season season = Month.valueOf(month.toLowerCase()).getSeason();
            SeasonDetectorResponse result = new SeasonDetectorResponse();
            result.setError(Error.ok);
            result.setSeason(season);
            return result;
        } catch (Exception ex) {
            SeasonDetectorResponse response = new SeasonDetectorResponse();
            response.setError(Error.unknownMonth);
            return response;
        }

    }
}
