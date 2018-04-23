/**
 *
 *@author Thomas Dumont das Neves R.A 22117010-3
 */
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  


    /**Criação do objeto mundo.
     */ 
     
     
    Mundo mundo = new Mundo();
    System.out.println();
  		
    ArrayList<Caminhoes> caminhao = new ArrayList<>();
    /**Criação do vetor dinamico de caminhoes.
     */	
    ArrayList<Carros> carro = new ArrayList<>();
    /**Criação do vetor dinamico de carros.
     */
    ArrayList<Motos> moto = new ArrayList<>();
    /**Criação do vetor dinamico de motos.
     */
  	
  		
    for(int i=0; i<10; i++){
    /**este for gera posições randomicas para x e y, com isso as motos,
     * os carros e os caminhoes vão nascer em pontos aleatorios do nosso mundo.
     */
     
    	int xmotos = (int)(Math.random() * 30);
    	int xcarros = (int)(Math.random() * 30);
    	int xcaminhoes = (int)(Math.random() * 30);
    	int ymotos = (int)(Math.random() * 60);
  	int ycarros = (int)(Math.random() * 60);
  	int ycaminhoes = (int)(Math.random() * 60);
  	moto.add(new Motos(xmotos,ymotos,3,false));
  	carro.add(new Carros(xcarros,ycarros,2,false));
  	caminhao.add(new Caminhoes(xcaminhoes,ycaminhoes,1,false));
	}
  	mundo.cria(moto, carro, caminhao);
        /**chama um metodo de mundo que cria o mundo ja com todos os
         * veiculos setados aleatoriamente pelo mapa.
         */
  	mundo.imprimeMund(moto, carro, caminhao);
        /**chama um metodo de mundo que imprime o mundo ja com os parametros dos 
         * ArrayLists motos carros e caminhoes respectivamente.
         */
  	
	do{
  	/**for que inicializa o funcionamento do programa fazendo com que os
         * objetos setados em posicoes aleatorias, se movam em aleatoriamente.
         */
            for(int i=0;i<moto.size();i++){ 
                moto.get(i).move(moto, carro, caminhao, 3,false);
            }
            for(int i=0;i<carro.size();i++){
               	carro.get(i).move(moto, carro, caminhao, 2,false);
            }
            for(int i=0;i<caminhao.size();i++){
		caminhao.get(i).move(moto, carro, caminhao, 1, false);
            }
            mundo.cria(moto, carro, caminhao);/**reseta o mundo pegando as novas
             * posiçoes instanciadas pelo metodo move.
             */
            mundo.imprimeMund(moto, carro, caminhao);
            /**imprime o mundo ja com as novas posicoes instaciadas 
             * pelo metodo move.
             */
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{
                Thread.sleep(800);
                /**esta funcao permite "pausar" o programa
                 * a cada instancia de tempo determinada pelo programador.
                 */
		} 
            catch(InterruptedException e){
		}
			
            }while(moto.size() > 0 || carro.size() > 0 );
  }	
}