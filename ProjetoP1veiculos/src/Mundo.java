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


public class Mundo{
private int [][]matrmund = new int [30][60];


/**metodo que cria o mundo ja com todas 
 * as posições aleatoriamente setadas.
 */
public void cria(ArrayList<Motos> moto, ArrayList<Carros> carro, ArrayList<Caminhoes> caminhao){
    int i,j;
    for(i=0;i<30;i++){/**matriz que cria o mundo ja com as as fabricas,
     * e para facilitar a visualização do funcionamento do projeto troquei os "1" por "|",
     * os 0 por "-" e os "2" por "*".
     */
        for(j=0;j<60;j++){
            matrmund[i][j] = '-';
            matrmund[i][0] = '|';
            matrmund[i][59] = '|';
            matrmund[0][j] = '|'; 
            matrmund[29][j] = '|';

            if(i==4 && ((j>5 && j<11) || (j>48 && j<54)))
                    matrmund[i][j] = '*';
            else if(i==5 && ((j>5 && j<11) || (j>48 && j<54)))
                    matrmund[i][j] = '*';
            else if (i==6 && ((j>5 && j<11) || (j>48 && j<54)))
                    matrmund[i][j] = '*';
            else if(i== 13 && ((j>25 && j<31)))
                    matrmund[i][j] = '*';
            else if(i==14 && ((j>25 && j<31) ))
                    matrmund[i][j] = '*';
            else if(i==15 && ((j>25 && j<31)))
                    matrmund[i][j] = '*';
            else if(i==23 && ((j>5 && j<11) || (j>48 && j<54)))
                    matrmund[i][j] = '*';
            else if(i==24 && ((j>5 && j<11) || (j>48 && j<54)))
                    matrmund[i][j]=	'*';
            else if(i==25 && ((j>5 && j<11) || (j>48 && j<54)))
                    matrmund[i][j] = '*';
        }
    }

    //bloco de "fors" que inicializa cada um dos 30 veiculos(10 motos, 10 carros e 10 caminhoes) em posiçoes aleatorias.
    for(i=0; i<moto.size();i++){
            matrmund[moto.get(i).getX()][moto.get(i).getY()] = '9';
            }

    for(i=0; i<carro.size();i++){
            matrmund[carro.get(i).getX()][carro.get(i).getY()] = '8';

    }

    for(i=0; i<caminhao.size();i++){
            matrmund[caminhao.get(i).getX()][caminhao.get(i).getY()] = '7';
    }

}

public void imprimeMund(ArrayList<Motos> moto, 	ArrayList<Carros> carro, ArrayList<Caminhoes> caminhao){ 
    /**metodo que imprime o mundo 
     * juntamente com os veiculos.
     */
 
    for(int i=0;i<30;i++){
    System.out.println("");
        for(int j=0;j<60;j++){
            System.out.printf("%c", matrmund[i][j]);

                    }
            }	
    System.out.println("");
    System.out.printf("Motos(9) = %d ", moto.size());
    System.out.printf("Carros(8) = %d ", carro.size());
    System.out.printf("Caminhoes(7) = %d ", caminhao.size());
    System.out.println("");
    }


}
