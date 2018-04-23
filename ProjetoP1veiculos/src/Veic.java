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



public class Veic{/**classe Veic é a raiz de todos os veiculos 
 * motos carros e caminhoes ela pega todos os
 * valores de x, y, vel, e fab seta manda para o mundo.
 */
        protected int x;
        protected int y;
        protected int Vel;
        private boolean fab;
        int i,j;

        public Veic(int x,int y,int Vel, boolean fab){
                this.x = x;
                this.y = y;
                this.Vel = Vel;
                this.fab = fab;
        }


        public void setVel(int Vel){
                this.Vel = Vel;
        }
        public int getVel(){
                return Vel;
        }

        public void setX(int x){
                this.x = x;
        }
        public void setFab(boolean fab) {
                this.fab = fab;
        }
        public void setY(int y){
                this.y = y;
        }

        public int getX(){
                return x;
        }
        public int getY(){
                return y;
        }
        public boolean getFab() {
                return fab;
        }



        public void move(ArrayList<Motos> moto, ArrayList<Carros> carro, ArrayList<Caminhoes> caminhao, int tipo, boolean fab){
/**metodo move faz todos os veiculos se movimentarem aletariamente pelo mapa alem de permitir 
*tornar o mundo ciclico ou seja quando um veiculo esta no limite de um 
* lado do mapa ele aparece do outro lado (se ele esta no limite do lado esquerdo aparece no direito).
*/
                Random geraRan = new Random();
                int numRan = geraRan.nextInt(4);
                if(numRan==0){
                        y=(y+Vel)%60;
                }
                else if(numRan==1){
                        y=(y-Vel)%60;
                        if(y<0)
                                y=60-Math.abs(y);
                }
                else if(numRan==2){
                        x=(x+Vel)%30;
                }
                else if(numRan==3){
                        x=(x-Vel)%30;
                        if(x<0)
                                x=30-Math.abs(x);
                }

                        dobraVeic(moto, carro, caminhao, tipo, fab);
                        bate(moto, carro, caminhao);
        }


public void dobraVeic(ArrayList<Motos> moto, 
ArrayList<Carros> carro, ArrayList<Caminhoes> caminhao, int tipo, boolean fab)
{/**este metodo dobraVeic consiste em quando um veiculo de qualquer tipo
 * passar pela area delimitada pela fabrica "*" ele vai se 
 * dobrar e nascer em uma posição x, y aletória do mapa.
 */
  int xposRan = (int)(Math.random()*30);
        int yposRan = (int)(Math.random()*60);
        if(x==4 && ((y>5 && y<11) || (y>48 && y<54))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3,false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2,false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1,false));
                                fab = true;
                        }
                }
        }
        else if(x==5 && ((y>5 && y<11) || (y>48 && y<54))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3,false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2,false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1,false));
                                fab = true;
                        }
                }
        }
        else if (x==6 && ((y>5 && y<11) || (y>48 && y<54))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3, false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2, false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1, false));
                                fab = true;
                        }
                }
        }
        else if(x== 13 && ((y>25 && y<31))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3, false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2, false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1, false));
                                fab = true;
                        }
                }
        }
        else if(x==14 && ((y>25 && y<31))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3,false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2,false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1,false));
                                fab = true;
                        }
                }
        }
        else if(x==14 && ((y>25 && y<31))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3,false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2,false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1,false));
                                fab = true;
                        }
                }
        }
        else if(x==15 && ((y>25 && y<31))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3,false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2,false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1,false));
                                fab = true;
                        }
                }
        }
        else if(x==23 && ((y>5 && y<11) || (y>48 && y<54))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3,false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2,false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1,false));
                                fab = true;
                        }
                }
        }
        else if(x==24 && ((y>5 && y<11) || (y>48 && y<54))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3,false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2,false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1,false));
                                fab = true;
                        }
                }
        }
        else if(x==25 && ((y>5 && y<11) || (y>48 && y<54))){
                if(fab == false){
                        if (tipo == 3){ 
                                moto.add(new Motos(xposRan,yposRan,3,false));
                                fab = true;
                        }
                        if (tipo == 2){
                                carro.add(new Carros(xposRan,yposRan,2,false));
                                fab = true;
                        }
                        if (tipo == 1){ 
                                caminhao.add(new Caminhoes(xposRan,yposRan,1,false));
                                fab = true;
                        }
                }
        }
}
public void bate(ArrayList<Motos> moto, ArrayList<Carros> carro, ArrayList<Caminhoes> caminhao){
/**o metodo bate faz com que 1 ou até mesmo 2 veiculos se destruam quando estiverem em uma mesma posição.
 * No caso, para destruir usamos como base uma logica simples que consiste em, 
 * quando dois veiculos do mesmo tipo(exemplo: caminhao e caminhao) entram no mesmo espaco
 * ao mesmo tempo destruimos ambos, se uma moto bater em um carro ou 
 * caminhao apenas ela é destruida em qualquer um dos casos, e se um carro bater em um
 * caminhao apenas o carro sofre perdas.
 */
int i,j;
for(i=0;i<carro.size();i++){///carro X moto = moto - 1
        for(j=0;j<moto.size();j++){
                if(moto.get(j).getX() == carro.get(i).getX() & moto.get(j).getY()== carro.get(i).getY()){

                        moto.remove(j);
                                if(i>0){
                                        i--;
                                }	
                                if(j>0){
                                        j--;
                                }
                        }
                }
        }
for(i=0;i<caminhao.size();i++){///caminhao X moto = moto - 1 
        for(j=0;j<moto.size();j++){
                if(moto.get(j).getX() == caminhao.get(i).getX() & moto.get(j).getY() == caminhao.get(i).getY()){

                        moto.remove(j);
                                if(i>0){
                                        i--;
                                }	
                                if(j>0){
                                        j--;
                                }
                        }
                }
        }
for(i=0;i<caminhao.size();i++){ ///caminhao X carro = carro - 1
        for(j=0;j<carro.size();j++){
                if(carro.get(j).getX() == caminhao.get(i).getX() & carro.get(j).getY() == caminhao.get(i).getY()){

                        carro.remove(j);
                                if(i>0){
                                        i--;
                                }	
                                if(j>0){
                                        j--;
                                }
                        }
                }
        }
for(i=0;i<moto.size();i++){/// moto X moto = moto - 2
        for(j=i+1;j<moto.size()-1;j++){
                if(moto.get(i).getX() == moto.get(j).getX() & moto.get(i).getY() == moto.get(j).getY()){

                        moto.remove(i);
                        moto.remove(j);
                                if(i>0){
                                        i--;
                                }	
                                if(j>0){
                                        j--;
                                }
                        }
                }
        }
for(i=0;i<carro.size();i++){ ///carro X carro = carro - 2
        for(j=i+1;j<carro.size()-1;j++){
                if(carro.get(i).getX() == carro.get(j).getX() & carro.get(i).getY() == carro.get(j).getY()){

                        carro.remove(i);
                        carro.remove(j);
                                if(i>0){
                                        i--;
                                }	
                                if(j>0){
                                        j--;
                                }
                        }
                }
        }
for(i=0;i<caminhao.size();i++){// caminhao X caminhao = caminhao - 2
        for(j=i+1;j<caminhao.size()-1;j++){
                if(caminhao.get(i).getX() == caminhao.get(j).getX() & caminhao.get(i).getY() == caminhao.get(j).getY()){

                        caminhao.remove(i);
                        caminhao.remove(j);
                                if(i>0){
                                        i--;
                                }	
                                if(j>0){
                                        j--;
                                  }
                }
            }
        }		
    }
}