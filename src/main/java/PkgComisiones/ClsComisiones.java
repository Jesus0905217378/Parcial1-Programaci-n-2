/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PkgComisiones;

/**
 *
 * @author Jesus Alberto
 */
public class ClsComisiones {

    public static String [][] comisiones = new String [7][11];
    
   String Total1="";
   int TotalEnero = 0 , TotalFebrero =0 , TotalMarzo =0, TotalAbril =0 ,Totales=0;
   
    public void DATOS(){
     comisiones [0] [0] = "**NOMBRE**";
     comisiones [0] [1]= "ENE";
     comisiones [0] [2]= "FEB";
     comisiones [0] [3]= "MAR";
     comisiones [0] [4]= "ABR";
     comisiones [0] [5]= "TOTAL";
     comisiones [0] [6]= "20%";
     comisiones [0] [7]= "35%";
     comisiones [0] [8]= "Tot V.C";
     comisiones [0] [9]= "-ISR";
     comisiones [0] [10]= "LIQU";
     
     comisiones [1] [0] = "Mario Perez";
     comisiones [1] [1]="795";//"    795   ";
     comisiones [1] [2]= "825";
     comisiones [1] [3]= "340";
     comisiones [1] [4]= "525";
     comisiones [1] [5]= "000";//TOTAL VENTAS
     comisiones [1] [6]= "000";//20%
     comisiones [1] [7]= "000";//35%
     comisiones [1] [8]= "000";//TOTAL VENTAS Y COM
     comisiones [1] [9]= "000";//QUITAR ISR
     comisiones [1] [10]= "000";//LIQUIDO
     
     comisiones [2] [0] = "Jose Osorio";
     comisiones [2] [1]= "640";
     comisiones [2] [2]= "920";
     comisiones [2] [3]= "210";
     comisiones [2] [4]= "62";
     comisiones [2] [5]= "000";//TOTAL VENTAS
     comisiones [2] [6]= "000";//20%
     comisiones [2] [7]= "000";//35%
     comisiones [2] [8]= "000";//TOTAL VENTAS Y COM
     comisiones [2] [9]= "000";//QUITAR ISR
     comisiones [2] [10]= "000";//LIQUIDO
     
     comisiones [3] [0] = "Maria Ortiz";
     comisiones [3] [1]= "695";
     comisiones [3] [2]= "725";
     comisiones [3] [3]= "527";
     comisiones [3] [4]= "241";
     comisiones [3] [5]= "000";//TOTAL VENTAS
     comisiones [3] [6]= "000";//20%
     comisiones [3] [7]= "000";//35%
     comisiones [3] [8]= "000";//TOTAL VENTAS Y COM
     comisiones [3] [9]= "000";//QUITAR ISR
     comisiones [3] [10]= "000";//LIQUIDO
     
     comisiones [4] [0] = "Sarai Ortiz";
     comisiones [4] [1]= "498";
     comisiones [4] [2]= "648";
     comisiones [4] [3]= "321";
     comisiones [4] [4]= "452";
     comisiones [4] [5]= "000";//TOTAL VENTAS
     comisiones [4] [6]= "000";//20%
     comisiones [4] [7]= "000";//35%
     comisiones [4] [8]= "000";//TOTAL VENTAS Y COM
     comisiones [4] [9]= "000";//QUITAR ISR
     comisiones [4] [10]= "000";//LIQUIDO
     
     comisiones [5] [0] = "Jorge Rueda";
     comisiones [5] [1]= "895";
     comisiones [5] [2]= "1496";
     comisiones [5] [3]= "853";
     comisiones [5] [4]= "745";
     comisiones [5] [5]= "000";//TOTAL VENTAS
     comisiones [5] [6]= "000";//20%
     comisiones [5] [7]= "000";//35%
     comisiones [5] [8]= "000";//TOTAL VENTAS Y COM
     comisiones [5] [9]= "000";//QUITAR ISR
     comisiones [5] [10]= "000";//LIQUIDO
     
     comisiones [6] [0] = "TOTALES-->";
     comisiones [6] [1]= "000";
     comisiones [6] [2]= "000";
     comisiones [6] [3]= "000";
     comisiones [6] [4]= "000";
     comisiones [6] [5]= "000";//TOTAL VENTAS
     comisiones [6] [6]= "   ";//20%
     comisiones [6] [7]= "   ";//35%
     comisiones [6] [8]= "000";//TOTAL VENTAS Y COM
     comisiones [6] [9]= "   ";//QUITAR ISR
     comisiones [6] [10]= "    ";//LIQUIDO 
    }

    public static void imprimirDecorado(){
        for (int x=0; x< comisiones.length;x++){
            System.out.print("|");
             for(int y=0;y < comisiones[x].length;y++){
                 System.out.print(comisiones[x][y]);
                 if (y != comisiones[x].length -1){
                     System.out.print("\t");
                 }
             }
             System.out.println("|");
        }
    }
    
        public void Totales(){
        int total =0;

        for(int i=1; i<6; i++){
           total = total + Integer.parseInt(comisiones[i][1]);
           total = total + Integer.parseInt(comisiones[i][2]);
           total = total + Integer.parseInt(comisiones[i][3]);
           total = total + Integer.parseInt(comisiones[i][4]);
           comisiones[i][5] = String.valueOf(total);
           total=0;
        }
    } 
        
