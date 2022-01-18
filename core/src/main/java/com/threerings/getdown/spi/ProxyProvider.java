/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threerings.getdown.spi;

/**
 *
 * @author therter
 */
public interface ProxyProvider {
    /** Configuration for a proxy server. */
    class Configuration {
        public final String host;
        public final int port;
        public final String domain;
        public final String username;
        public final String password;
        
        public Configuration (final String host, final int port, final String domain) {
            this(host, port, domain, null, null);
        }
        
        public Configuration (final String host, final Integer port, final String domain, final String username, final String password) {
            this.host = host;
            this.port = port;
            this.domain = domain;
            this.username = username;
            this.password = password;
        }
    }
    
    /**
     * Loads the proxy configuration for the app installed in {@code appDir}.
     */
    ProxyProvider.Configuration loadProxy (String appDir);

    /**
     * Saves the proxy configuration for the app installed in {@code appDir}.
     */
    void saveProxy (String appDir, String host, Integer port, String domain, String username, String password);
}
