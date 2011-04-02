package org.iocaste.session;

import org.iocaste.protocol.ClientServlet;
import org.iocaste.protocol.Iocaste;


public class SessionServlet extends ClientServlet {
   	private static final long serialVersionUID = -3744716046492067149L;

	@Override
    protected void init(Iocaste iocaste) throws Exception {
    
    String op = getValue("op");
    
    	if (op.equals("1")){
    		redirect("cadastro.html");
    	}
    	if (op.equals("2")){
    		redirect("/iocaste-login/index.html");
    	}
    	if (op.equals("3")) {
    		System.out.println(iocaste.versao());
    		redirect("pagina2.html");
    	} 
    	if (op.equals("4")){
        	redirect("calc.html");
    	}
    	if (op.equals("5")){
        	redirect("PA.html");
    	}
    	
    		
    	
    

    }
    
}
