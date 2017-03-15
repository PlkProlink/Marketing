package br.com.tiagods.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import br.com.tiagods.controller.ControllerNegocios;
import br.com.tiagods.model.Negocio;
import br.com.tiagods.view.interfaces.DefaultComboBox;
import br.com.tiagods.view.interfaces.DefaultEnumModel.Modelos;

public class NegociosView extends JInternalFrame {
    /**
	 *
	 */
	private static final long serialVersionUID = 2406280053484370906L;
	public static DefaultComboBox cbAtendente;
    public static DefaultComboBox cbStatus;
    public static DefaultComboBox cbEtapa;
    public static DefaultComboBox cbEmpresa;
    public static DefaultComboBox cbPessoa;
    private javax.swing.JPanel pnVisao;
    public static JPanel pnPrincipal;
    public static JPanel pnAndamento;
    public static JPanel pnServicosContratados;
    @SuppressWarnings("rawtypes")
	public static JComboBox cbObject;
	private JPanel panel;
	private JLabel label;
	public static JDateChooser data2;
	private JLabel label_1;
	public static JDateChooser data1;
	public static JDateChooser dataInicio;
	public static JDateChooser dataFim;
	public static DefaultComboBox cbOrigem;
	public static DefaultComboBox cbCategoria;
	public static DefaultComboBox cbNivel;
	public static DefaultComboBox cbServicos;
	public static DefaultComboBox cbAtendenteCad;
	public static DefaultComboBox cbStatusCad;
	public static DefaultComboBox cbCategoriaCad;
	public static DefaultComboBox cbNivelCad;
	public static DefaultComboBox cbOrigemCad;
	public static DefaultComboBox cbServicosCad;
	public static DefaultComboBox cbServicosAgregados;
	public static JPanel pnAuxiliar;
	public static JPanel pnCadastro;
	private JLabel label_7;
	private JLabel lblDescrio;
	public static JLabel txCodigo;
	public static JTextField txNome;
	public static JLabel txCadastradoPor;
	private JLabel label_16;
	public static JLabel txDataCadastro;
	public static JLabel txContadorRegistros;
	public static JFormattedTextField txHonorario,txValorServico;
	public static JRadioButton rbContato, rbEnvioProposta, rbFollowup, rbFechamento, rbIndefinida;
	public static JButton btnNovo;
	public static JButton btnEditar;
	public static JButton btnSalvar;
	public static JButton btnExcluir;
	public static JButton btnCancelar;
	public static JButton btnHistorico;
	public static JButton btEsconder,btnNovaTarefa;
	public static JButton btAddServicoAgregado,btnCategoriaAdd, btnOrigemAdd,btnNivelAdd,btnServicoAdd;
	private JLabel lbAtendenteCad;
	private JPanel pnPrivacidade;
	public static JCheckBox checkBox;
	public static JCheckBox checkBox_1;
	public static JCheckBox checkBox_2;
	private JLabel label_21;
	public static JLabel txCodObjeto;
	public static JTextField txBuscar;
	public static JTable tbPrincipal, tbAuxiliar;
	public static JButton btAddEmpresaPessoa;
	private JPanel pnTotalizador;
	private JLabel lblValorTotalDe;
	public static JLabel txNomeObjeto;
	public static JTextArea txDescricao;
	public static JScrollPane scrollServicos;
	ControllerNegocios controller = new ControllerNegocios();
	public static JTable tbServicosContratados;
	public static JLabel txIdServicoContratado;
	public static JButton btnNovoServicoAgregado;
	private JLabel lbTitulo;
	public static JButton btnLink,btnEmail,btnImportar,btnExportar,btnVerPerda;
	public static JLabel txIconFone;
	public static JLabel txIconCelular;
	public static JLabel txFone, txCelular;
	public static JTextField txEmail;
	/**
	 * Create the frame.
	 */
	public NegociosView(Negocio negocio) {
		initComponents();
		rbContato.setSelected(true);
		
		controller.iniciar(negocio);
		
		pnPrivacidade.setVisible(false);
		pnTotalizador.setVisible(false);
		btnImportar.setEnabled(false);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() {
        pnVisao = new javax.swing.JPanel();
        pnPrincipal = new javax.swing.JPanel();
        pnPrincipal.setBounds(0, 0, 1240, 60);
        cbAtendente = new DefaultComboBox();
        cbAtendente.setModel(new DefaultComboBoxModel(new String[] {"Atendente"}));
        cbStatus = new DefaultComboBox();
        cbStatus.setModel(new DefaultComboBoxModel(new String[] {"Status"}));
        cbEtapa = new DefaultComboBox();
        cbEtapa.setName("Etapa");
        cbEmpresa = new DefaultComboBox();
        cbEmpresa.setModel(new DefaultComboBoxModel(new String[] {"Empresa"}));
        cbEmpresa.setName("Empresa");
        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(880, 450));

        pnVisao.setBackground(new java.awt.Color(250, 250, 250));

        pnPrincipal.setBackground(new java.awt.Color(250, 250, 250));

        cbAtendente.setBackground(new java.awt.Color(250, 250, 250));
        cbAtendente.setName("Atendente");

        cbStatus.setBackground(new java.awt.Color(250, 250, 250));
        cbStatus.setName("Status");
        cbEtapa.setBackground(new java.awt.Color(250, 250, 250));
        cbEtapa.setModel(new DefaultComboBoxModel(new String[] {"Etapa", "Indefinida", "Contato", "Envio de Proposta", "Follow-up", "Fechamento"}));

        cbEmpresa.setBackground(new java.awt.Color(250, 250, 250));
        
        cbPessoa = new DefaultComboBox();
        cbPessoa.setModel(new DefaultComboBoxModel(new String[] {"Pessoa"}));
        cbPessoa.setName("Pessoa");
        cbPessoa.setBackground(new Color(250, 250, 250));

        panel = new JPanel();
        panel.setBackground(new Color(250, 250, 250));

        label = new JLabel();
        label.setBounds(10, 33, 22, 20);
        label.setText("at\u00E9");
        label.setHorizontalAlignment(SwingConstants.LEFT);

        data2 = new JDateChooser();
        data2.setBounds(36, 33, 100, 20);

        label_1 = new JLabel();
        label_1.setHorizontalAlignment(SwingConstants.LEFT);
        label_1.setBounds(10, 11, 22, 20);
        label_1.setText("de:");

        data1 = new JDateChooser();
        data1.setBounds(36, 11, 100, 20);

        cbOrigem = new DefaultComboBox();
        cbOrigem.setModel(new DefaultComboBoxModel(new String[] {"Origem"}));
        cbOrigem.setName("Origem");
        cbOrigem.setBackground(new Color(250, 250, 250));
        
        cbCategoria = new DefaultComboBox();
        cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"Categoria"}));
        cbCategoria.setName("Categoria");
        cbCategoria.setBackground(new Color(250, 250, 250));
        
        cbNivel = new DefaultComboBox();
        cbNivel.setModel(new DefaultComboBoxModel(new String[] {"Nivel"}));
        cbNivel.setName("Nivel");
        cbNivel.setBackground(new Color(250, 250, 250));
        
        cbServicos = new DefaultComboBox();
        cbServicos.setModel(new DefaultComboBoxModel(new String[] {"Produtos/Servicos"}));
        cbServicos.setName("Produtos/Servicos");
        cbServicos.setBackground(new Color(250, 250, 250));
        
        lbTitulo = new JLabel("Cadastro de Negocios");
        lbTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));

        javax.swing.GroupLayout gl_pnPrincipal = new javax.swing.GroupLayout(pnPrincipal);
        gl_pnPrincipal.setHorizontalGroup(
        	gl_pnPrincipal.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnPrincipal.createSequentialGroup()
        			.addGroup(gl_pnPrincipal.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_pnPrincipal.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lbTitulo, GroupLayout.PREFERRED_SIZE, 758, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
        				.addGroup(gl_pnPrincipal.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(cbStatus, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(cbEtapa, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addGap(10)
        					.addComponent(cbCategoria, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(cbOrigem, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(cbNivel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(cbServicos, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(cbEmpresa, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(cbPessoa, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(cbAtendente, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        gl_pnPrincipal.setVerticalGroup(
        	gl_pnPrincipal.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_pnPrincipal.createSequentialGroup()
        			.addGroup(gl_pnPrincipal.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_pnPrincipal.createSequentialGroup()
        					.addGap(2)
        					.addComponent(lbTitulo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(gl_pnPrincipal.createParallelGroup(Alignment.BASELINE)
        						.addComponent(cbStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbEtapa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbOrigem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbPessoa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbAtendente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbNivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbServicos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        panel.setLayout(null);
        panel.add(label_1);
        panel.add(label);
        panel.add(data2);
        panel.add(data1);
        pnPrincipal.setLayout(gl_pnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnVisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnVisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnVisao.setLayout(null);
        pnVisao.add(pnPrincipal);

        btnImportar = new JButton();
        btnImportar.setToolTipText("Importe um novo registro a partir de uma planilha Modelo Excel");
		btnImportar.setText("Importar");
		btnImportar.setName("Importar");
		btnImportar.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnImportar.setActionCommand("Importar");
		btnImportar.addActionListener(controller);
		btnImportar.setBounds(780, 90, 130, 25);
		pnVisao.add(btnImportar);
		
		btnExportar = new JButton();
		btnExportar.setToolTipText("Exporte o registro atual ou todos os registros da tabela para uma planilha Modelo Excel");
		btnExportar.setText("Exportar");
		btnExportar.setName("Exportar");
		btnExportar.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnExportar.setActionCommand("Exportar");
		btnExportar.addActionListener(controller);
		btnExportar.setBounds(780, 126, 130, 25);
		pnVisao.add(btnExportar);
        
        pnAuxiliar = new JPanel();
        pnAuxiliar.setBackground(new Color(250, 250, 250));
        pnAuxiliar.setBounds(780, 270, 460, 363);
        pnVisao.add(pnAuxiliar);

        JScrollPane scrolAuxiliar = new JScrollPane();
        scrolAuxiliar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrolAuxiliar.setBounds(0, 52, 450, 308);

        btEsconder = new JButton("Esconder");
        btEsconder.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btEsconder.setBounds(330, 11, 120, 25);
        btEsconder.setActionCommand("Esconder");
        btEsconder.addActionListener(controller);
        pnAuxiliar.setLayout(null);

        tbAuxiliar = new JTable();
        scrolAuxiliar.setViewportView(tbAuxiliar);
        pnAuxiliar.add(scrolAuxiliar);
        pnAuxiliar.add(btEsconder);
        
        btnNovaTarefa = new JButton();
        btnNovaTarefa.setBounds(10, 11, 130, 25);
        pnAuxiliar.add(btnNovaTarefa);
        btnNovaTarefa.setFont(new Font("Dialog", Font.PLAIN, 10));
        btnNovaTarefa.setText("Nova Tarefa");
        btnNovaTarefa.setName("Nova Tarefa");
        btnNovaTarefa.setActionCommand("Nova Tarefa");
        btnNovaTarefa.addActionListener(controller);

        pnCadastro = new JPanel();
        pnCadastro.setLayout(null);
        pnCadastro.setBackground((Color) null);
        pnCadastro.setBounds(10, 278, 760, 355);
        pnVisao.add(pnCadastro);

        label_7 = new JLabel();
        label_7.setBounds(new Rectangle(0, 40, 0, 0));
        label_7.setText("Nome:");
        label_7.setBounds(10, 30, 56, 17);
        pnCadastro.add(label_7);

        lblDescrio = new JLabel();
        lblDescrio.setText("Descri\u00E7\u00E3o:");
        lblDescrio.setBounds(8, 245, 78, 14);
        pnCadastro.add(lblDescrio);

        txCodigo = new JLabel();
        txCodigo.setBounds(10, 5, 87, 14);
        pnCadastro.add(txCodigo);

        txNome = new JTextField();
        txNome.setBounds(new Rectangle(0, 40, 0, 0));
        txNome.setBounds(107, 30, 201, 20);
        pnCadastro.add(txNome);

        txCadastradoPor = new JLabel();
        txCadastradoPor.setBounds(278, 5, 56, 14);
        pnCadastro.add(txCadastradoPor);

        label_16 = new JLabel();
        label_16.setText("Cadastro em:");
        label_16.setBounds(107, 5, 78, 14);
        pnCadastro.add(label_16);

        txDataCadastro = new JLabel();
        txDataCadastro.setBounds(195, 5, 73, 14);
        pnCadastro.add(txDataCadastro);

        btnNovo = new JButton();
        btnNovo.setToolTipText("Novo");
        btnNovo.setFont(new Font("Dialog", Font.PLAIN, 9));
        btnNovo.setActionCommand("Novo");
        btnNovo.setName("Novo");
        btnNovo.addActionListener(controller);
        btnNovo.setBounds(207, 321, 90, 25);
        pnCadastro.add(btnNovo);

        btnEditar = new JButton();
        btnEditar.setToolTipText("Editar");
        btnEditar.setFont(new Font("Dialog", Font.PLAIN, 9));
        btnEditar.setActionCommand("Editar");
        btnEditar.setName("Editar");
        btnEditar.addActionListener(controller);
        btnEditar.setBounds(307, 321, 90, 25);
        pnCadastro.add(btnEditar);

        btnSalvar = new JButton();
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setFont(new Font("Dialog", Font.PLAIN, 9));
        btnSalvar.setActionCommand("Salvar");
        btnSalvar.setName("Salvar");
        btnSalvar.addActionListener(controller);
        btnSalvar.setBounds(407, 321, 90, 25);
        pnCadastro.add(btnSalvar);

        btnCancelar = new JButton();
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 9));
        btnCancelar.setActionCommand("Cancelar");
        btnCancelar.setName("Cancelar");
        btnCancelar.addActionListener(controller);
        btnCancelar.setBounds(507, 321, 90, 25);
        pnCadastro.add(btnCancelar);

        lbAtendenteCad = new JLabel();
        lbAtendenteCad.setBounds(new Rectangle(0, 40, 0, 0));
        lbAtendenteCad.setText("Atendente:");
        lbAtendenteCad.setBounds(346, 5, 78, 17);
        pnCadastro.add(lbAtendenteCad);

        cbAtendenteCad = new DefaultComboBox();
        cbAtendenteCad.setBounds(new Rectangle(0, 40, 0, 0));
        cbAtendenteCad.setName("AtendenteCad");
        cbAtendenteCad.setBounds(437, 5, 115, 20);
        pnCadastro.add(cbAtendenteCad);

        pnPrivacidade = new JPanel();
        pnPrivacidade.setBackground((Color) null);
        pnPrivacidade.setBounds(601, 70, 159, 97);
        pnCadastro.add(pnPrivacidade);

        checkBox = new JCheckBox("Outros");
        checkBox.setBackground((Color) null);

        checkBox_1 = new JCheckBox("Eu");
        checkBox_1.setBackground((Color) null);

        checkBox_2 = new JCheckBox("Todos");
        checkBox_2.setBackground((Color) null);

        label_21 = new JLabel("Privacidade:");
        label_21.setHorizontalAlignment(SwingConstants.CENTER);
        GroupLayout gl_panel_3 = new GroupLayout(pnPrivacidade);
        gl_panel_3.setHorizontalGroup(
        	gl_panel_3.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
        				.addComponent(checkBox, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        				.addComponent(checkBox_1, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        				.addComponent(checkBox_2, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        				.addComponent(label_21, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_panel_3.setVerticalGroup(
        	gl_panel_3.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_3.createSequentialGroup()
        			.addComponent(label_21)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(checkBox_2)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(checkBox_1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(checkBox)
        			.addContainerGap(46, Short.MAX_VALUE))
        );
        pnPrivacidade.setLayout(gl_panel_3);

        btnHistorico = new JButton();
        btnHistorico.setToolTipText("Tarefas");
        btnHistorico.setFont(new Font("Dialog", Font.PLAIN, 9));
        btnHistorico.setActionCommand("Historico");
        btnHistorico.setBounds(107, 321, 90, 25);
        btnHistorico.addActionListener(controller);
        pnCadastro.add(btnHistorico);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(107, 240, 268, 70);
        pnCadastro.add(scrollPane_2);

        txDescricao = new JTextArea();
        txDescricao.setWrapStyleWord(true);
        txDescricao.setLineWrap(true);
        scrollPane_2.setViewportView(txDescricao);

        txHonorario = new JFormattedTextField();
        txHonorario.setBounds(107, 209, 78, 20);
        pnCadastro.add(txHonorario);

        JLabel lblValor = new JLabel();
        lblValor.setText("Honor\u00E1rio:(R$)");
        lblValor.setBounds(8, 210, 87, 17);
        pnCadastro.add(lblValor);

        JLabel lblEmppessoa = new JLabel();
        lblEmppessoa.setFont(new Font("Tahoma", Font.PLAIN, 9));
        lblEmppessoa.setText("Empresa/Pessoa:");
        lblEmppessoa.setBounds(10, 58, 87, 17);
        pnCadastro.add(lblEmppessoa);

        btAddEmpresaPessoa = new JButton();
        btAddEmpresaPessoa.setActionCommand("VincularObjeto");
        btAddEmpresaPessoa.addActionListener(controller);
        btAddEmpresaPessoa.setBounds(203, 58, 36, 25);
        pnCadastro.add(btAddEmpresaPessoa);

        txCodObjeto = new JLabel("");
        txCodObjeto.setBackground(new Color(250,250,250));
        txCodObjeto.setBounds(246, 61, 29, 17);
        pnCadastro.add(txCodObjeto);

        JLabel lbFim = new JLabel();
        lbFim.setText("Concluir em:");
        lbFim.setHorizontalAlignment(SwingConstants.LEFT);
        lbFim.setBounds(211, 178, 75, 20);
        pnCadastro.add(lbFim);

        dataFim = new JDateChooser();
        dataFim.setBounds(287, 178, 98, 20);
        pnCadastro.add(dataFim);

        dataInicio = new JDateChooser();
        dataInicio.setBounds(105, 178, 98, 20);
        pnCadastro.add(dataInicio);

        JLabel lbInicio = new JLabel();
        lbInicio.setText("Data Inicio:");
        lbInicio.setHorizontalAlignment(SwingConstants.LEFT);
        lbInicio.setBounds(6, 178, 87, 20);
        pnCadastro.add(lbInicio);
        
        scrollServicos = new JScrollPane();
        scrollServicos.setBounds(395, 222, 365, 88);
        pnCadastro.add(scrollServicos);
        scrollServicos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scrollServicos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tbServicosContratados = new JTable();
        scrollServicos.setViewportView(tbServicosContratados);

        txNomeObjeto = new JLabel();
        txNomeObjeto.setBackground(new Color(250,250,250));
        txNomeObjeto.setBounds(278, 61, 146, 17);
        pnCadastro.add(txNomeObjeto);

        btnExcluir = new JButton();
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.setFont(new Font("Dialog", Font.PLAIN, 9));
        btnExcluir.setActionCommand("Excluir");
        btnExcluir.setName("Excluir");
        btnExcluir.setBounds(607, 321, 90, 25);
        btnExcluir.addActionListener(controller);
        pnCadastro.add(btnExcluir);

        cbObject = new JComboBox();
        cbObject.setFont(new Font("Tahoma", Font.PLAIN, 11));
        cbObject.setModel(new DefaultComboBoxModel(Modelos.values()));
        cbObject.setBounds(107, 58, 87, 20);
        cbObject.setName("Objeto");
        pnCadastro.add(cbObject);
        
        JLabel lbServicosCad = new JLabel();
        lbServicosCad.setText("Produtos/Servi\u00E7os:");
        lbServicosCad.setBounds(317, 145, 109, 17);
        pnCadastro.add(lbServicosCad);
        
        cbServicosCad = new DefaultComboBox();
        cbServicosCad.setName("ServicosCad");
        cbServicosCad.setBounds(438, 145, 116, 20);
        pnCadastro.add(cbServicosCad);
        
        btnServicoAdd = new JButton();
        btnServicoAdd.setActionCommand("CriarServico");
        btnServicoAdd.setBounds(564, 142, 36, 25);
        btnServicoAdd.addActionListener(controller);
        pnCadastro.add(btnServicoAdd);
        
        btnNivelAdd = new JButton();
        btnNivelAdd.setActionCommand("CriarNivel");
        btnNivelAdd.setBounds(564, 114, 36, 25);
        btnNivelAdd.addActionListener(controller);
        pnCadastro.add(btnNivelAdd);
        
        cbNivelCad = new DefaultComboBox();
        cbNivelCad.setName("NivelCad");
        cbNivelCad.setBounds(438, 115, 116, 20);
        pnCadastro.add(cbNivelCad);
        
        JLabel lbNivelCad = new JLabel();
        lbNivelCad.setText("Nivel:");
        lbNivelCad.setBounds(346, 115, 78, 18);
        pnCadastro.add(lbNivelCad);
        
        btnOrigemAdd = new JButton();
        btnOrigemAdd.setActionCommand("CriarOrigem");
        btnOrigemAdd.setBounds(203, 142, 36, 25);
        btnOrigemAdd.addActionListener(controller);
        pnCadastro.add(btnOrigemAdd);
        
        cbOrigemCad = new DefaultComboBox();
        cbOrigemCad.setName("OrigemCad");
        cbOrigemCad.setBounds(107, 145, 87, 20);
        pnCadastro.add(cbOrigemCad);
        
        JLabel lbOrigemCad = new JLabel();
        lbOrigemCad.setText("Origem:");
        lbOrigemCad.setBounds(10, 145, 87, 18);
        pnCadastro.add(lbOrigemCad);
        
        JLabel lbCategoriaCad = new JLabel();
        lbCategoriaCad.setText("Categoria:");
        lbCategoriaCad.setBounds(10, 115, 87, 18);
        pnCadastro.add(lbCategoriaCad);
        
        cbCategoriaCad = new DefaultComboBox();
        cbCategoriaCad.setName("CategoriaCad");
        cbCategoriaCad.setBounds(107, 115, 87, 20);
        pnCadastro.add(cbCategoriaCad);
        
        btnCategoriaAdd = new JButton();
        btnCategoriaAdd.setActionCommand("CriarCategoria");
        btnCategoriaAdd.setBounds(203, 112, 36, 25);
        btnCategoriaAdd.addActionListener(controller);
        pnCadastro.add(btnCategoriaAdd);
        
        pnServicosContratados = new JPanel();
        pnServicosContratados.setBackground(new Color(250,250,250));
        pnServicosContratados.setBounds(395, 178, 365, 33);
        pnCadastro.add(pnServicosContratados);
        pnServicosContratados.setLayout(null);
        
        JLabel lblServio = new JLabel("Servi\u00E7o:");
        lblServio.setBounds(31, 1, 52, 23);
        pnServicosContratados.add(lblServio);
        
        cbServicosAgregados = new DefaultComboBox();
        cbServicosAgregados.setBounds(82, 1, 79, 22);
        cbServicosAgregados.setName("ServicoAgregadoCad");
        pnServicosContratados.add(cbServicosAgregados);
        
        btAddServicoAgregado = new JButton("");
        btAddServicoAgregado.setBounds(320, 0, 45, 23);
        pnServicosContratados.add(btAddServicoAgregado);
        btAddServicoAgregado.setActionCommand("AdicionarServicoAgregado"); 
        btAddServicoAgregado.addActionListener(controller);
        
        txIdServicoContratado = new JLabel("");
        txIdServicoContratado.setBounds(0, 0, 21, 23);
        pnServicosContratados.add(txIdServicoContratado);
        
        btnNovoServicoAgregado = new JButton("");
        btnNovoServicoAgregado.setActionCommand("NovoServicoContratado");
        btnNovoServicoAgregado.addActionListener(controller);
        btnNovoServicoAgregado.setBounds(171, 0, 45, 22);
        pnServicosContratados.add(btnNovoServicoAgregado);
        
        JLabel lblValor_1 = new JLabel("Valor:");
        lblValor_1.setBounds(219, 0, 38, 23);
        pnServicosContratados.add(lblValor_1);
        
        txValorServico = new JFormattedTextField();
        txValorServico.setBounds(258, 1, 52, 20);
        pnServicosContratados.add(txValorServico);
        txValorServico.setHorizontalAlignment(SwingConstants.CENTER);
        txValorServico.setText("0,00");
        
        btnLink = new JButton();
        btnLink.setToolTipText("Abrir P\u00E1gina");
        btnLink.setActionCommand("OpenURL");
        btnLink.setBounds(377, 86, 50, 25);
        btnLink.addActionListener(controller);
        pnCadastro.add(btnLink);
        
        btnEmail = new JButton();
        btnEmail.setToolTipText("Enviar e-mail");
        btnEmail.setActionCommand("MailTo");
        btnEmail.setBounds(317, 86, 50, 25);
        btnEmail.addActionListener(controller);
        pnCadastro.add(btnEmail);
        
        txFone = new JLabel("");
        txFone.setFont(new Font("Tahoma", Font.BOLD, 12));
        txFone.setBounds(476, 58, 124, 19);
        pnCadastro.add(txFone);
        
        txCelular = new JLabel("");
        txCelular.setFont(new Font("Tahoma", Font.BOLD, 12));
        txCelular.setBounds(476, 92, 124, 17);
        pnCadastro.add(txCelular);
        
        txIconFone = new JLabel("");
        txIconFone.setBounds(437, 58, 29, 25);
        pnCadastro.add(txIconFone);
        
        txIconCelular = new JLabel("");
        txIconCelular.setBounds(439, 89, 29, 25);
        pnCadastro.add(txIconCelular);
        
        JLabel lbEmail = new JLabel();
        lbEmail.setText("E-mail");
        lbEmail.setBounds(10, 86, 56, 20);
        pnCadastro.add(lbEmail);
        
        txEmail = new JTextField();
        txEmail.setBounds(107, 86, 201, 20);
        pnCadastro.add(txEmail);
        
        JLabel lbBuscar = new JLabel("Buscar");
        lbBuscar.setBounds(10, 65, 53, 20);
        pnVisao.add(lbBuscar);

        txBuscar = new JTextField();
        txBuscar.setColumns(10);
        txBuscar.setBounds(74, 65, 139, 20);
        pnVisao.add(txBuscar);

        JScrollPane scrollPrincipal = new JScrollPane();
        scrollPrincipal.setBounds(10, 90, 760, 142);
        pnVisao.add(scrollPrincipal);

        tbPrincipal = new JTable();
        scrollPrincipal.setViewportView(tbPrincipal);

        pnAndamento = new JPanel();
        pnAndamento.setBackground(new Color(250,250,250));
        pnAndamento.setBounds(10, 235, 760, 41);
        pnVisao.add(pnAndamento);

        rbContato = new JRadioButton("Contato");
        rbContato.setFont(new Font("Tahoma", Font.PLAIN, 10));
        rbContato.setOpaque(false);
        pnAndamento.add(rbContato);

        rbEnvioProposta = new JRadioButton("Envio de Proposta");
        rbEnvioProposta.setFont(new Font("Tahoma", Font.PLAIN, 10));
        rbEnvioProposta.setOpaque(false);
        pnAndamento.add(rbEnvioProposta);

        rbFollowup = new JRadioButton("Follow-up");
        rbFollowup.setFont(new Font("Tahoma", Font.PLAIN, 10));
        rbFollowup.setOpaque(false);
        pnAndamento.add(rbFollowup);

        rbFechamento = new JRadioButton("Fechamento");
        rbFechamento.setFont(new Font("Tahoma", Font.PLAIN, 10));
        rbFechamento.setOpaque(false);
        pnAndamento.add(rbFechamento);
        
        rbIndefinida = new JRadioButton("Indefinida");
        rbIndefinida.setFont(new Font("Tahoma", Font.PLAIN, 10));
        rbIndefinida.setOpaque(false);
        pnAndamento.add(rbIndefinida);

        JLabel lblStatus = new JLabel();
        lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 10));
        pnAndamento.add(lblStatus);
        lblStatus.setText("Status:");

        cbStatusCad = new DefaultComboBox();
        cbStatusCad.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cbStatusCad.setName("StatusCad");
        pnAndamento.add(cbStatusCad);
        cbStatusCad.setModel(new DefaultComboBoxModel(new String[] {"Em Andamento", "Ganho", "Perdido"}));

        btnVerPerda = new JButton();
		btnVerPerda.setActionCommand("VerPerda");
		btnVerPerda.addActionListener(controller);
		pnAndamento.add(btnVerPerda);
		
        pnTotalizador = new JPanel();
        pnTotalizador.setBackground(new Color(250,250,250));
        pnTotalizador.setBounds(980, 90, 260, 142);
        pnVisao.add(pnTotalizador);
        
        lblValorTotalDe = new JLabel("Valor total dos seus neg\u00F3cios");
        lblValorTotalDe.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblR = new JLabel("R$1.000,00");
        lblR.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel lblNegcios = new JLabel("[#] Neg\u00F3cios");
        lblNegcios.setHorizontalAlignment(SwingConstants.CENTER);
        GroupLayout gl_pnTotalizador = new GroupLayout(pnTotalizador);
        gl_pnTotalizador.setHorizontalGroup(
        	gl_pnTotalizador.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnTotalizador.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnTotalizador.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblR, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblValorTotalDe, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        				.addComponent(lblNegcios, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        gl_pnTotalizador.setVerticalGroup(
        	gl_pnTotalizador.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnTotalizador.createSequentialGroup()
        			.addGap(8)
        			.addComponent(lblValorTotalDe, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(lblR, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(lblNegcios, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTotalizador.setLayout(gl_pnTotalizador);
        
        txContadorRegistros = new JLabel("");
        txContadorRegistros.setBounds(780, 218, 152, 14);
        pnVisao.add(txContadorRegistros);
        
        ButtonGroup groupEtapas = new ButtonGroup();
        groupEtapas.add(rbContato);
        groupEtapas.add(rbEnvioProposta);
        groupEtapas.add(rbFollowup);
        groupEtapas.add(rbFechamento);
        groupEtapas.add(rbIndefinida);
        pack();
        setBounds(0, 0, 1250, 660);
    }
}
