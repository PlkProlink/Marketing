/*
 * Todos direitos reservados a Tiago Dias de Souza.
 */
package br.com.tiagods.controller;

import static br.com.tiagods.view.RelatorioView.pnModulos;
import static br.com.tiagods.view.RelatorioView.pnPrincipal;
import static br.com.tiagods.view.RelatorioView.pnTarefas;
import static br.com.tiagods.view.RelatorioView.pnTarefasFiltro;
import static br.com.tiagods.view.RelatorioView.rbTarefas;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
/**
 *
 * @author Tiago
 */
public class ControllerRelatorios {
 	
	JCheckBox[] filtroOu;
	JCheckBox[] filtroE;
	
	public void iniciar(){
		definirAcoes();
		rbTarefas.setSelected(true);
		processar();
	}
	private void definirAcoes(){
		
	}
	private void esconderPainel(Container container){
		for(Component c : container.getComponents()){
			if(c instanceof JPanel)
				((JPanel)c).setVisible(false);
		}
		pnModulos.setVisible(true);
	}
	
	private void processar(){
		if(rbTarefas.isSelected()){
			processarTarefa();
		}
	}
	private void processarTarefa(){
		esconderPainel(pnPrincipal);
		pnTarefas.setVisible(true);
		recriarFiltro(pnTarefasFiltro);
//		
//		if(rbTarefasDetalhes.isSelected()){
//
//			processarDetalhes();
//		}
//		else
		
	}
	private void recriarFiltro(Container container){
		Component[] components = container.getComponents();
		for(Component c : components){
			if(c instanceof JScrollPane){
				JViewport viewPort = ((JScrollPane)c).getViewport();
				recriarFiltro(viewPort);
			}
			else if(c instanceof JPanel){
				recriarFiltro((JPanel)c);
			}
			else if(c instanceof JCheckBox){
				((JCheckBox)c).setSelected(true);
			}
		}
	}
}
