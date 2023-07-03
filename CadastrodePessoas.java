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
        
        while (opcao < 8) {
            menuPrincipal();
            opcao = leitor.nextInt();
            limparTela();
            if (opcao > 4) {
		limparTela();
		System.out.println("***** VALOR INVÁLIDO ***** \n");
		opcao = 0;
            } else {
		mudarAtividade(opcao);
                    }

		}
	limparTela();
	System.out.println("Obrigado por utilizar o Sistema!");
	leitor.close();
        
       
    }
    
    public static void mudarAtividade(int opcao) {
		switch (opcao) {
		case 1:
			cadastrop();
			break;
		case 2:
			//buscap(estudante);
			break;
		case 3:
			//removerp();
			break;
		case 4:
			//sairsistema();
			break;
		}

	}
    
    public static void menuPrincipal() {
		System.out.println("\n\n==============================================");
		System.out.println("=============== MENU PRINCIPAL ===============");
		System.out.println("==============================================\n");
		System.out.println("Selecione uma das opções abaixo: \n");
		System.out.println("   1 - Cadastrar Pessoa");
		System.out.println("   2 - Buscar Pessoa)");
		System.out.println("   3 - Remover Pessoa");
		System.out.println("   4 - SAIR DO SISTEMA");
		System.out.println("_____________________________________________");
		System.out.println(" Informe o número da opção desejada: ");

	}
    
    public static void limparTela() {
		try {
			for (int cont = 0; cont < 20; cont++) {
				System.out.println("\n");
			}
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}
    
    public static void cadastrop() {
        
        limparTela();
        List<Pessoa> estudante = new ArrayList<Pessoa>();
        Scanner leitor = new Scanner(System.in);
        Pessoa p = new Pessoa();
        
        System.out.println("Digite o nome da pessoa que você deseja cadastrar!");
        p.nome = leitor.next();
        estudante.add(p);
        System.out.println("Cadastrado a pessoa com sucesso " + p.nome);
         
    }
    
    private static void buscap(List<Pessoa> estudante, String estudantenome) {
        
       }  
    
}
