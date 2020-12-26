package emppack;

import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:ORCL");
		cfg.setProperty("hibernate.connection.username","system");
		cfg.setProperty("hibernate.connection.password","tiger");
	}
}
