package com.dealtracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealReader {

    static Pattern code = Pattern.compile("DealCode:\\s*(.*)");
    static Pattern date = Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    static Pattern discount = Pattern.compile("Discount:\\s*(\\d+)%");
    static Pattern min = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    public static List<Deal> read(String file) throws Exception {

        List<Deal> list = new ArrayList<>();

        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        String c=null,d=null,di=null,m=null;

        while ((line = br.readLine()) != null) {

            Matcher mc = code.matcher(line);
            Matcher md = date.matcher(line);
            Matcher mdi = discount.matcher(line);
            Matcher mm = min.matcher(line);

            if (mc.matches()) c = mc.group(1);
            if (md.matches()) d = md.group(1);
            if (mdi.matches()) di = mdi.group(1);
            if (mm.matches()) m = mm.group(1);

            if (c!=null && d!=null && di!=null && m!=null) {
                LocalDate till = LocalDate.parse(d,
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                list.add(new Deal(c,Integer.parseInt(di),
                        Integer.parseInt(m), till));

                c=d=di=m=null;
            }
        }

        br.close();
        return list;
    }
}

