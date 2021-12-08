/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasOrdenadas;

/**
 *
 * @author vicsa
 */
public class InsercionLista {
    
    private nodo cabeza;
    
    public InsercionLista(){
        cabeza=null;
    }
    public void insertarNodo(int x){
        nodo nuevo= new nodo(x);
        
        nodo num1;
        nodo num2;
        
        if(cabeza==null){
            cabeza=nuevo;
            nuevo.sig = null;
        }else{
            num1=cabeza;
            while(num1!=null){
                num2=num1.sig;
                
                if(nuevo.dato<=num1.dato){
                    nuevo.sig=cabeza;
                    cabeza=nuevo;
                    break;
                }else{
                    if(nuevo.dato>num1.dato && num2==null){
                        num1.sig=nuevo;
                        nuevo.sig=null;
                        break;
                    }else{
                        if(num1.dato<nuevo.dato && num2.dato>=nuevo.dato){
                            num1.sig=nuevo;
                            nuevo.sig=num2;
                            break;
                        }else{
                            num1=num1.sig;
                        }
                    }
                }
            }
        }
    }
    public void imprimirLista(){
        nodo saltar;
        saltar=cabeza;
        
        while(saltar!=null){
            System.out.print(saltar.dato+", ");
            saltar=saltar.sig;
        }
    }
    public static void main(String[] args){
        InsercionLista lista= new InsercionLista();
        lista.insertarNodo(5);
        lista.insertarNodo(1);
        lista.insertarNodo(8);
        lista.insertarNodo(3);
        lista.insertarNodo(2);
        lista.insertarNodo(6);
        lista.insertarNodo(4);
        lista.insertarNodo(7);
        lista.imprimirLista();
    }
}




