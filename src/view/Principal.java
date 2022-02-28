package view;

import javax.swing.*;

import controller.OperacoesController;

public class Principal {
	public static void main(String[] args) {
		
	
	OperacoesController opCont = new OperacoesController();
	
	int[] vet1000 = new int [1000];
	int[] vet10000 = new int [10000];
	int[] vet100000 = new int [100000];
	int opc;
	
	opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opçao: \n1- Vetor 1000 \n2- Vetor 10000 \n3- Vetor 100000 \n4- Todos"));
	
	switch(opc){
	case 1: opCont.pVet1000(vet1000);
	break;
	case 2: opCont.pVet10000(vet10000);
	break;
	case 3: opCont.pVet100000(vet100000);
	break;
	case 4: opCont.pVet1000(vet1000);
	        opCont.pVet10000(vet10000);
	        opCont.pVet100000(vet100000);
	break;
	default: JOptionPane.showMessageDialog(null, "Opção Inválida!");
	break;
	}
	
//	opCont.pVet1000(vet1000);
//	opCont.pVet10000(vet10000);
//	opCont.pVet100000(vet100000);
	
    }
}
