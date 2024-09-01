/* This class specifies the base path of the REST application */
/* COMMENTTOCODE */
package com.demo.rest;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestApplication extends Application {

}
/* ENDHOLE */