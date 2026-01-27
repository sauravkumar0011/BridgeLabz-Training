package com.chatmessage;

import java.util.*;

public class ChatLogParserApp {

    public static void main(String[] args) throws Exception {

        List<ChatMessage> messages = ChatReader.read("chat.txt");

        MessageFilter<ChatMessage> filter = new IdleFilter();

        Map<String,List<String>> result =
                ChatAnalyzer.group(messages, filter);

        System.out.println(result);
    }
}
