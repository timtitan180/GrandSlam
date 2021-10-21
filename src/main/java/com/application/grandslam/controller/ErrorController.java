//package com.application.grandslam.controller;
//
//import org.apache.tomcat.util.ExceptionUtils;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//@ControllerAdvice
//	public class ErrorController {
//		@RequestMapping(value = "/error/404")
//		public String error404(HttpServletRequest request) {
//			String origialUri = (String) request.getAttribute("javax.servlet.forward.request_uri");
//			System.out.println("Requested URL not found : " + request.getMethod() + " " + origialUri);
//		return "error/404";
//		}
//		@ExceptionHandler(Exception.class)
//		public ModelAndView handleAllException(HttpServletRequest request, Exception ex) {
//			System.out.println("Error page exception : " + getRequestURL(request));
//			ex.printStackTrace();
//			ModelAndView result = new ModelAndView("/error/500");
//			String stackTrace = getHTMLStackTrace(stack);
//			result.addObject("message", ex.getMessage());
//			result.addObject("stackTrace", stackTrace);
//			return result;
//		}
//		private String getHTMLStackTrace(String[] stack) {
//            StringBuffer result = new StringBuffer();
//            for (String frame : stack) {
//                if (frame.contains("com")) {
//                    result.append(" &nbsp; &nbsp; &nbsp;" + frame.trim().substring(3) + "<br>\n");
//                } else if (frame.contains("Caused by:")) {
//                    result.append("Caused By:<br>");
//                }
//            }
//
//            return result.toString();
//		}
//		private String getRequestURL(HttpServletRequest request) {
//			String result = request.getRequestURL().toString();
//			if (request.getQueryString() != null) {
//			result = result + "?" + request.getQueryString();
//			}
//			return result;
//		}
//	@ExceptionHandler(Exception.class)
//	public void handleAllExceptions(Exception ex) {
//		ex.printStackTrace();
//}
//}
