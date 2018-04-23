/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas Dumont das Neves R.A 22117010-3
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Caminhoes extends Veic{ 
        /**objeto caminhoes que herda caracteristicas 
         * basicas de Veic como a posição(x,y) que é aleatoria e a velocidade(vel)
         * que no caso é igual a 1, alem de ter uma caracteristica unica como a carga(carg).
         */
	private int carg;
	
	public Caminhoes(int x, int y,int Vel, boolean fab){
           
		super(x,y,1,false);
	}
}
