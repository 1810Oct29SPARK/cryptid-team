package com.revature.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") //singleton would also be fine
public class LifecycleBean implements DisposableBean, InitializingBean{

	public LifecycleBean() {
	}

	// rest of my code does not ever call these methods,
	// that's up to the ApplicationContexts
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
	
	public void defaultInit() {
		System.out.println("custom init method");
	}
	
	public void defaultDestroy() {
		System.out.println("custom destroy");
	}
	
}
