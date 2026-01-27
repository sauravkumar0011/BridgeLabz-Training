package com.dealtracker;

import java.time.*;
import java.util.*;

public class DealManager {

    public static Map<String,Deal> validDeals(List<Deal> deals) {

        Map<String,Deal> map = new HashMap<>();
        Set<String> seen = new HashSet<>();

        for (Deal d : deals) {
            if (d.validTill.isBefore(LocalDate.now())) continue;
            if (seen.add(d.code))
                map.put(d.code, d);
        }

        return map;
    }

    public static List<Deal> sortByDiscount(Collection<Deal> deals) {

        List<Deal> list = new ArrayList<>(deals);

        list.sort((a,b) -> b.benefit - a.benefit);

        return list;
    }
}

