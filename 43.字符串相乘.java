import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public Map<Character,Integer> asc=new HashMap<>();
    {
        asc.put('0', 0);
        asc.put('1', 1);
        asc.put('2', 2);
        asc.put('3', 3);
        asc.put('4', 4);
        asc.put('5', 5);
        asc.put('6', 6);
        asc.put('7', 7);
        asc.put('8', 8);
        asc.put('9', 9);
    }
    public String multiply(String num1, String num2) {
        Stack<Integer> n1=new Stack<>();
        Stack<Integer> n2=new Stack<>();
        LinkedList<Integer> res=new LinkedList<>();
        for(char c:num1.toCharArray()){
            n1.push(asc.get(c));
        }
        for(char c:num2.toCharArray()){
            n2.push(asc.get(c));
        }
        while(!n1.empty()||!n2.empty()){
        }
    }
}
// @lc code=end