        public void SumMeses(){
            int total1= 0;
            int total2= 0;
            int total3= 0;
            int total4= 0;
            int total5= 0;
            
            for (int i=1; i<6; i++){
                total1 = total1 + Integer.parseInt(comisiones[i][1]);
                total2 = total2 + Integer.parseInt(comisiones[i][2]);
                total3 = total3 + Integer.parseInt(comisiones[i][3]);
                total4 = total4 + Integer.parseInt(comisiones[i][4]);
                total5 = total5 + Integer.parseInt(comisiones[i][5]);
                
            }
            comisiones[6][1] = String.valueOf(total1);
            comisiones[6][2] = String.valueOf(total2);
            comisiones[6][3] = String.valueOf(total3);
            comisiones[6][4] = String.valueOf(total4);
            comisiones[6][5] = String.valueOf(total5);
            
            TotalEnero = total1;   //variables definidias al principio
            TotalFebrero = total2; //con estas variables saco los valores 
            TotalMarzo = total3;   // para operar
            TotalAbril = total4;
            Totales = total5;
        }
        
        public void Porcentajes(){
            int total=0;
            for( int i=1; i<6;i++){
                total = Integer.parseInt(comisiones[i][5]);
                if(total < 2001){
                    total *=0.20;
                    comisiones[i][6] = String.valueOf(total);
                }else{
                    total *=0.35;
                    comisiones[i][7] = String.valueOf(total);
                }
            }
        }
        
        public void TotalVentasyComisiones(){
            int total =0;
            int totalVC=0;

        for(int i=1; i<6; i++){
           total = total + Integer.parseInt(comisiones[i][5]);
           total = total + Integer.parseInt(comisiones[i][6]);
           total = total +Integer.parseInt(comisiones[i][7]);
           
           comisiones[i][8] = String.valueOf(total);
           total=0;
           totalVC = totalVC + Integer.parseInt(comisiones[i][8]);

        }
            comisiones[6][8] = String.valueOf(totalVC);
        }
        public void ISR(){
            int total =0;

           for(int i=1; i<6; i++){
           total = total + Integer.parseInt(comisiones[i][8]);
           total *= 0.05; 
           comisiones[i][9] = String.valueOf(total);
           total=0;
        }
        }
        
        public void Liquido(){
            int total=0;
            
            for(int i=1; i<6; i++){
                total = Integer.parseInt(comisiones[i][8]);
                total = total - Integer.parseInt(comisiones[i][9]);
                comisiones[i][10] = String.valueOf(total);
            }
        }
        
        public void MayorVendedor(){
            int aux1 = 0;
            int aux2 = 0;
            int aux3 = 0;
            int aux4 = 0;
            int aux5 = 0;
            int mayor=0;
            String mejor="";
            aux1 = Integer.parseInt(comisiones[1][10]);
            aux2 = Integer.parseInt(comisiones[2][10]);
            aux3 = Integer.parseInt(comisiones[3][10]);
            aux4 = Integer.parseInt(comisiones[4][10]);
            aux5 = Integer.parseInt(comisiones[5][10]);
            mayor = aux1;
            if(aux2 > mayor){
                mayor=aux2;
            }
            if(aux3 > mayor){
                mayor=aux3;
            }
            if(aux4 > mayor){
                mayor=aux4;
            }
            if(aux5 > mayor){
                mayor=aux5;
            }
               int i = 1;
               while(mayor != Integer.parseInt(comisiones[i][10])){
                i++;
            }
               mejor = comisiones [i][0];
               System.out.println("\n"+"El vendedor que recibio mas es :"+mejor);
               System.out.println("Con un total de :" + mayor+"\n");

        }
        
        public void MenorVendedor(){
            int aux1 = 0;
            int aux2 = 0;
            int aux3 = 0;
            int aux4 = 0;
            int aux5 = 0;
            int menor=0;
            String NoMejor="";
            aux1 = Integer.parseInt(comisiones[1][10]);
            aux2 = Integer.parseInt(comisiones[2][10]);
            aux3 = Integer.parseInt(comisiones[3][10]);
            aux4 = Integer.parseInt(comisiones[4][10]);
            aux5 = Integer.parseInt(comisiones[5][10]);
            menor = aux1;
            if(aux2 < menor){
                menor=aux2;
            }
            if(aux3 < menor){
                menor=aux3;
            }
            if(aux4 < menor){
                menor=aux4;
            }
            if(aux5 < menor){
                menor=aux5;
            }
               int i = 1;
               while(menor != Integer.parseInt(comisiones[i][10])){
                i++;
            }
               NoMejor = comisiones [i][0];
               System.out.println("El vendedor que recibio menos es :"+NoMejor);
               System.out.println("Con un total de :" + menor+"\n");

        }

        
        public void Resultados(){
            
            System.out.println("TOTAL VENTAS ENERO   = "+TotalEnero);
            System.out.println("TOTAL VENTAS FEBRERO = "+TotalFebrero);
            System.out.println("TOTAL VENTAS MARZO   = "+TotalMarzo);
            System.out.println("TOTAL VENTAS ABRIL   = "+TotalAbril);
            System.out.println("VENTAS DEL CUATRIMESTRE = "+Totales);
 
        }
     
}
