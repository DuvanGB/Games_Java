
package Programas;


public class CodigosNumericos 
{
    public int numero1;
    public int numero2;
    public int numero3;
    public int result=0;
    public int deci=0;
    public int binario[]=new int[50];
    public String mensaje1="";
    public String mensaje2="";
    public String mensaje3="";
    public int ibin=1;
    public int idec=1;
    public int octal[]=new int[50];
    public int ioct=1;
   

    
    
   
    public void decimalabinario()
    {
      
      ibin=0;
      for(int i=0;i<50;i++)
      {
       
                binario[i]=0; 
      }
                while(numero1!=0)
                {
          
                binario[ibin]= numero1%2;
                numero1= numero1/2;
                ibin ++;
                }
                for(int i=ibin-1;i>0;i--)
                {
                mensaje1=mensaje1+binario[i];
                }
    }   
    public void decimalaoctal()
    {
         
      ioct=0;
      for(int i=0;i<50;i++)
      {
       
                octal[i]=0; 
      }
                while(numero2!=0)
                {
          
                octal[ioct]= numero2%8;
                numero2= numero2/8;
                ioct ++;
                }
                for(int i=ioct-1;i>0;i--)
                {
                mensaje2=mensaje2+octal[i];
                }
    }
    
  
    
    public void binarioadecimal( )
    {  
       int valor=0,exp=0;
                  while(numero3!=0)
                   {
                       valor=numero3%10;
                       result= result+valor*(int )Math.pow(2,exp);
                       exp++;
                       numero3/=10;
                   }
                 mensaje3=mensaje3+result;
                  
                   
    }
    
    public String decimalahexadecimal(int deci)
    {
       return Integer.toHexString(deci);
    }
                       
   
}
