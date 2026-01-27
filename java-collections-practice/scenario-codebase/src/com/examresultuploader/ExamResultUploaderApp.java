package com.examresultuploader;

import java.util.*;

public class ExamResultUploaderApp {

    public static void main(String[] args) {

        try {
            List<ExamRecord<Integer>> records =
                    ResultReader.read("marks.csv");

            Map<String,List<Integer>> subjectMarks =
                    ResultProcessor.subjectMap(records);

            Map<String,Integer> toppers =
                    ResultProcessor.topScorers(subjectMarks);

            System.out.println(subjectMarks);
            System.out.println(toppers);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

