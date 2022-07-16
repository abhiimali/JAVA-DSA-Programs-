class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oC = image[sr][sc]; //Original color
        if(oC==color){ //If the same so we don't make any change
            return image;
        }
        dfsChange(image,sr,sc,oC,color);
        return image;
        
        
    }
    
     public void dfsChange(int[][] image, int i, int j, int oC, int color){
        //Verify if is out of the box or if in that position is not the same color so we finish 
        if(j<0 || i<0 || i==image.length || j==image[0].length ||  image[i][j]!=oC){
            return;
        }
        image[i][j]=color; //We change the color
        
		//The next are the 4 direction possibles
        dfsChange(image, i, j+1 , oC , color); //Right
        dfsChange(image, i+1, j , oC , color); //Bottom
        
        dfsChange(image, i , j-1 , oC , color ); //Left
        dfsChange(image, i-1 , j , oC , color); //Top
            
    }

}