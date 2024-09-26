package Empresa;

public class empresa {
	
	    // atributos
	    String nome;
	    String cpf;
	    String endereco;
	    String email;

	    // construtor
	    empresa(String nome, String cpf, String endereco, String email) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.endereco = endereco;
	        this.email = email;
	    }
	}

	// pessoa juridica
	class pessoajuridica {
	    // atributos
	    String nome;
	    String cnpj;
	    String endereco;
	    String email;

	    // inicia os atributos
	    pessoajuridica(String nome, String cnpj, String endereco, String email) {
	        this.nome = nome;
	        this.cnpj = cnpj;
	        this.endereco = endereco;
	        this.email = email;
	    }
	}

	// representa funcionario
	class Funcionario {
	    // atributos
	    String nome;
	    String cpf;
	    String endereco;
	    double salario;

	    //inicia os atributos
	    Funcionario(String nome, String cpf, String endereco, double salario) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.endereco = endereco;
	        this.salario = salario;
	    }
	

	// executa o programa
	
	    public static void main(String[] args) {
	        // objetos pessoa fisica
	        empresa pf1 = new empresa("Ryan Rezani", "881.123.442-69", "R. germano, 777", "rezani@email.com");
	        empresa pf2 = new empresa("Aryalice Lopes", "157.667.210-19", "R. villa, 421", "aryfoxzinha@email.com");

	        // objetos pessoa juridica
	        pessoajuridica pj1 = new pessoajuridica("Ecomolde", "12.345.678/0001-90", "Av. Wika Mores, 710", "ecomolde@gmail.com");
	        pessoajuridica pj2 = new pessoajuridica("TecVal", "98.765.432/0001-01", "Av. Trabalhadores, 197", "tecval@hotmail.com");

	        // objetos funcionario
	        Funcionario f1 = new Funcionario("Deolane", "244.171.157-69", "R. carandiru, 344", 1899.00);
	        Funcionario f2 = new Funcionario("Ana Maria Braga", "212.333.444-45", "Rua F, 222", 2499.00);

	        // mostra os dados das pessoas  
	        System.out.println("Pessoa Física 1: " + pf1.nome + ", " + pf1.cpf + ", " + pf1.endereco + ", " + pf1.email);
	        System.out.println("Pessoa Física 2: " + pf2.nome + ", " + pf2.cpf + ", " + pf2.endereco + ", " + pf2.email);
	        
	        // mostra os dados juridicos
	        System.out.println("Pessoa Jurídica 1: " + pj1.nome + ", " + pj1.cnpj + ", " + pj1.endereco + ", " + pj1.email);
	        System.out.println("Pessoa Jurídica 2: " + pj2.nome + ", " + pj2.cnpj + ", " + pj2.endereco + ", " + pj2.email);
	        
	        // mostra os dados dos funcionarios
	        System.out.println("Funcionário 1: " + f1.nome + ", " + f1.cpf + ", " + f1.endereco + ", Salário: " + f1.salario);
	        System.out.println("Funcionário 2: " + f2.nome + ", " + f2.cpf + ", " + f2.endereco + ", Salário: " + f2.salario);
	    }
	}



