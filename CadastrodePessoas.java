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
    
        public static Scanner leitor = new Scanner(System.in);
        public static List<Pessoa> estudante = new ArrayList<Pessoa>();
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
        System.out.println("   3 - Remover Pessoa)");
        System.out.println("   4 - Editar Pessoa)");
        System.out.println("   5 - Listar Pessoas");
	System.out.println("   6 - SAIR DO SISTEMA");
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
			RemoverPessoa();
			break;
                        
                case 4:
			edicaopessoa();
			break;
                        
                case 5:
			Listar();
			break;
                        
                case 6:
			sairsistema();
			break;
		}
       
        }
    }
 
     private static void RemoverPessoa(){
        System.out.println("Qual o nome da pessoa que deseja remover?");
        String name = leitor.next();
        Integer position = procuranome(estudante, name);
        if(position != null){
            estudante.remove(position.intValue());
        }
    }
     
     private static void edicaopessoa(){
        System.out.println("Qual o nome que deseja editar?");
        String name = leitor.next();
        Integer position = procuranome(estudante, name);
        if(position != null){
            Pessoa pep = estudante.get(position.intValue());
            System.out.println("Qual é o novo nome?");
            name = leitor.next();
            //studants.get(position.intValue()).name = name;
            pep.nome = name;
        }
    }

    public static void cadastrop(List<Pessoa> estudante) {
        
        Scanner leitor = new Scanner(System.in);
        Pessoa p = new Pessoa();
        
        System.out.println("Digite o nome da pessoa que você deseja cadastrar!");
        p.nome = leitor.next();
        System.out.println("Digite a idade da pessoa que você deseja cadastrar!");
        p.Idade = leitor.nextInt();
        System.out.println("Digite o sexo da pessoa que você deseja cadastrar!");
        p.nome = leitor.next();
        estudante.add(p);
        System.out.println("Cadastrado a pessoa com sucesso ");
         
    }
    
    private static void Listar() {
        int countM = 0;
        int countF = 0;
        for(int i = 0; i < estudante.size(); i++){
            if(estudante.get(i).Sexo.equals("Masculino")){
                countM++;
            }else{
                countF++;
            }
        }    
        System.out.println("Mascuclino " + countM );
    }
    
     private static Integer procuranome(List<Pessoa> studants, String nomeEstudante) {
           Integer posicao = null;
        for(int count = 0; count < studants.size(); count++){
            Pessoa student = studants.get(count);
            if(student.nome.equals(nomeEstudante)){
                posicao = count;
                System.out.println("Encontrei o " + nomeEstudante);
            }
        }
        return posicao;
    }
     
    public static void sairsistema()
     {
       System.out.println("Obrigado por utiliza o programa, até a proxima");
       System.exit(0);
     }
    
}
