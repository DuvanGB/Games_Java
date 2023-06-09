
package Programas;

public class Matrices
{
  
    public int[][] matriz1 = new int[100][100];
    public int[][] matriz2 = new int[100][100];
    public int[][] resultado = new int[100][100];
    public int tam1 ;
    public int tam2 ;
    public int tam3;

   

    public int getTam1() {
        return tam1;
    }

    public void setTam1(int tam1) {
        this.tam1 = tam1;
    }

   

    public int getTam2() {
        return tam2;
    }

    public void setTam2(int tam2) {
        this.tam2 = tam2;
    }
      public int getTam3() {
        return tam3;
    }

    public void setTam3(int tam3) {
        this.tam3 = tam3;
    }

   
    
      public void suma()
    {
       for (int i=0; i < tam1; i++) 
       {
             for (int j=0; j < tam2; j++) 
             {
                resultado [i][j] = matriz1[i][j] + matriz2[i][j];
              }
        }
    }

  

    public void resta()
    { 
       for (int i=0; i < tam1; i++) 
       {
             for (int j=0; j < tam2 ; j++) 
             {
                resultado [i][j] = matriz1[i][j] - matriz2[i][j];
              }
        } 
    }
    
    public void multiplicacion()
    {
        for (int x=0; x < tam1; x++) 
        {
            for (int y=0; y < tam2; y++) 
            {
                 for (int z=0; z< tam2 ; z++)
                    {
                        resultado [x][y]+= matriz1[x][z]* matriz2[z][y]; 
                    }
             }
        }
     
    }
    public void transpuesta()
    {
         for (int i=0; i < tam1; i++) 
       {
             for (int j=0; j < tam2 ; j++) 
             {
                resultado [j][i] = matriz1[j][i];
              }
        } 
    }
}
