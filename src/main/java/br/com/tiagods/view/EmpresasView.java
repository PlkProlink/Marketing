package br.com.tiagods.view;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

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
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;

import br.com.tiagods.controller.ControllerEmpresas;
import br.com.tiagods.model.Empresa;
import java.awt.Font;

import br.com.tiagods.view.interfaces.DefaultComboBox;
import br.com.tiagods.view.interfaces.DefaultEnumModel.Logradouro;

public class EmpresasView extends JInternalFrame {
	public static DefaultComboBox cbAtendente;
    public static DefaultComboBox cbCategoria;
    public static DefaultComboBox cbCategoriaCad;
    public static DefaultComboBox cbOrigem;
    public static DefaultComboBox cbEmpresa;
    public static DefaultComboBox cbProdServicos;
    public static javax.swing.JComboBox cbLogradouro;
    public static DefaultComboBox cbOrigemCad;
    public static DefaultComboBox cbNivel;
    public static DefaultComboBox cbNivelCad;
    public static DefaultComboBox cbEstado;
    public static DefaultComboBox cbAtendenteCad;
    public static DefaultComboBox cbProdServicosCad;
    public static DefaultComboBox cbCidade;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel pnPrincipal;
    public static javax.swing.JPanel pnCabecalho;
    public static javax.swing.JPanel pnAuxiliar;
    public static javax.swing.JPanel pnPrivacidade;
    public static javax.swing.JButton btnNegocios, btnHistorico, btnPessoas,btEsconder;
    public static javax.swing.JButton btnNovo, btnSalvar, btnEditar, btnExcluir, btnCancelar;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel label;
	public static JDateChooser data1,data2;
	public static JLabel label_1, txCadastradoPor, txDataCadastro;
	public static JTextField txLogradouro;
	public static JTextField txComplemento;
	public static JLabel txCodigo;
	public static JLabel txContador;
	public static JTextField txNome;
	public static JTextField txNum;
	public static JTextField txTelefone;
	public static JTextField txCelular;
	public static JTextField txBairro;
	public static JFormattedTextField txCep;
	public static JFormattedTextField txCnpj;
	public static JTextField txEmail;
	public static JTextField txSite;
	public static JTable tbAuxiliar;
	public static JTextField txBuscar;
	public static JTable tbPrincipal;
	
