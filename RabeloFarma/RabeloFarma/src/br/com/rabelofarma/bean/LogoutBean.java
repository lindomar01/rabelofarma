package br.com.rabelofarma.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean(name = "MBLogout")
@SessionScoped
public class LogoutBean {
	
	public LogoutBean() {
	}

	public String doLogout() {
		HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		sessao.invalidate();

		return "/pages/sobre.xhtml?faces-redirect=true";

	}

}
