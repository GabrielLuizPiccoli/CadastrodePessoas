/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrodepessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class CadastrodePessoas {
    

    public static void main(String[] args) {
       
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);
        List<Pessoa> estudante = new ArrayList<Pessoa>();
        
        while (opcao < 4) {
        System.out.println("\n\n==============================================");
	System.out.println("=============== MENU PRINCIPAL ===============");
	System.out.println("==============================================\n");
	System.out.println("Selecione uma das opções abaixo: \n");
	System.out.println("   1 - Cadastrar Pessoa");
	System.out.println("   2 - Buscar Pessoa)");
	System.out.println("   3 - SAIR DO SISTEMA");
	System.out.println("_____________________________________________");
	System.out.println(" Informe o número da opção desejada: ");
        opcao = leitor.nextInt();
                
                switch (opcao) {
		case 1:
			cadastrop(estudante);
			break;
		case 2:
                         System.out.println("Qual o nome que deseja buscar?");
                        String nameToFind = leitor.next();
			procuranome(estudante,nameToFind);
			break;
		case 3:
			sairsistema();
			break;
		}
       
        }
    }
 
    public static void cadastrop(List<Pessoa> estudante) {
        
        Scanner leitor = new Scanner(System.in);
        Pessoa p = new Pessoa();
        
        System.out.println("Digite o nome da pessoa que você deseja cadastrar!");
        p.nome = leitor.next();
        estudante.add(p);
        System.out.println("Cadastrado a pessoa com sucesso ");
         
    }
    
     private static void procuranome(List<Pessoa> studants, String nomeEstudante) {

        for(int count = 0; count < studants.size(); count++){
            Pessoa student = studants.get(count);
            if(student.nome.equals(nomeEstudante)){
                System.out.println("Encontrei o " + nomeEstudante);
            }
        }
    }
     
    public static void sairsistema()
     {
       System.out.println("Obrigado por utiliza o programa, até a proxima");
       System.exit(0);
     }
    
}
