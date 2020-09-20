package edu.wctc.distjavazodiac.service;

import edu.wctc.distjavazodiac.entity.Birthday;
import edu.wctc.distjavazodiac.entity.Fortune;
import edu.wctc.distjavazodiac.entity.Horoscope;

import java.util.List;

public interface HoroscopeService {
    Horoscope getHoroscope(Birthday birthday);
    List<Fortune> getFortune();
}
