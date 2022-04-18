package dk.sdu.mmmi.mdsd.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MathInjectorProvider.class)
@SuppressWarnings("all")
public class MathExampleTest {
  @Inject
  @Extension
  private ParseHelper<dk.sdu.mmmi.mdsd.math.Math> _parseHelper;
  
  @Test
  public void mathematicalOperations() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void letAndScope() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void evilExample() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
}
