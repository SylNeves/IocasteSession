package org.iocaste.session;

import org.iocaste.protocol.ClientServlet;
import org.iocaste.protocol.Iocaste;

public class CadastroServlet extends ClientServlet {
	private static final long serialVersionUID = 2055246609363449009L;
	
	 protected void init(Iocaste iocaste) throws Exception {
		    
		 	String usuario = getValue("usuario");
	        String senha = getValue("senha");
	                 
	        
	    	if (iocaste.cadastro(usuario, senha)== true)
	    	{
	    		redirect("sucesso.html");
	    	}
	    	else
	    	{
	    		redirect("falha.html");
	    	}
	    } 
		
	 

}