	ControllerEmpresas controller = new ControllerEmpresas();
	/**
	 * Create the frame.
	 */
	public EmpresasView(Empresa empresa) {
		initComponents();
		pnAuxiliar.setVisible(false);
		pnPrivacidade.setVisible(false);
		txContador = new JLabel("");
		txContador.setBounds(780, 235, 150, 14);
		jPanel1.add(txContador);
		controller.iniciar(empresa);
		btnPessoas.setEnabled(false);
		
		
		
	}
	private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        pnCabecalho = new javax.swing.JPanel();
        pnCabecalho.setBounds(0, 0, 1240, 69);
        cbAtendente = new DefaultComboBox();
        cbCategoria = new DefaultComboBox();
        cbOrigem = new DefaultComboBox();
        cbEmpresa = new DefaultComboBox();
        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(880, 450));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        pnCabecalho.setBackground(new java.awt.Color(250, 250, 250));

        cbAtendente.setBackground(new java.awt.Color(250, 250, 250));
        cbAtendente.setName("Atendente");
        cbAtendente.addItemListener(controller);
        cbAtendente.setModel(new DefaultComboBoxModel(new String[] {"Atendente"}));

        cbCategoria.setBackground(new java.awt.Color(250, 250, 250));
        cbCategoria.setName("Categoria");
        cbCategoria.addItemListener(controller);
        cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"Categoria"}));

        cbOrigem.setBackground(new java.awt.Color(250, 250, 250));
        cbOrigem.setName("Origem");
        cbOrigem.addItemListener(controller);
        cbOrigem.setModel(new DefaultComboBoxModel(new String[] {"Origem"}));

        cbEmpresa.setBackground(new java.awt.Color(250, 250, 250));
        cbEmpresa.setName("Empresa");
        cbEmpresa.addItemListener(controller);
        cbEmpresa.setModel(new DefaultComboBoxModel(new String[] {"Empresa"}));

        cbProdServicos = new DefaultComboBox();
        cbProdServicos.setName("Produtos/Servicos");
        cbProdServicos.addItemListener(controller);
        cbProdServicos.setModel(new DefaultComboBoxModel(new String[] {"Produtos/Servicos"}));
        cbProdServicos.setBackground(new Color(250, 250, 250));

        panel = new JPanel();
        panel.setBackground(new Color(250, 250, 250));

        label = new JLabel();
        label.setBounds(10, 37, 22, 20);
        label.setText("at\u00E9");
        label.setHorizontalAlignment(SwingConstants.LEFT);


        label_1 = new JLabel();
        label_1.setHorizontalAlignment(SwingConstants.LEFT);
        label_1.setBounds(10, 11, 22, 20);
        label_1.setText("de:");

        data1 = new JDateChooser();
        data1.setBounds(36, 11, 100, 20);
        data1.addPropertyChangeListener(controller);
        data2 = new JDateChooser();
        data2.addPropertyChangeListener(controller);
        data2.setBounds(36, 37, 100, 20);

        cbNivel = new DefaultComboBox();
        cbNivel.setModel(new DefaultComboBoxModel(new String[] {"Nivel"}));
        cbNivel.setName("Nivel");
        cbNivel.setBackground(new Color(250, 250, 250));

        javax.swing.GroupLayout gl_pnCabecalho = new javax.swing.GroupLayout(pnCabecalho);
        gl_pnCabecalho.setHorizontalGroup(
        	gl_pnCabecalho.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnCabecalho.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(cbCategoria, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(cbNivel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(cbOrigem, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(cbEmpresa, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(cbProdServicos, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(cbAtendente, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addGap(33)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(314, Short.MAX_VALUE))
        );
        gl_pnCabecalho.setVerticalGroup(
        	gl_pnCabecalho.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnCabecalho.createSequentialGroup()
        			.addGroup(gl_pnCabecalho.createParallelGroup(Alignment.LEADING)
        				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_pnCabecalho.createSequentialGroup()
        					.addGap(23)
        					.addGroup(gl_pnCabecalho.createParallelGroup(Alignment.BASELINE)
        						.addComponent(cbCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbNivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbOrigem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbEmpresa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbProdServicos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cbAtendente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel.setLayout(null);
        panel.add(label_1);
        panel.add(label);
        panel.add(data2);
        panel.add(data1);
        pnCabecalho.setLayout(gl_pnCabecalho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1.setLayout(null);
        jPanel1.add(pnCabecalho);

        pnPrincipal = new JPanel();
        pnPrincipal.setLayout(null);
        pnPrincipal.setBackground((Color) null);
        pnPrincipal.setBounds(10, 260, 760, 363);
        jPanel1.add(pnPrincipal);

        JLabel lblEstados = new JLabel();
        lblEstados.setText("Estado:");
        lblEstados.setBounds(10, 278, 56, 17);
        pnPrincipal.add(lblEstados);

        JLabel lbTelefone = new JLabel();
        lbTelefone.setText("Telefone:");
        lbTelefone.setBounds(10, 154, 56, 20);
        pnPrincipal.add(lbTelefone);

        cbLogradouro = new DefaultComboBox();
        cbLogradouro.setModel(new DefaultComboBoxModel(Logradouro.values()));
        cbLogradouro.setName("Logradouro");
        cbLogradouro.setBounds(10, 214, 87, 20);
        pnPrincipal.add(cbLogradouro);

        JLabel lbNome = new JLabel();
        lbNome.setText("Nome:");
        lbNome.setBounds(10, 40, 56, 17);
        pnPrincipal.add(lbNome);

        JLabel lbCnpj = new JLabel();
        lbCnpj.setText("CNPJ:");
        lbCnpj.setBounds(10, 71, 56, 14);
        pnPrincipal.add(lbCnpj);

        JLabel lbComplemento = new JLabel();
        lbComplemento.setText("Compl:");
        lbComplemento.setBounds(203, 245, 43, 20);
        pnPrincipal.add(lbComplemento);

        

        txLogradouro = new JTextField();
        txLogradouro.setBounds(107, 214, 201, 20);
        pnPrincipal.add(txLogradouro);

        txComplemento = new JTextField();
        txComplemento.setBounds(252, 245, 56, 20);
        pnPrincipal.add(txComplemento);

        txCodigo = new JLabel();
        txCodigo.setBounds(107, 11, 87, 20);
        pnPrincipal.add(txCodigo);

        txNome = new JTextField();
        txNome.setBounds(107, 39, 201, 20);
        pnPrincipal.add(txNome);

        txTelefone = new JTextField();
        txTelefone.setBounds(107, 154, 87, 20);
        pnPrincipal.add(txTelefone);

        JLabel lbEstado = new JLabel();
        lbEstado.setText("Cidade:");
        lbEstado.setBounds(384, 275, 52, 19);
        pnPrincipal.add(lbEstado);

        cbEstado = new DefaultComboBox();
        cbEstado.setName("Estado");
        cbEstado.addItemListener(controller);
        cbEstado.setBounds(107, 276, 52, 20);
        pnPrincipal.add(cbEstado);

        JLabel lbNum = new JLabel();
        lbNum.setText("N\u00BA:");
        lbNum.setBounds(385, 213, 51, 20);
        pnPrincipal.add(lbNum);

        JLabel lbCelular = new JLabel();
        lbCelular.setText("Celular");
        lbCelular.setBounds(385, 154, 51, 19);
        pnPrincipal.add(lbCelular);

        JLabel label_13 = new JLabel();
        label_13.setText("Bairro:");
        label_13.setBounds(385, 244, 43, 20);
        pnPrincipal.add(label_13);

        txCelular = new JTextField();
        txCelular.setBounds(440, 154, 95, 20);
        pnPrincipal.add(txCelular);

        txNum = new JTextField();
        txNum.setBounds(440, 213, 35, 20);
        pnPrincipal.add(txNum);

        txBairro = new JTextField();
        txBairro.setBounds(440, 244, 90, 20);
        pnPrincipal.add(txBairro);

        txCadastradoPor = new JLabel();
        txCadastradoPor.setBounds(546, 14, 56, 14);
        pnPrincipal.add(txCadastradoPor);

        JLabel lblCadastro = new JLabel();
        lblCadastro.setText("Criado em:");
        lblCadastro.setBounds(385, 14, 73, 14);
        pnPrincipal.add(lblCadastro);

        txDataCadastro = new JLabel();
        txDataCadastro.setBounds(463, 14, 73, 14);
        pnPrincipal.add(txDataCadastro);

        MaskFormatter formatterCnpj=null;
        try{
        	formatterCnpj = new MaskFormatter("##.###.###/###-##");
        }catch(Exception e){
        }
        txCnpj = new JFormattedTextField(formatterCnpj);
        txCnpj.setBounds(107, 68, 109, 20);
        pnPrincipal.add(txCnpj);

        btnNovo = new JButton();
        btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnNovo.setText("Novo");
        btnNovo.setActionCommand("Novo");
        btnNovo.setBounds(59, 306, 90, 23);
        btnNovo.addActionListener(controller);
        pnPrincipal.add(btnNovo);

        btnEditar = new JButton();
        btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnEditar.setText("Editar");
        btnEditar.setActionCommand("Editar");
        btnEditar.addActionListener(controller);
        btnEditar.setBounds(153, 306, 90, 23);
        pnPrincipal.add(btnEditar);

        btnSalvar = new JButton();
        btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnSalvar.setText("Salvar");
        btnSalvar.setBounds(249, 306, 90, 23);
        btnSalvar.setActionCommand("Salvar");
        btnSalvar.addActionListener(controller);
        pnPrincipal.add(btnSalvar);

        btnCancelar = new JButton();
        btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(controller);
        btnCancelar.setBounds(345, 306, 90, 23);
        pnPrincipal.add(btnCancelar);

        txEmail = new JTextField();
        txEmail.setBounds(107, 183, 201, 20);
        pnPrincipal.add(txEmail);

        JLabel lbEmail1 = new JLabel();
        lbEmail1.setText("E-mail");
        lbEmail1.setBounds(10, 183, 56, 20);
        pnPrincipal.add(lbEmail1);

        txSite = new JTextField();
        txSite.setBounds(440, 184, 126, 20);
        pnPrincipal.add(txSite);

        JLabel lbSite = new JLabel();
        lbSite.setText("Site");
        lbSite.setBounds(385, 184, 43, 20);
        pnPrincipal.add(lbSite);

        
        pnPrivacidade = new JPanel();
        pnPrivacidade.setBackground((Color) null);
        pnPrivacidade.setBounds(601, 0, 159, 363);
        pnPrincipal.add(pnPrivacidade);

        JCheckBox checkBox = new JCheckBox("Outros");
        checkBox.setBackground((Color) null);

        JCheckBox checkBox_1 = new JCheckBox("Eu");
        checkBox_1.setBackground((Color) null);

        JCheckBox checkBox_2 = new JCheckBox("Todos");
        checkBox_2.setBackground((Color) null);

        JLabel label_20 = new JLabel("Privacidade:");
        label_20.setHorizontalAlignment(SwingConstants.CENTER);
        GroupLayout gl_pnPrivacidade = new GroupLayout(pnPrivacidade);
        gl_pnPrivacidade.setHorizontalGroup(
        	gl_pnPrivacidade.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 159, Short.MAX_VALUE)
        		.addGroup(gl_pnPrivacidade.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnPrivacidade.createParallelGroup(Alignment.LEADING)
        				.addComponent(checkBox, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        				.addComponent(checkBox_1, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        				.addComponent(checkBox_2, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        				.addComponent(label_20, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        			.addContainerGap())
        );
        gl_pnPrivacidade.setVerticalGroup(
        	gl_pnPrivacidade.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 334, Short.MAX_VALUE)
        		.addGroup(gl_pnPrivacidade.createSequentialGroup()
        			.addGap(43)
        			.addComponent(label_20)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(checkBox_2)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(checkBox_1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(checkBox)
        			.addContainerGap(195, Short.MAX_VALUE))
        );
        pnPrivacidade.setLayout(gl_pnPrivacidade);

        JLabel lbCep = new JLabel();
        lbCep.setText("CEP:");
        lbCep.setBounds(10, 247, 35, 20);
        pnPrincipal.add(lbCep);

        MaskFormatter formatterCep=null;
        try{
        	formatterCep = new MaskFormatter("#####-###");
        }catch(Exception e){

        }
        txCep = new JFormattedTextField(formatterCep);
        txCep.setBounds(107, 245, 78, 20);
        pnPrincipal.add(txCep);

        MaskFormatter formatterNascimento=null;
        try{
        	formatterNascimento = new MaskFormatter("##/##");
        }catch (Exception e) {
		}

        cbAtendenteCad = new DefaultComboBox();
        cbAtendenteCad.setName("AtendenteCad");
        cbAtendenteCad.setBounds(476, 40, 92, 20);
        pnPrincipal.add(cbAtendenteCad);

        JLabel lbAtendente = new JLabel();
        lbAtendente.setText("Atendente:");
        lbAtendente.setBounds(385, 42, 87, 17);
        pnPrincipal.add(lbAtendente);

        cbCategoriaCad = new DefaultComboBox();
        cbCategoriaCad.setName("CategoriaCad");
        cbCategoriaCad.setBounds(107, 96, 87, 20);
        pnPrincipal.add(cbCategoriaCad);
        
        JButton btCategoriaAdd = new JButton();
        btCategoriaAdd.setText("ADC");
        btCategoriaAdd.setBounds(203, 93, 36, 23);
        btCategoriaAdd.setActionCommand("CriarCategoria");
        btCategoriaAdd.addActionListener(controller);
        pnPrincipal.add(btCategoriaAdd);
        
        JLabel lbCategoriaCad = new JLabel();
        lbCategoriaCad.setText("Categoria:");
        lbCategoriaCad.setBounds(10, 96, 87, 18);
        pnPrincipal.add(lbCategoriaCad);
        
        cbNivelCad = new DefaultComboBox();
        cbNivelCad.setName("NivelCad");
        cbNivelCad.setBounds(438, 96, 116, 20);
        pnPrincipal.add(cbNivelCad);
        
        JButton btnNivelCad = new JButton();
        btnNivelCad.setText("ADC");
        btnNivelCad.setBounds(564, 95, 36, 23);
        btnNivelCad.setActionCommand("CriarNivel");
        btnNivelCad.addActionListener(controller);
        pnPrincipal.add(btnNivelCad);
        
        JLabel lbNivel = new JLabel();
        lbNivel.setText("Nivel:");
        lbNivel.setBounds(384, 96, 51, 18);
        pnPrincipal.add(lbNivel);
        
        cbOrigemCad = new DefaultComboBox();
        cbOrigemCad.setName("OrigemCad");
        cbOrigemCad.setBounds(107, 126, 87, 20);
        pnPrincipal.add(cbOrigemCad);
        
        JButton btnOrigemAdd = new JButton();
        btnOrigemAdd.setText("ADC");
        btnOrigemAdd.setBounds(203, 123, 36, 23);
        btnOrigemAdd.setActionCommand("CriarOrigem");
        btnOrigemAdd.addActionListener(controller);
        pnPrincipal.add(btnOrigemAdd);

        JLabel lbOrigemCad = new JLabel();
        lbOrigemCad.setText("Origem:");
        lbOrigemCad.setBounds(10, 126, 87, 18);
        pnPrincipal.add(lbOrigemCad);

        cbProdServicosCad = new DefaultComboBox();
        cbProdServicosCad.setName("ServicosCad");
        cbProdServicosCad.setBounds(438, 126, 116, 20);
        pnPrincipal.add(cbProdServicosCad);
        
        JButton btnServicoAdd = new JButton();
        btnServicoAdd.setText("ADC");
        btnServicoAdd.setBounds(564, 123, 36, 23);
        btnServicoAdd.setActionCommand("CriarServico");
        btnServicoAdd.addActionListener(controller);
        pnPrincipal.add(btnServicoAdd);
        
        JLabel lbProdServicosCad = new JLabel();
        lbProdServicosCad.setText("Produtos/Servi\u00E7os:");
        lbProdServicosCad.setBounds(317, 126, 109, 17);
        pnPrincipal.add(lbProdServicosCad);
        
        cbCidade = new DefaultComboBox();
        cbCidade.setName("Cidade");
        cbCidade.setBounds(438, 276, 128, 20);
        pnPrincipal.add(cbCidade);

        btnPessoas = new JButton();
        btnPessoas.setActionCommand("Pessoas");
        btnPessoas.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnPessoas.setText("Pessoas");
        btnPessoas.setBounds(442, 340, 87, 23);
        btnPessoas.addActionListener(controller);
        pnPrincipal.add(btnPessoas);

        btnNegocios = new JButton();
        btnNegocios.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnNegocios.setText("Neg\u00F3cios");
        btnNegocios.setActionCommand("Negocios");
        btnNegocios.setBounds(345, 340, 90, 23);
        btnNegocios.addActionListener(controller);
        pnPrincipal.add(btnNegocios);

        JButton btTarefa = new JButton();
        btTarefa.setFont(new Font("Dialog", Font.PLAIN, 10));
        btTarefa.setBounds(59, 340, 115, 23);
		btTarefa.setText("Nova Tarefa");
        btTarefa.setName("Nova Tarefa");
        btTarefa.setActionCommand("Nova Tarefa");
        btTarefa.addActionListener(controller);
		pnPrincipal.add(btTarefa);
        
        btnHistorico = new JButton();
        btnHistorico.setActionCommand("Historico");
        btnHistorico.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnHistorico.setText("Historico");
        btnHistorico.setBounds(249, 340, 90, 23);
        btnHistorico.addActionListener(controller);
        pnPrincipal.add(btnHistorico);

        btnExcluir = new JButton();
        btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnExcluir.setText("Excluir");
        btnExcluir.setActionCommand("Excluir");
        btnExcluir.addActionListener(controller);
        btnExcluir.setBounds(438, 306, 90, 23);
        pnPrincipal.add(btnExcluir);

        pnAuxiliar = new JPanel();
        pnAuxiliar.setBackground(new Color(250, 250, 250));
        pnAuxiliar.setBounds(780, 260, 460, 363);
        jPanel1.add(pnAuxiliar);

        JScrollPane scrolAuxiliar = new JScrollPane();
        scrolAuxiliar.setBounds(0, 52, 450, 308);

        btEsconder = new JButton("Esconder");
        btEsconder.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btEsconder.setBounds(369, 11, 83, 23);
        btEsconder.setActionCommand("Esconder");
        btEsconder.addActionListener(controller);
        pnAuxiliar.setLayout(null);

        tbAuxiliar = new JTable();
        scrolAuxiliar.setViewportView(tbAuxiliar);
        pnAuxiliar.add(scrolAuxiliar);
        pnAuxiliar.add(btEsconder);
        ButtonGroup group = new ButtonGroup();


        JScrollPane scrollPrincipal = new JScrollPane();
        scrollPrincipal.setBounds(10, 107, 760, 142);
        jPanel1.add(scrollPrincipal);

        tbPrincipal = new JTable();
        tbPrincipal.addMouseListener(controller);
        scrollPrincipal.setViewportView(tbPrincipal);

        txBuscar = new JTextField();
        txBuscar.setActionCommand("Buscar");
        txBuscar.addKeyListener(controller);
        txBuscar.setBounds(74, 80, 139, 20);
        jPanel1.add(txBuscar);

        JLabel lbBuscar = new JLabel("Buscar");
        lbBuscar.setBounds(10, 83, 53, 14);
        jPanel1.add(lbBuscar);

        setBounds(0, 0, 1250, 660);
    }
}
