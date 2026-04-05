// Last updated: 4/5/2026, 1:39:11 PM
class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows == 1){
            return encodedText;
        }
    
            StringBuilder s = new StringBuilder();
            int cols = encodedText.length()/rows;
            int pt = 0;
            char[][] matrix = new char[rows][cols];
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    matrix[i][j] = encodedText.charAt(pt);
                    pt++;
                }
            }
            for(int i = 0; i < cols; i++){
                int col = i;
                int row = 0;
                while(row < rows && col < cols){
                    s.append(matrix[row][col]);
                    row++;
                    col++;
                }
            }
            
            return s.toString().stripTrailing();          
           
          
        }
    }
