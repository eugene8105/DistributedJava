package edu.wctc.zodiakdemo;

import edu.wctc.zodiakdemo.entity.Month;
import org.springframework.stereotype.Service;

@Service
public class JsonMonthService implements MonthService {
    private Month[] monthArray;

    @Override
    public Month[] getMonth() {
        return new Month[0];
    }
}
