/**
 * author: Muhammad Haris
 * date: May 1, 2013
 * CSC-315 - Lab Project Course
 * SCIT- Beaconhouse National University
 */
package edu.ieee.lahoresection.ieeebnu.action;


import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * An abstract class representing Action for request processing
 * 
 */
public abstract class Action {

	public abstract String performAction(HttpServletRequest request,
			HttpServletResponse response, Connection connection)
			throws Exception;
}
