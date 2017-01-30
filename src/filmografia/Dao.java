package filmografia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

public class Dao {
	
	  private DataSource dataSource ;
	  private ServletContext sc ;
	  private InitialContext initCtx ;
	  private Connection conexion ;
	  String urlDataSource ;
	
	  
	  public Dao(ServletConfig config){
		  
		  	conexion = null ;
		   	ServletContext appContext = config.getServletContext();
	    	urlDataSource = (String) appContext.getInitParameter("URLDataSource");
	    	
	    	

		 
  
	try {
    	initCtx = new InitialContext();
    	dataSource = (DataSource) initCtx.lookup(urlDataSource);
	}
	catch(NamingException ne) {
		System.out.println("Error en servicio JNDI al intentar crear el contexto inicial del servlet o al buscar el datasource.");
	}

	
	  }
	
		

		
		public ResultSet consultar( String sqlSentencia , Connection conexion) throws SQLException{
			
			Statement st = null ;
			ResultSet rs = null;
			
			st = conexion.createStatement();
			rs = st.executeQuery(sqlSentencia);
			
				
			return rs ;
		}
		
		public Connection getConexion(DataSource dsdb , Connection conexion) {
			
			if (conexion == null)
				try {
					conexion = dsdb.getConnection();
				} catch (SQLException e) {


	       
	    }
		    return conexion;
		}
		
	    public void cierraConexion(Connection conexion){
	    	if (conexion != null)
	    		try{
	    			
	    			conexion.close();
	    		}catch (SQLException e){
	    			
	    		}
	    	
	    	
	    }

	    
	    
	    public Usuario getUsuario(){
	    	
	    	
	    	
	    	
	    }
	    

}
