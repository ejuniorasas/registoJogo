package br.com.emporiodaarte.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.emporiodaarte.service.JogadorService;

public class RegistroJogoLoginInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	JogadorService jogador;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		jogador.
		return super.preHandle(request, response, handler);
	}
}
