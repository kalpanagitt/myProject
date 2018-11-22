package com.ms.calc;

import java.io.*;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet{
	double res;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServerException{
			PrintWriter out=response.getWriter();
			String val1=request.getParameter("txt1");
			String val2=request.getParameter("txt2");
			String mychoice=request.getParameter("choice");
			if(mychoice=="add"){
				res=new Calculator().Add(Integer.parseInt(val1),Integer.parseInt(val2));
				out.println(res);
			}
			else if(mychoice.equals("sub")){
				res=new Calculator().Sub(Integer.parseInt(val1),Integer.parseInt(val2));
				out.println(res);
			}
			else if(mychoice.equals("mul")){
				res=new Calculator().Mul(Integer.parseInt(val1),Integer.parseInt(val2));
				out.println(res);
			}
			else if(mychoice.equals("div")){
				res=new Calculator().Div(Integer.parseInt(val1),Integer.parseInt(val2));
				out.println(res);
			}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException{
		doPost(request, response);
	}
}