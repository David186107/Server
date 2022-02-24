/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

//git log (ver cambuios)
//git pull (subir cambios de todos)
//git push (subir mis cambios)
//soy la onda Crespo

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//Crespo Estuvo aqui
/**
 *
 * @author david
 */
public class Conexion {
    //Aqui hare una conexion 
    static int Puerto = 0; //Se modificara luego, por el momento lo dejare asi
    InetAddress Direccion = null; //se dara una direccion luego
    static byte [] BF = new byte[1024];
    //Puerto y BF me decia que debian estar estaticos, luego puedo cambiarlo si hay problemas con esto
    public static void Principal(){
        try {
            DatagramSocket SocketUDP = new DatagramSocket(Puerto);
            DatagramPacket Peticion = new DatagramPacket(BF, BF.length);
        } catch (Exception e) {
        }
    }
    
    //corroborarlo
    public static int GetPuerto(int puerto){
        //a
        return puerto;
    }
    public static InetAddress GetDireccion(InetAddress Direccion){
        
        return Direccion;
    }
    public static void SetLista(){
        
    }
    public static void SetDatosObjeto(String nombre){
        //Busqueda del objeto por el nombre y 
        //luego ya encontrado sera enviada ña informacion de sus datos
    }
    public static void SetFaltante(){
        //el Cliente enviara peticion para datos que falten, desde TODOS hasta UN paquete
        //este enviara dato a dato
    }
}
