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
import java.util.Timer;
import java.util.TimerTask;


public class Carros extends Veic{
	private int numPass;
	/**objeto Carros que herda caracteristicas basicas de Veic 
         * como a posição(x,y) e a velocidade(vel) que no caso é igual a 2,
         * e tambem tem caracteristica unica o numero de passageiros(numPass).
         */
	public Carros(int x, int y,int Vel, boolean fab){
		super(x,y,2,false);
	}
}