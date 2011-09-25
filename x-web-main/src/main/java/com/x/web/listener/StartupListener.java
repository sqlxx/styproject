/**
 * 
 */
package com.x.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.x.web.constant.Constants;

/**
 * @author sqlxx
 *
 */
public class StartupListener implements ServletContextListener {

    /* (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // nothing

    }

    /* (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.setProperty(Constants.SINA_CONSUMER_KEY, Constants.SINA_CONSUMER_KEY_VALUE);
        System.setProperty(Constants.SINA_CONSUMER_SECRET, Constants.SINA_CONSUMER_SECRET_VALUE);

    }

}
