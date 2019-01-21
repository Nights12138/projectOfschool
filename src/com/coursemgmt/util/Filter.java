package com.coursemgmt.util;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Filter implements javax.servlet.Filter{
	

	public FilterConfig config;    
    
    public void destroy() {    
        this.config = null;
        System.out.println("end do the logging filter!");
    }    
     
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {    
//        System.out.println("before the log filter!");    
//        // ������ת����HttpServletRequest ����    
//        HttpServletRequest hreq = (HttpServletRequest) req;  
//        // ��¼��־    
//        System.out.println("Log Filter�Ѿ��ػ��û�������ĵ�ַ:"+hreq.getServletPath() );    
//        try {    
//            // Filter ֻ����ʽ����������Ȼת����Ŀ�ĵ�ַ��    
//            chain.doFilter(req, res);    
//        } catch (Exception e) {    
//            e.printStackTrace();    
//        }    
//        System.out.println("after the log filter!"); 
    	chain.doFilter(req, res);    
    }    
     
    public void init(FilterConfig config) throws ServletException {    
        System.out.println("begin do the log filter!");
        this.config = config;    
    }

}
