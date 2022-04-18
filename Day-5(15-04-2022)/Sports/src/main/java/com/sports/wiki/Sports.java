package com.sports.wiki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/wiki")
public class Sports extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out=res.getWriter();
		out.println("<html><head><h1>");
		out.println("Cricket and Football Wikipedia</h1>");
		out.println("<i>Sport pertains to any form of competitive physical activity or game that aims to use,"
				+ " maintain or improve physical ability and skills while providing enjoyment to participants and,"
				+ " in some cases, entertainment to spectators. Sports can, through casual or organized participation, "
				+ "improve one's physical health. Hundreds of sports exist, from those between single contestants, through to those"
				+ " with hundreds of simultaneous participants, either in teams or competing as individuals. In certain sports such as racing,"
				+ " many contestants may compete, simultaneously or consecutively, with one winner; in others, the contest (a match) is between two sides,"
				+ " each attempting to exceed the other. Some sports allow a \"tie\" or \"draw\", in which there is no single winner; others provide tie-breaking methods "
				+ "to ensure one winner and one loser. A number of contests may be arranged in a"
				+ "tournament producing a champion. Many sports leagues make an annual champion by arranging games in a regular sports season, followed in some cases by playoffs.</i>");
		out.println("</head></html>");
		
	}

	
}
