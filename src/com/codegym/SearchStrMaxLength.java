package com.codegym;

import java.util.ArrayList;

public class SearchStrMaxLength {

    public static String searchStrMaxLength(String str) {
        ArrayList<Character> list = new ArrayList<>();
        char[] c = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            int j = 1;
            if (c[i] < c[j + i]) {
                list.add(c[i]);
                if(i == str.length() - 2){
                    list.add(c[str.length() - 1]);
                    break;
                }
            } else if (str.length() > 3) {
                if (c[i] < c[j + i + 1]) {
                    list.add(c[i]);
                    i = j + i;
                    if(i == str.length() - 2) {
                        list.add(c[str.length() - 1]);
                    }
                } else {
                    list.add(c[i]);
                    i = str.length();
                }
            } else {
                break;
            }
        }

        for (char r : list) {
            result.append(r);
        }

        return result.toString();
    }


}
