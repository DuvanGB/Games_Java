
package Programas;

public class Resistencias
{  
    public int color1=0;
    public int color2=0;
    public int multiplic=0;
    public int tol=0;
    public int negro[]={0,0,0};
    public int cafe[]={10,1,1,0};
    public int rojo[]={20,2,2,1};
    public int naranja[]={30,3,3};
    public int amarillo[]={40,4,4};
    public int verde[]={5,5,5};
    public int azul[]={6,6,6};
    public int morado[]={7,7,7};
    public int gris[]={8,8,8};
    public int blanco[]={9,9,9};
    public float dorado;
    public float plateado;

    
    public void Banda1()
    {
        if (negro==negro)
        {
            color1=color1+(negro[0]*10);
        }
        else if(cafe==cafe)
        {
          color1=color1+(cafe[0]*10);
        }
        else if(rojo==rojo)
        {
          color1=color1+(rojo[0]*10);
        }    
        else if(naranja==naranja)
        {
          color1=color1+(naranja[0]*10);
        }
        else if(amarillo==amarillo)
        {
          color1=color1+(amarillo[0]*10);
        }
        else if(verde==verde)
        {
          color1=color1+(verde[0]*10);
        }
        else if(azul==azul)
        {
          color1=color1+(azul[0]*10);
        }
        else if(morado==morado)
        {
          color1=color1+(morado[0]*10);
        }
        else if(gris==gris)
        {
          color1=color1+(gris[0]*10);
        }
        else if(blanco==blanco)
        {
          color1=color1+(blanco[0]*10);
        }
    }
    public void Banda2()
    {
        if (negro==negro)
        {
            color2=color2+(negro[1]*1);
        }
        else if(cafe==cafe)
        {
          color2=color2+(cafe[1]*1);
        }
        else if(rojo==rojo)
        {
          color2=color2+(rojo[1]*1);
        }    
        else if(naranja==naranja)
        {
          color2=color2+(naranja[1]*1);
        }
        else if(amarillo==amarillo)
        {
          color2=color2+(amarillo[1]*1);
        }
        else if(verde==verde)
        {
          color2=color2+(verde[1]*1);
        }
        else if(azul==azul)
        {
          color2=color2+(azul[1]*1);
        }
        else if(morado==morado)
        {
          color2=color2+(morado[1]*1);
        }
        else if(gris==gris)
        {
          color2=color2+(gris[1]*1);
        }
        else if(blanco==blanco)
        {
          color2=color2+(blanco[1]*1);
        }
    }
    public void Multiplicador()
    {
        if (negro==negro)
        {
            multiplic=multiplic+((color1+color2)*1);
        }
        else if(cafe==cafe)
        {
          multiplic=multiplic+((color1+color2)*10);
        }
        else if(rojo==rojo)
        {
          multiplic=multiplic+((color1+color2)*100);
        }    
        else if(naranja==naranja)
        {
          multiplic=multiplic+((color1+color2)*1000);
        }
        else if(amarillo==amarillo)
        {
          multiplic=multiplic+((color1+color2)*10000);
        }
        else if(verde==verde)
        {
          multiplic=multiplic+((color1+color2)*100000);
        }
        else if(azul==azul)
        {
          multiplic=multiplic+((color1+color2)*1000000);
        }
        else if(plateado==plateado)
        {
          multiplic=multiplic+((color1+color2)*(1/10));
        }
        else if(dorado==dorado)
        {
          multiplic=multiplic+((color1+color2)*(1/100));
        }
    }
    public void Tolerancia()
    {
        if (cafe==cafe)
        {
            tol=1;
        }
        else if(rojo==rojo)
        {
          tol=2;
        }
        else if(dorado==dorado)
        {
          tol=5;
        }    
        else if(plateado==plateado)
        {
          tol=10;
        }
    }
}
