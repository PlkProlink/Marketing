/*
 * Todos direitos reservados a Tiago Dias de Souza.
 */
package br.com.tiagods.controller;

import static br.com.tiagods.view.MenuView.jDBody;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import br.com.tiagods.view.EmpresasView;
import br.com.tiagods.view.InicioView;
import br.com.tiagods.view.MenuView;
import br.com.tiagods.view.NegociosView;
import br.com.tiagods.view.PessoasView;
import br.com.tiagods.view.TarefasSaveView;
import br.com.tiagods.view.TarefasView;

/**
 *
 * @author User
 */
public class ControllerMenu implements ActionListener, MouseListener{
    InicioView inicio;
    EmpresasView empresas;
    PessoasView pessoas;
    TarefasSaveView tarefasSave;
    TarefasView tarefas;
    NegociosView negocios;
        
    static ControllerMenu instance;
    
    public static ControllerMenu getInstance(){
    	if(instance==null){
    		instance = new ControllerMenu();
    	}
    	return instance;
    }
    
    public void iniciar(){
    	inicio = new InicioView();
        abrirCorpo(inicio);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	switch(e.getActionCommand()){
    	case "Tarefas":
    		tarefas = new TarefasView(new Date(), new Date(), UsuarioLogado.getInstance().getUsuario());
    		abrirCorpo(tarefas);
    		break;
    	case "TarefasSave":
    		tarefasSave = new TarefasSaveView(null,null,MenuView.getInstance(),true);
    		tarefasSave.setVisible(true);
    		break;
    	default:
    		break;
    	}
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    	switch(e.getComponent().getName()){
    	case "Inicio":
	        inicio = new InicioView();
	        abrirCorpo(inicio);
            break;
        case "Empresas":
        	empresas = new EmpresasView(null);
            abrirCorpo(empresas);
            break;
        case "Tarefas":
            tarefas = new TarefasView(new Date(), new Date(), UsuarioLogado.getInstance().getUsuario());
            abrirCorpo(tarefas);
            break;
        case "TarefasSave":
        	tarefasSave = new TarefasSaveView(null,null,MenuView.getInstance(),true);
        	tarefasSave.setVisible(true);
        	break;
        case "Negocios":
        	negocios = new NegociosView(null);
        	abrirCorpo(negocios);
            break;
        case "Pessoas":
            pessoas = new PessoasView(null);
            abrirCorpo(pessoas);
        	break;
        default:
        	JOptionPane.showMessageDialog(jDBody, "Esse modulo esta em fase de desenvolvimento, aguarde...!","Modulo em Desenvolvimento!",JOptionPane.OK_OPTION);
        	break;
    	}
    }
    @Override
    public void mousePressed(MouseEvent e) {
    	new UnsupportedOperationException();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    	new UnsupportedOperationException();
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    	new UnsupportedOperationException();
    }
    @Override
    public void mouseExited(MouseEvent e) {
    	new UnsupportedOperationException();
    }
    
    public static void abrirCorpo(JInternalFrame jframe){
        jDBody.removeAll();
        ((BasicInternalFrameUI)jframe.getUI()).setNorthPane(null);
        jDBody.add(jframe);
        jframe.setVisible(true);
    }

    
}
