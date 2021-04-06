package com.saeyan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

//�Ѳ����� ���� ������ ���ε��ϱ� ���� ���� p.538

@WebServlet("/upload.do")
public class MultiUploadServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String savePath = "upload";
		int size = 1024*1024*5 ;
		String encType = "UTF-8";
		
		ServletContext sc = getServletContext();
		String ufp = sc.getRealPath(savePath);
		
		try {
			MultipartRequest multi = new MultipartRequest(
					request, ufp, size, encType,
					new DefaultFileRenamePolicy()
			);
			Enumeration files = multi.getFileNames();
			
			while (files.hasMoreElements()) {
				
				String file = (String) files.nextElement();
				String file_name = multi.getFilesystemName(file);
				//�ߺ��� ������ ���ε��� ��� ���ϸ��� �ٲ��.
				String ori_file_name = multi.getOriginalFileName(file);
				
				out.println("<br> ���ε�� ���ϸ� : "+file_name);
				out.println("<br> ���� ���ϸ� : "+ori_file_name);
				out.println("<hr>");
			}//while end
		} catch (Exception e) { 
			System.out.println("���� �߻� : "+ e ); 
		}//catch end

	}//end

}//MultiUploadServlet class END
