package com.tk2.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PropertyUtil {
    
    protected static Log logger = LogFactory.getLog(PropertyUtil.class);
    
    public static final String WINDOW_WIDTH = "tk2.window.width";
    public static final String WINDOW_HEIGHT = "tk2.window.height";
    
    private static Properties PROP_CONF = new Properties();
    
    static {
        try {
            PROP_CONF.load(new FileInputStream(Constant.SYS_PATH + "conf.properties"));
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
    
    private PropertyUtil() {}
    
    public static String getConfProperty(String key) {
        return PROP_CONF.getProperty(key, "300");
    }

}
