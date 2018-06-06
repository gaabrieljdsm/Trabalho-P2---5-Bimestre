
package view;

import model.ConexaoJDBC;
        
public class Funcionarios extends javax.swing.JFrame {

    private ConexaoJDBC conx;
    private String codigo="";
    private int sexo=-1;
    
    
    private void carregarDados(){
         conx=new ConexaoJDBC();
        conx.getConection();
        setDados( conx.getDados());
    }
    public Funcionarios(){
        initComponents();
       carregarDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCampus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cboEstadoCivil = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        rdMasculino = new javax.swing.JRadioButton();
        rdFeminino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rdOutro = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAObservacao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCampus1 = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtSetor = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Email:");

        jLabel3.setText("Telefone:");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        cboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "1-Casado", "2-Solteiro", "3-Separado", "4-Divorciado", "5-União Estável", "6-Outro" }));
        cboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoCivilActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado Civil");

        rdMasculino.setText("Masculino");
        rdMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMasculinoActionPerformed(evt);
            }
        });

        rdFeminino.setText("Feminino");
        rdFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemininoActionPerformed(evt);
            }
        });

        jLabel5.setText("Sexo:");

        rdOutro.setText("Outro");
        rdOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOutroActionPerformed(evt);
            }
        });

        txtAObservacao.setColumns(20);
        txtAObservacao.setRows(5);
        jScrollPane1.setViewportView(txtAObservacao);

        jLabel6.setText("Observação:");

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Proximo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ultimo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Campus:");

        jLabel8.setText("Salario:");

        jLabel9.setText("Rua:");

        jLabel10.setText("Estado:");

        Cidade.setText("Cidade:");

        jLabel11.setText("Setor");

        txtCampus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampus1ActionPerformed(evt);
            }
        });

        jMenu3.setText("Menu");

        jMenuItem1.setText("Ex-Funcionarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Beneficios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefone)
                            .addComponent(txtEmail)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdFeminino)
                                .addGap(10, 10, 10)
                                .addComponent(rdOutro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado))
                            .addComponent(txtCampus1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir)
                                .addGap(47, 47, 47)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2)
                                .addGap(31, 31, 31)
                                .addComponent(jButton3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnPesquisar)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdMasculino)
                        .addComponent(rdFeminino)
                        .addComponent(rdOutro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCampus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cidade)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        
        System.out.println("Botão Inserir");
        String auxNome= this.txtNome.getText();
        String auxEmail= this.txtEmail.getText();
        String auxTelefone= this.txtTelefone.getText();
        int auxEstadoCivil =  this.cboEstadoCivil.getSelectedIndex();
        int auxsexo =  this.sexo;
        String auxCampus= this.txtCampus.getText();
        String auxSalario = this.txtSalario.getText();
        String auxRua= this.txtRua.getText();
        String auxCidade= this.txtCidade.getText();
        String auxEstado= this.txtEstado.getText();
        String auxObservacao= this.txtAObservacao.getText();
        String auxSetor = this.txtSetor.getText();
        
        
        
        
        if( isEmbranco(auxNome,"Nome") )return;
        if( isEmbranco(auxEmail,"Email") )return;
        if( isTelefone(auxTelefone)==false)return;
        if( auxsexo == 0){
            javax.swing.JOptionPane.showMessageDialog(null,"Escolha o Sexo");
        }
        if(auxEstadoCivil == 0){    
            javax.swing.JOptionPane.showMessageDialog(null,"Escolha o Estado Civil");
        }
        
       
//        if( isEmbranco(auxCampus,"Campus") )return;
        if( isEmbranco(auxSalario,"Salario") )return;
