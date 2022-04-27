package com.rahul.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContext;

public class ParentContextLoaderListener extends ContextLoaderListener {


  @Override
  protected ApplicationContext loadParentContext(ServletContext servletContext) {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring-context.xml");
    return ctx;
  }

}