package org.iocaste.session;

import org.iocaste.protocol.ClientServlet;
import org.iocaste.protocol.Iocaste;


public class CalculadoraServlet extends ClientServlet {
	private static final long serialVersionUID = -4620441321954972829L;

	protected void init(Iocaste iocaste) throws Exception {
		     
			int v1 = Integer.parseInt(getValue("v1"));
			int v2 = Integer.parseInt(getValue("v2"));
			String op = getValue("op");
			int resultado = 0;

	    	if (op.equals("+")){
	    		
	    		resultado = v1+v2;
	    		System.out.println(resultado);
	    		return;
	    	}
	    	if (op.equals("-")){
		   		resultado = v1-v2;
		   		System.out.println(resultado);
	    		return;
	    	}
	    	if (op.equals("*")){
	    		resultado = v1*v2;
	    		System.out.println(resultado);
	    		return;
	    	}
	    	if(op.equals("/")){
	    		resultado = v1/v2;
	    		System.out.println(resultado);
	    		return;
	    	}
	    				
	    	System.out.println("Operador Inválido");
	    		
	    	
	  }
}