//        if( isEmbranco (auxCampus, "Campus")) return;
        if( isEmbranco(auxRua,"Rua") )return;
        if( isEmbranco(auxCidade,"Cidade") )return;
        
        
        
        conx.inserir( this.getDados() );
        this.carregarDados(); 
    }//GEN-LAST:event_btnInserirActionPerformed
   
    public boolean isNumber(String aux)
    {
        try{
          long auxi= Long.parseLong(aux);
        }catch(Exception e){
            System.out.println("erro:"+e);
            return false;
        }
        return true;
    }
    
   
     public boolean isTelefone(String aux){
        
       if( aux.indexOf("(")<0 ||aux.indexOf(")")<0||aux.indexOf("-")<0){  
           javax.swing.JOptionPane.showMessageDialog(null,"Telefone Inválido");
            return false;
       }
       
        if(aux.substring(aux.indexOf("(")+1,aux.indexOf(")")).length()<3){
             javax.swing.JOptionPane.showMessageDialog(null,"Telefone Inválido: DDD");
            return false;
        }
            
        
        if(aux.substring(aux.indexOf(")")+1,aux.indexOf("-")).length()< 4||aux.substring(aux.indexOf(")")+1,aux.indexOf("-")).length()>=6){
             javax.swing.JOptionPane.showMessageDialog(null,"Telefone Inválido: Antes do traço");
            return false;
        }
        
        if(
         aux.substring(aux.indexOf("-")+1,aux.length()).length()<4||aux.substring(aux.indexOf("-")+1,aux.length()).length()>5){
             javax.swing.JOptionPane.showMessageDialog(null,"Telefone Inválido: Após o traço");
            return false;
        }
       
       ////////////
       ///////////
       aux =  aux.replace("(", "");
       aux =  aux.replace(")", "");
       aux =  aux.replace("-", "");
       
       if(isNumber(aux)==false){
           javax.swing.JOptionPane.showMessageDialog(null,"Telefone Inválido");
           return false;
       }       
       if( aux.length() <8 || aux.length() > 12){
           javax.swing.JOptionPane.showMessageDialog(null,"Telefone Inválido");
           return false;
       }
       
       return true;
    }
    public boolean isEmbranco(String aux,String msg){
        if( aux.isEmpty()){    
           javax.swing.JOptionPane.showMessageDialog(null,"Campo "+msg+" Em Branco");
           return true;  
        }
        return false;
    }
    
    public boolean isEmail(String aux)
    {
       
        if( ((aux.indexOf("@")<0)||(aux.indexOf(".")<0)||(aux.indexOf(" ")>0))==false){ 
             return true;
        }
        javax.swing.JOptionPane.showMessageDialog(null,"Campo Email inválido");
        return false;
    }
    
   
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        System.out.println("Botão Editar");
        conx.update( this.getDados() );
        this.carregarDados();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        System.out.println("Botão Excluir");
        conx.remover(this.getDados() );
        this.carregarDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        System.out.println("Botão Pesquisar");
        String codigo=javax.swing.JOptionPane.showInputDialog("Digite o numero da matricula");
        if(conx.pesquisar(13, codigo)){
            setDados(conx.getDados());
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null,"Não encontrado");
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void rdMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMasculinoActionPerformed
        // TODO add your handling code here:
        this.rdFeminino.setSelected(false);
        this.rdOutro.setSelected(false);
        this.rdMasculino.setSelected(true);
        this.sexo = 1;
    }//GEN-LAST:event_rdMasculinoActionPerformed

    private void rdFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemininoActionPerformed
        // TODO add your handling code here:
        this.rdMasculino.setSelected(false);
        this.rdOutro.setSelected(false);
        this.rdFeminino.setSelected(true);
        this.sexo = 2;

     
    }//GEN-LAST:event_rdFemininoActionPerformed

    private void rdOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOutroActionPerformed
        // TODO add your handling code here:
        this.rdFeminino.setSelected(false);
        this.rdMasculino.setSelected(false);
        this.rdOutro.setSelected(true);
        this.sexo = 3;
     
    }//GEN-LAST:event_rdOutroActionPerformed

    
    public void setDados(String []dadosaux){
        
       
        for(int i=0; i< 13;i++)
            System.out.println(i+"-"+dadosaux[i]);
            
        this.txtNome.setText(dadosaux[0]);
        this.txtEmail.setText(dadosaux[1]);
        this.txtTelefone.setText(dadosaux[2]);  
        if(dadosaux[3].equals("")){
            this.cboEstadoCivil.setSelectedIndex(0);
        }
         else{    
            this.cboEstadoCivil.setSelectedIndex(Integer.parseInt(dadosaux[3]));
        }
        if(dadosaux[4].equals("1")){ 
            this.rdMasculino.setSelected(true);
            this.rdFeminino.setSelected(false); 
            this.rdOutro.setSelected(false);
        }
        else if(dadosaux[4].equals("2")){
            this.rdMasculino.setSelected(false);
            this.rdFeminino.setSelected(true);
            this.rdOutro.setSelected(false);
        }
        else if(dadosaux[4].equals("3")){
            this.rdMasculino.setSelected(false);
            this.rdFeminino.setSelected(false);
            this.rdOutro.setSelected(true);
        }
        else if(dadosaux[4].equals("")){
            this.rdMasculino.setSelected(false);
            this.rdFeminino.setSelected(false);
            this.rdOutro.setSelected(false);
        }
        this.txtCampus1.setText(dadosaux[5]);
        this.txtSalario.setText(dadosaux[6]);
        this.txtRua.setText(dadosaux[7]);
        this.txtCidade.setText(dadosaux[8]);
        this.txtEstado.setText(dadosaux[9]);
        this.txtAObservacao.setText(dadosaux[10]);
        this.txtSetor.setText(dadosaux[11]);
        this.codigo=dadosaux[12];
        
        // 3 , 6, 7, 8, 9
    }
    
    
     public String[] getDados(){
        String []dadosaux=new String[13];
        
        dadosaux[0]=this.txtNome.getText();
        dadosaux[1]=this.txtEmail.getText();
        dadosaux[2]=this.txtTelefone.getText();
        dadosaux[3]=this.cboEstadoCivil.getSelectedIndex()+"";
        dadosaux[4]=this.sexo+"";
        dadosaux[5]=this.txtAObservacao.getText();  
        dadosaux[6]=this.txtCampus.getText();   
        dadosaux[7]=this.txtSalario.getText();   
        dadosaux[8]=this.txtRua.getText();   
        dadosaux[9]=this.txtCidade.getText();   
        dadosaux[10]=this.txtEstado.getText();   
        dadosaux[11]=this.codigo+"";  
        dadosaux[11]=this.txtSetor.getText();  
             
        return dadosaux;        
    }
      
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String dados[]=new String[13];
        for(int i=0;i< 13;i++)
            dados[i]="";
        setDados(dados);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        conx.proximo();
        setDados( conx.getDados());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         conx.primeiro();
        setDados( conx.getDados());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         conx.anterior();
        setDados( conx.getDados());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         conx.ultimo();
        setDados( conx.getDados());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoCivilActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        exFuncionarios exFunc = new exFuncionarios();
        exFunc.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Beneficios BeneficiosFuncionarios = new Beneficios();
        BeneficiosFuncionarios.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtCampus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampus1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionarios().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cidade;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox cboEstadoCivil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdFeminino;
    private javax.swing.JRadioButton rdMasculino;
    private javax.swing.JRadioButton rdOutro;
    private javax.swing.JTextArea txtAObservacao;
    private javax.swing.JTextField txtCampus;
    private javax.swing.JTextField txtCampus1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSetor;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
