
package Menu_;

public class Juego {
    
    
    public void  InicializarMatriz(int matriz[][]) 
     {
        
          
          
          for (int i=0; i<3; i++)
          {
              
              for (int j=0; j<3; j++)
              {
               
                  matriz[i][j] = 0;
                  
              }
          }
             
      
     
   
     }
        
  public int vectorh1( int matriz[][] )
  {
      int sum=0;
      
     
         
           for (int y=0; y<3; y++)
      {
          
          sum = sum + matriz[0][y];
          
      }
          
      
      
      
      return sum;
  }
  
  
  
    public int vectorh2( int matriz[][] )
  {
      int sum=0;
      
      
            for (int y=0; y<3; y++)
      {
          
          sum = sum + matriz[1][y];
          
      }
      
      return sum;
  }
    
    
    
    public int vectorh3( int matriz[][] )
  {
      int sum=0;
      
       for (int y=0; y<3; y++)
      {
          
          sum = sum + matriz[2][y];
          
      }
      
      return sum;
  }
    
    
    
     public int vectorv1( int matriz[][] )
  {
      int sum=0;
      
      
       for (int y=0; y<3; y++)
      {
          
          sum = sum + matriz[y][0];
          
      }
      
      
      return sum; 
  }
     
     
     
    public int vectorv2( int matriz[][] )
  {
      int sum=0;
      
          for (int y=0; y<3; y++)
      {
          
          sum = sum + matriz[y][1];
          
      }
      
      return sum;
  }
    
    
    
     public int vectorv3( int matriz[][] )
  {
      int sum=0;
      
          for (int y=0; y<3; y++)
      {
          
          sum = sum + matriz[y][2];
          
      }
      
      return sum;
  }
     
     
     
     public int diagonal1( int matriz[][] )
  {
      int sum=0;
      
     sum = matriz[0][0] + matriz [1][1] + matriz[2][2];
      
      return sum;
  }
     
     
     
     public int diagonal2( int matriz[][] )
  {
      int sum=0,y=2;
      
      sum = matriz[2][0] + matriz [1][1] + matriz[0][2];
      
      return sum;
  }
    
   
 
    
}
