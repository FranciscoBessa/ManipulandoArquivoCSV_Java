/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package importarcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class ImportarCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //abre um arquivo e cria um file
       File arquivoCSV = new File("C:\\Users\\Francisco\\OneDrive\\Área de Trabalho\\arquivo.csv");
     
        try{
            
            //cria um scanner para ler o arquivo
            Scanner leitor = new Scanner(arquivoCSV);
            
            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivo = new String();
            //leitor.nextLine();  //ignora a primeira linha
            
            //percorre todo o arquivo
            while(leitor.hasNext()){
                
                //recebe cada linha do arquivo
                linhasDoArquivo = leitor.nextLine();
                
                //separa os campos entre as virgulas de cada linha
                String[] valoresEntreVirgulas = linhasDoArquivo.split(";");
                
                //imprime a coluna que quiser, no exemplo imprime a coluna 1, 2  e 3 da tabela.
                System.out.println(valoresEntreVirgulas[0] + " - " +  valoresEntreVirgulas[1]  + " - " +  valoresEntreVirgulas[2] + " - " +  valoresEntreVirgulas[3]);
                // 
              
                
                //System.out.println(linhasDoArquivo); //imprime todo o arquivo
                
            }
        
        }catch(FileNotFoundException e){
            
        }
        
    }
    
}
