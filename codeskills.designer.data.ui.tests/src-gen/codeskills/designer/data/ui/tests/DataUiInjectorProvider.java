/*
 * generated by Xtext 2.10.0
 */
package codeskills.designer.data.ui.tests;

import codeskills.designer.data.ui.internal.DataActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class DataUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DataActivator.getInstance().getInjector("codeskills.designer.data.Data");
	}

}