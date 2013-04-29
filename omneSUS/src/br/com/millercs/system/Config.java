package br.com.millercs.system;

import br.com.millercs.language.Language;
import br.com.millercs.language.PT_BR;

public class Config {
	
	public static Language language = new PT_BR();
	private static String logo = "_assets/images/LOGO.png";
	private static String fullCompanyName = "MCS - Miller Consultoria e Serviços";
	private static String shortCompanyName = "Miller C.S.";
	private static String fullCompanySite = "http://www.millercs.com.br";


	public static String getLogo() {
		return logo;
	}

	public static void setLogo(String logo) {
		Config.logo = logo;
	}

	public static String getFullCompanyName() {
		return fullCompanyName;
	}

	public static void setFullCompanyName(String fullCompanyName) {
		Config.fullCompanyName = fullCompanyName;
	}

	public static String getShortCompanyName() {
		return shortCompanyName;
	}

	public static void setShortCompanyName(String shortCompanyName) {
		Config.shortCompanyName = shortCompanyName;
	}

	public static String getFullCompanySite() {
		return fullCompanySite;
	}

	public static void setFullCompanySite(String fullCompanySite) {
		Config.fullCompanySite = fullCompanySite;
	}

	

}
