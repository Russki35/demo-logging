/**
 * 
 */
package dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dev.service.AppService;



/**
 * @author ETY8
 *
 */
public class App {

	private static final Logger LOG = LoggerFactory.getLogger("dev.console");
	
	public static void main(String[] args) {
		
	LOG.info("Bonjour Slf4J !");
	LOG.info("Implémentation Logback");
	new AppService().executer("valeur 1");
	
	}
}
