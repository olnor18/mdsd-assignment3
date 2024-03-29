/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.validation;

import com.google.common.base.Objects;
import dk.sdu.mmmi.mdsd.math.ExternalUse;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MathValidator extends AbstractMathValidator {
  public static final String DUPLICATE_NAME = "duplicateName";
  
  public static final String INVALID_PARAMETERS = "invalidParameters";
  
  @Check
  public void cannotReasignGlobalVar(final MathExp mathexp) {
    final dk.sdu.mmmi.mdsd.math.Math root = EcoreUtil2.<dk.sdu.mmmi.mdsd.math.Math>getContainerOfType(mathexp, dk.sdu.mmmi.mdsd.math.Math.class);
    final Function1<MathExp, Boolean> _function = (MathExp it) -> {
      return Boolean.valueOf(((it != mathexp) && Objects.equal(it.getValue().getName(), mathexp.getValue().getName())));
    };
    int _size = IterableExtensions.size(IterableExtensions.<MathExp>filter(root.getLines(), _function));
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      this.error("Cannot assign global variable with same name", 
        MathPackage.Literals.MATH_EXP__VALUE, 
        MathValidator.DUPLICATE_NAME);
    }
  }
  
  @Check
  public void checkParameters(final ExternalUse externalUse) {
    int _size = externalUse.getRef().getArgsType().size();
    int _size_1 = externalUse.getParameters().size();
    boolean _tripleNotEquals = (_size != _size_1);
    if (_tripleNotEquals) {
      this.error("The parameters does not match the defined external", 
        MathPackage.Literals.EXTERNAL_USE__PARAMETERS, 
        MathValidator.INVALID_PARAMETERS);
    }
  }
}
