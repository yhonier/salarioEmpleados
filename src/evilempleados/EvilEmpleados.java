/*
La empresa Evil Corp desea reguistar 10 empleados 
con los atributos: id-nombre-cargo-horas semanales--salario

con cargos:
desarrolladorjr 
valor hora 25000

desarrollador sr
valor hora70000

vendedor:
valor hora
30000

se desea diseñar menu
1. Agregar empleado
2.Buscar empleado
3.Mostrar empleados
4.Calcular salario

 */
package evilempleados;

import java.util.Scanner;

import empleado.Empleado;


public class EvilEmpleados {


    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System.in);
        
        int opcion;
        
        Empleado[] empleados= new Empleado[10];
        int contador=0;
        
        do{
        
            System.out.println("Bienvenido\n*******************");
            
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Buscar Empleado");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Calcular salario");
            System.out.println("5. Salir \n\n\n");
            
            opcion=entrada.nextInt();
            
            
            switch (opcion){
            
                case 1:
                    System.out.println("Registro de empleado\n______________\n");
                    
                    empleados[contador]=new Empleado();
                    System.out.println("Digite el nombre: ");
                    empleados[contador].setNombre(entrada.next());
                    
                    System.out.println("Digite el cargo: ");
                    empleados[contador].setCargo(entrada.next());
                    
                     System.out.println("Digite el las horas semananales: ");
                    empleados[contador].setHorasemananes(entrada.nextDouble());
                                        
                    empleados[contador].setSalario(0);
                    
                    contador++;
                    break;
                    
                case 2:
                     System.out.println("Entro a la opcion 2");
                    break; 
                
                
                case 3:
                     System.out.println("Base de datos empleados\n");
                     
                     for (int i=0;i<contador;i++){
                         
                         
                         System.out.println(
                                                               
                                 empleados[i].getNombre()+
                                 empleados[i].getCargo()+
                                 empleados[i].getHorasemananes()        
                         );
                     
                         
                       
                     }
                     
                    break; 
                
                
                case 4:
                    
                     break;
                
                
                case 5:
                    System.exit(0);
                    break;
                
                
                
                default:
                   break;     
                
                
            
            }
        
        }
        
        while(opcion !=5);
        
      /*for (int i=0; i<10;i++){
        
        System.out.println("Por favor ingrese el id del empleado: ");
        String id= entrada.next();
        
        
        System.out.println("Por favor ingrese nombre del empleado: ");
        String nombre= entrada
                .next();
       
        
        
       }*/
     
    }
    
          public void jugar(){
        
        }
          
    
}
