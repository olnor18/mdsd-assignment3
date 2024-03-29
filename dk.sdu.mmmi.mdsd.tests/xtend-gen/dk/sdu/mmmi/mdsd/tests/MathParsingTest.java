/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.tests;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.MathExp;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MathInjectorProvider.class)
@SuppressWarnings("all")
public class MathParsingTest {
  @Inject
  @Extension
  private ParseHelper<dk.sdu.mmmi.mdsd.math.Math> _parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 42");
      final dk.sdu.mmmi.mdsd.math.Math result = this._parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final Consumer<MathExp> _function = (MathExp line) -> {
        final EList<Resource.Diagnostic> errors = line.eResource().getErrors();
        boolean _isEmpty = errors.isEmpty();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Unexpected errors: ");
        String _join = IterableExtensions.join(errors, ", ");
        _builder_1.append(_join);
        Assertions.assertTrue(_isEmpty, _builder_1.toString());
      };
      result.getLines().forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void number() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void simpleAddition() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void threeNumbersAddition() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void subtraction() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void subtractionNonCommutative() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void threeNumbersSubtraction() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void additionAndSubtraction() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void multiplication() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void threeNumbersMultiplication() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void division() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void divisionNonCommutative() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void threeNumbersDivision() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void multiplicationAndDivision() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void multipleVariables() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void parenthesis() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void precedence() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void letNumber() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void letNumberExpression() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void nestedLet() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void letVariableShadowing() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void referenceSingleVar() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void referenceExpressionVar() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void letUseGlobalVariableBody() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void letUseGlobalVariableBinding() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void letUseGlobalVariableShadowing() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void letUseGlobalVariableBindingSameName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field compute is undefined for the type Math"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
}
