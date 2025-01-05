/*
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.springgen.ui.internal.SpringgenActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SpringGenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(SpringgenActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		SpringgenActivator activator = SpringgenActivator.getInstance();
		return activator != null ? activator.getInjector(SpringgenActivator.ORG_XTEXT_EXAMPLE_SPRINGGEN_SPRINGGEN) : null;
	}

}
