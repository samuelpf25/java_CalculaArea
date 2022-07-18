/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculaarea;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Principal {
    public static void main(String[] args){
        //Calculando área
        String opcao = JOptionPane.showInputDialog("Calcular área de Retângulo(1) ou do Triângulo Retângulo(2)");
        
        //verificar se entrada está correta
        while (!opcao.equals("1") && !opcao.equals("2")){
            opcao = JOptionPane.showInputDialog("Digite somente o número das opções -> Calcular área de Retângulo(1) ou do Triângulo Retângulo(2)");
        }
        
        
        
        double resultado=0.0;
        try{
            //entrada de dados
            double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:"));
            double h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura:"));
            
            //cálculos
            if (opcao.equals("1")){
                Retangulo ret = new Retangulo();
                resultado = ret.calcularArea(b, h);
            }else if (opcao.equals("2")){
                TrianguloRet tri = new TrianguloRet();
                resultado = tri.calcularArea(b, h);
            }  
            
            //exibindo resultado
            JOptionPane.showMessageDialog(null, "Área = " + String.valueOf(resultado));
        }catch(RuntimeException erro){
            System.out.print("Ocorreu o seguinte erro: " + erro.getMessage());
        }

    }
}
