package com.tecsup.lab6JSF.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigation2Ctrl", eager = true)
@RequestScoped
public class Navigation2Ctrl implements Serializable {

	public String processPage1 () {
		return "page";
	}

	public String processPage2 () {
		return "page";
	}

}
