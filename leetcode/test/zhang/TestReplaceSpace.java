package leetcode.test.zhang;

import org.w3c.dom.stylesheets.LinkStyle;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TestReplaceSpace {
    class Solution {
        public String replaceSpace(String s) {
          StringBuilder ss = new StringBuilder();
          for( Character character : s.toCharArray()){
              if (character  == ' ')  ss.append("%20");
            else ss.append(character);
          }
          return ss.toString();
        }
    }

    public static void main(String[] args) {
         String s = new String(" ");
         String s1 =  s.replace(" ", "%20");
         System.out.println(s1);
    }
}