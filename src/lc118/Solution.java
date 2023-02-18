package lc118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> LL = new ArrayList<>();
        List<Integer> L = new ArrayList<>();
        L.add(1);
        LL.add(L);
        if(numRows==1) return LL;
        return null;
    }

    public static void main(String[] args) {
        System.out.println("1234");
    }
}
