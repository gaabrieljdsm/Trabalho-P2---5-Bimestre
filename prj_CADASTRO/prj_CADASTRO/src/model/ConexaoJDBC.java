package model;

import java.sql.*;

public class ConexaoJDBC {
   private Connection con;
   public Connection getConection()
   {
       try {
           //Class.forName("com.mysql.jdbc.Driver").newInstance();
           
           con =DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/clientes?user=root&password=");
       }
       
       catch(SQLException ex){  
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());  
       }
       catch (Exception cc) {
           System.out.println("Erro novo:"+cc.getMessage());  
       }
       
       return con;
   }
   
   private Statement stm=null;
   private ResultSet resultado=null;
   
   
   public String[] getDados(){
       String dados[]=new String[13];
       
       try{
           if(stm == null)
           {
               stm=con.createStatement();           
               resultado = stm.executeQuery("Select * from cadastro");
               resultado.next();
           }
           for(int i=0; i< 13;i++)
           dados[i]=resultado.getString(i+1);
           return dados; 
       }catch(Exception e){           
           System.out.println("Erro:"+e);       
       }
       
       return null;
   }
    
   public void proximo(){
       try{
           if(resultado==null || resultado.isLast()) {
               return;
           }
            resultado.next();
       }catch(Exception e)
       {System.out.println("Erro:"+e);   }
   }
   
      
    
  private int getLastCodigo(){ 
      int codigo=1;
       try{           
            this.resultado.last();
            codigo=this.resultado.getInt(13)+1;
            this.resultado.beforeFirst();
       }catch(Exception e){System.out.println("Erro:"+e);}
      return codigo;
  }
   public void inserir(String aux[]){
       String sql="Insert into cadastro values ("
               +"'"+aux[0]+"',"
               +"'"+aux[1]+"',"
               +"'"+aux[2]+"',"
               +""+aux[3]+","
               +""+aux[4]+","
               +"'"+aux[5]+"',"
               +"'"+aux[6]+"',"
               +"'"+aux[7]+"',"
               +"'"+aux[8]+"',"
               +""+aux[9]+","
               +""+aux[10]+","
               +"'"+aux[11]+"',"
               +"'"+aux[12]+"',"
               +""+getLastCodigo()
               +")";
       this.executar(sql);
   }
   public void remover(String aux[])   {
        String sql="Delete from cadastro "              
               +" where codigo="+aux[12] + ";";               
       this.executar(sql);
       
   }
   public void update(String aux[])   {
       String sql="Update  cadastro SET "
               +" nome='"+aux[0]+"',"
               +" email='"+aux[1]+"',"
               +" telefone='"+aux[2]+"',"
               +" estadocivil="+aux[3]+","
               +"sexo="+aux[4]+","  
               +"campus='"+aux[5]+"',"
               +"salario="+aux[6]+"," 
               +"rua='"+aux[7]+"',"
               +"cidade='"+aux[8]+"',"
               +"estado='"+aux[9]+","
               +"observacao='"+aux[10]+"', "
               +" where codigo="+aux[11] + ";";
                this.executar(sql);
       
   }
//
//   public void updateCampus(String aux[])
//   {
//       String sql="Update  cadastro SET "
//               +" nome='"+aux[0]+"',"
//               +" email='"+aux[1]+"',"
//               +" telefone='"+aux[2]+"',"
//               +" estadocivil="+aux[3]+","
//               +"sexo="+aux[4]+","
//               +"observacao='"+aux[5]+"' "
//               +" where codigo="+aux[6] + ";";
//
//       this.executar(sql);
//
//   }
   public boolean  pesquisar(int campo, String dados)   {       
       try{
           
           resultado.beforeFirst();
           while(resultado.next()){
               if(resultado.getString(campo).equals(dados))
               {   getDados();
                   return true;
               }
           }
       
       }catch(Exception e){ 
           System.out.println("Erro:"+e);
       }       
       
       return false;
   }
   private void executar(String sql)
   {
       
         try{      
              stm.execute(sql); 
              stm=null;
              this.getDados();
             
          
       }catch(Exception e){
           System.out.println("Erro:"+e);
       } 
   }
   public void anterior()
   {
       try{
           if(resultado==null)
               return;
            resultado.previous();
       }catch(Exception e){
           System.out.println("Erro:"+e);   
       }
   }
   public void ultimo()
   {
       try{
           if(resultado==null)
               return;
            resultado.last();
       }catch(Exception e){
           System.out.println("Erro:"+e);   
       }
   }
   
   public void primeiro()
   {
       try{
           if(resultado==null)
               return;
            resultado.first();
       }catch(Exception e){
           System.out.println("Erro:"+e);   
       }
   }
   
}
