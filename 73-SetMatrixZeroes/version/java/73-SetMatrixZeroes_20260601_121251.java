// Last updated: 6/1/2026, 12:12:51 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        HashSet<Integer> row = new HashSet<>();
4        HashSet<Integer> col = new HashSet<>();
5
6        for(int i = 0; i < matrix.length; i++){
7            for(int j = 0; j < matrix[i].length; j++){
8                if(matrix[i][j] == 0){
9                    row.add(i);
10                    col.add(j);
11                }
12            }                    
13        }
14
15        for(int i = 0; i < matrix.length; i++){
16    for(int j = 0; j < matrix[i].length; j++){
17        if(row.contains(i) || col.contains(j)){
18            matrix[i][j] = 0;
19        }
20    }
21}
22
23      
24        }
25    }
26