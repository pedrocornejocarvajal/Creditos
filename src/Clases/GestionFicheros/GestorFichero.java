package Clases.GestionFicheros;

import Clases.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorFichero {


    public static final String SEPARADOR = " ";


    public static Cliente leerFicheroV2(String nombreFichero){
        try {
            FileInputStream fis = new FileInputStream(nombreFichero);
            ObjectInputStream obs = new ObjectInputStream(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }


    public static List<Cliente> leerFichero(String nombreFichero) {

        List<Cliente> clientes = new ArrayList<>();
        String[] partes;
        try {
            BufferedReader input = new BufferedReader(new FileReader(nombreFichero));
            String dato = input.readLine();
            while (dato != null) {
                partes = dato.split(SEPARADOR);
                Cliente c =new Cliente(Integer.parseInt(partes[0]), partes[1],partes[2],partes[3],Integer.parseInt(partes[4]),Integer.parseInt(partes[5]),Integer.parseInt(partes[6]), partes[7],Integer.parseInt(partes[8]));
                clientes.add(c);
                dato = input.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Fallo en la lectura");
        }
        return clientes;
    }

}
