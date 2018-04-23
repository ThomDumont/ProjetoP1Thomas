/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;



public class Motos extends Veic{
	private String model;
	/**objeto Carros que herda caracteristicas basicas de Veic como a posição(x,y) 
         * e a velocidade(vel) que no caso é igual a 3, e tambem tem caracteristica unica,
         * o modelo da moto(model).
         */
	public Motos(int x, int y, int Vel, boolean fab){
            super(x,y,3,false);
		
	}
}
