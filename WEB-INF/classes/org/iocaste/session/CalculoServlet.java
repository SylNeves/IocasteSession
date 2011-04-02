package org.iocaste.session;

import org.iocaste.protocol.ClientServlet;
import org.iocaste.protocol.Iocaste;

public class CalculoServlet extends ClientServlet {
	private static final long serialVersionUID = 6071666460176656097L;

	protected void init(Iocaste iocaste) throws Exception {
		
		System.out.println("to no servlet i");
		
		double an=Double.parseDouble(getValue("an"));
		double a1=Double.parseDouble(getValue("a1"));
		double r=Double.parseDouble(getValue("r"));
		double n=Double.parseDouble(getValue("n"));
		
		System.out.println(an);
		double resultado = iocaste.calculo(an,a1,r,n);
			
		
		System.out.println(resultado);
		
		System.out.println("to no servlet f");

	}
}
	
