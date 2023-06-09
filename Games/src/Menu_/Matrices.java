
package Menu_;
import Menu_.Matriz;

public class Matrices {
    

    
    public int [][] sumar (int filas , int columnas,int matriz[][], int matriz2[][], int matriz3[][])
    {
        
        for(int i=0; i<filas ; i++)
        {
            for(int l=0; l<columnas ; l++)
        {
            matriz3[i][l]= matriz[i][l]+matriz2[i][l];
            
        } 
            
        }
        
        return matriz3;
        
    }
    
    public int [][] restar (int filas , int columnas,int matriz[][], int matriz2[][], int matriz3[][])
    {
          for(int i=0; i<filas ; i++)
        {
            for(int l=0; l<columnas ; l++)
        {
            matriz3[i][l]= matriz[i][l]-matriz2[i][l];
            
        } 
            
        }
       
        return matriz3;
    }
    
    public int [][] multiplicar(int filcolumnas, int matriz[][], int matriz2[][], int matriz3[][])
    {
          for (int i = 0; i < filcolumnas; i++) {
            for (int j = 0; j < filcolumnas; j++) {
                for (int k = 0; k < filcolumnas; k++) {
                   
                    matriz3[i][j] += matriz[i][k] * matriz2[k][j];
                }
            }
        }
        
        return matriz3;
        
    }
    
    public int[][] transpuesta(int filcolumnas, int matriz[][], int matriz2[][], int matriz3[][])
    {
       int aux [][] = new int [filcolumnas][filcolumnas];
        
       for (int i = 0; i < filcolumnas; i++) {
            for (int j = 0; j < filcolumnas; j++) {
                for (int k = 0; k < filcolumnas; k++) {
                   
                    aux[i][j] += matriz[i][k] * matriz2[k][j];
                }
            }
        }
       
      
          for(int x=0;x<filcolumnas ; x++)
        {
            for(int y=0; y<filcolumnas; y++)
        {
          
           matriz3[y][x]=aux[x][y];
          
            
        } 
            
        } 
        
          
        return matriz3;
    }
    
}
